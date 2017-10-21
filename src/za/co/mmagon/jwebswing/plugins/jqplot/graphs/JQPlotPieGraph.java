/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqplot.graphs;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.graphs.display.JQPlotPieSlice;
import za.co.mmagon.jwebswing.plugins.jqplot.options.JQPlotOptions;
import za.co.mmagon.jwebswing.plugins.jqplot.options.series.JQPlotSeriesPieOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * The line graph implementation
 *
 * @param <J>
 *
 * @author mmagon
 * @since 2014/07/08
 */
@ComponentInformation(name = "Pie Graph",
		description = "A pie graph",
		url = "http://www.jqplot.com/examples/pieTest.php")
public class JQPlotPieGraph<J extends JQPlotPieGraph<J>> extends JQPlotGraph<JQPlotOptions, J>
{

	private static final long serialVersionUID = 1L;

	private List<JQPlotPieSlice> plotSlices;

	public JQPlotPieGraph()
	{
		getOptions().getSeriesDefaults().setRendererOptions(new JQPlotSeriesPieOptions(this));
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 * <p>
	 */
	public List<JQPlotPieSlice> addSlices(double[] values)
	{
		ArrayList<JQPlotPieSlice> output = new ArrayList<>();
		String s = "Slice ";
		for (int i = 0; i < values.length; i++)
		{
			double value = values[i];
			JQPlotPieSlice slice = new JQPlotPieSlice(s + i + 1, value);
			getPlotSlices().add(slice);
		}

		return output;
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 * <p>
	 */
	public JQPlotPieSlice addSlice(String name, double values)
	{
		JQPlotPieSlice slice = new JQPlotPieSlice(name, values);
		getPlotSlices().add(slice);
		return slice;
	}

	/**
	 * Returns the plot lines on this graph
	 *
	 * @return
	 */
	public List<JQPlotPieSlice> getPlotSlices()
	{
		if (plotSlices == null)
		{
			plotSlices = new ArrayList<>();
		}
		return plotSlices;
	}

	/**
	 * 3 Bracket start
	 *
	 * @return
	 */
	@Override
	protected StringBuilder getDataPointRender()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[[");
		for (JQPlotPieSlice plotLine : getPlotSlices())
		{
			sb.append(plotLine).append(",");
			sb.append("");
		}
		sb = sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append("]]");
		return sb;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQPlotPieGraph))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQPlotPieGraph<?> that = (JQPlotPieGraph<?>) o;

		return getPlotSlices() != null ? getPlotSlices().equals(that.getPlotSlices()) : that.getPlotSlices() == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getPlotSlices() != null ? getPlotSlices().hashCode() : 0);
		return result;
	}
}
