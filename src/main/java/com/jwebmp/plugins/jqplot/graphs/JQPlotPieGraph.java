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
package com.jwebmp.plugins.jqplot.graphs;

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotPieSlice;
import com.jwebmp.plugins.jqplot.options.JQPlotOptions;
import com.jwebmp.plugins.jqplot.options.series.JQPlotSeriesPieOptions;

import java.util.ArrayList;
import java.util.List;

import static com.jwebmp.core.utilities.StaticStrings.*;

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
public class JQPlotPieGraph<J extends JQPlotPieGraph<J>>
		extends JQPlotGraph<JQPlotOptions, J>
{

	private static final long serialVersionUID = 1L;

	private List<JQPlotPieSlice> plotSlices;

	public JQPlotPieGraph()
	{
		getOptions().getSeriesDefaults()
		            .setRendererOptions(new JQPlotSeriesPieOptions(this));
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
			sb.append(plotLine)
			  .append(STRING_COMMNA);
		}
		sb = sb.deleteCharAt(sb.lastIndexOf(STRING_COMMNA));
		sb.append("]]");
		return sb;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
