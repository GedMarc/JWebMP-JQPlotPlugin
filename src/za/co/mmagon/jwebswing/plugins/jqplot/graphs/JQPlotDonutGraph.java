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

import com.fasterxml.jackson.annotation.*;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.graphs.display.JQPlotDonutGroup;
import za.co.mmagon.jwebswing.plugins.jqplot.graphs.display.JQPlotPieSlice;
import za.co.mmagon.jwebswing.plugins.jqplot.options.JQPlotOptions;
import za.co.mmagon.jwebswing.plugins.jqplot.options.series.JQPlotSeriesDonutOptions;

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
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ComponentInformation(name = "Donut Graph",
		description = "A donut graph",
		url = "http://www.jqplot.com/examples/pie-donut-charts.php")

public class JQPlotDonutGraph<J extends JQPlotDonutGraph<J>>
		extends JQPlotGraph<JQPlotOptions, J>
{
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private JQPlotSeriesDonutOptions donutOptions;

	@JsonIgnore
	private JQPlotDonutGroup donutGroup;

	public JQPlotDonutGraph()
	{
		donutOptions = new JQPlotSeriesDonutOptions(this);
		getOptions().getSeriesDefaults().setRendererOptions(donutOptions);
		donutGroup = new JQPlotDonutGroup();
	}

	/**
	 * Returns the plot lines on this graph
	 *
	 * @param donutGroup
	 *
	 * @return
	 */
	public List<JQPlotPieSlice> getPlotSlices(int donutGroup)
	{
		List<JQPlotPieSlice> arr = getDonutGroup().get(donutGroup);
		if (arr == null)
		{
			getDonutGroup().add(donutGroup, arr);
		}

		return getDonutGroup().get(donutGroup);
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param doubleGroup
	 * 		the donut group number to assign towards
	 * @param name
	 * @param values
	 *
	 * @return
	 */
	public JQPlotPieSlice addSlice(int doubleGroup, String name, double values)
	{
		JQPlotPieSlice slice = new JQPlotPieSlice(name, values);
		getDonutGroupSlices(doubleGroup).add(slice);
		return slice;
	}

	/**
	 * Keep Group Number In oRder. if number is not in the size list, array list index out of bounds or
	 *
	 * @param groupNumber
	 *
	 * @return
	 */
	public List<JQPlotPieSlice> getDonutGroupSlices(int groupNumber)
	{
		if (getDonutGroup().size() >= groupNumber)
		{
			List<JQPlotPieSlice> newList = new ArrayList<>();
			getDonutGroup().add(newList);
		}
		return getDonutGroup().get(groupNumber);
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param doubleGroup
	 * 		The group to add the pie values to
	 * @param values
	 * 		An array of x,y values continual
	 *
	 * @return
	 */
	public List<JQPlotPieSlice> addSlices(int doubleGroup, double[] values)
	{
		List<JQPlotPieSlice> newSlices = getDonutGroupSlices(doubleGroup);
		for (int i = 0; i < values.length; i++)
		{
			double value = values[i];
			JQPlotPieSlice slice = new JQPlotPieSlice("Slice " + i, value);
			newSlices.add(slice);
		}

		return newSlices;
	}

	/**
	 * The donut options
	 *
	 * @return
	 */
	public JQPlotSeriesDonutOptions getDonutOptions()
	{
		return donutOptions;
	}

	/**
	 * The donut options
	 *
	 * @param donutOptions
	 */
	public void setDonutOptions(JQPlotSeriesDonutOptions donutOptions)
	{
		this.donutOptions = donutOptions;
	}

	/**
	 * Returns a specific donut group. Rendered as [] in
	 *
	 * @return
	 */
	@JsonRawValue
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	public List<List<JQPlotPieSlice>> getDonutGroupJSON()
	{
		return getDonutGroup();
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
		String jsonInString;
		jsonInString = getDonutGroupJSON().toString();
		sb.append(jsonInString);

		return sb;
	}

	public List<List<JQPlotPieSlice>> getDonutGroup()
	{
		if (this.donutGroup == null)
		{
			donutGroup = new JQPlotDonutGroup();
		}
		return this.donutGroup.getDonutGroup();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQPlotDonutGraph))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQPlotDonutGraph<?> that = (JQPlotDonutGraph<?>) o;

		if (getDonutOptions() != null ? !getDonutOptions().equals(that.getDonutOptions()) : that.getDonutOptions() != null)
		{
			return false;
		}
		return getDonutGroup() != null ? getDonutGroup().equals(that.getDonutGroup()) : that.getDonutGroup() == null;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
