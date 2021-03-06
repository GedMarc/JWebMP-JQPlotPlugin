/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotBar;
import com.jwebmp.plugins.jqplot.options.axis.JQPlotAxisLabelRendererOptionsCategoryLabels;
import com.jwebmp.plugins.jqplot.parts.YAxisTypes;

import java.util.List;

/**
 * Constructs a new JQPlotBar Graph default series display
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 09 Aug 2015
 */
@ComponentInformation(name = "Waterfall Graph",
		description = "A waterfall graph",
		url = "http://www.jqplot.com/examples/waterfall.php")
public class JQPlotBarWaterFallGraph
		extends JQPlotBarGraph<JQPlotBarWaterFallGraph>
{
	/**
	 * Constructs a new JQPlotBar Graph default waterfall graph
	 * <p>
	 *
	 * @param orientation
	 * 		Vertical or Horizontal. Configures where to apply the Tick Renderer. Don't ever make this null
	 */
	public JQPlotBarWaterFallGraph(Orientation orientation)
	{
		super(orientation);
		setOrientation(orientation);
		setWaterfall(true);
		getOptions().getSeriesDefaults()
		            .setRendererOptions(barGraphOptions);

		getBarGraphOptions().setWaterfall(true);
		getBarGraphOptions().setVaryBarColor(true);

		getOptions().getSeriesDefaults()
		            .getPointLabels()
		            .setHideZeros(true);

		getOptions().getSeriesDefaults()
		            .setYaxis(YAxisTypes.Y2Axis);

		getOptions().getAxes()
		            .getxAxis()
		            .setRendererOptions(new JQPlotAxisLabelRendererOptionsCategoryLabels(this));

	}

	@Override
	public void preConfigure()
	{
		super.preConfigure();
		getBarGraphOptions().setFillToZero(null);
	}

	/**
	 * Adds a new bar for cluster graphs for each bar value to have a series name
	 *
	 * @param xAxisName
	 * 		The tick or category value
	 * @param BarName
	 * 		The yAxis Value
	 * @param barValue
	 * 		The actual bar value
	 * 		<p>
	 */
	@Override
	public void addBar(String xAxisName, String BarName, Double barValue)
	{
		JQPlotBar bar = new JQPlotBar(xAxisName, BarName, barValue);
		setClustered(true);
		bar.setClustered(true);
		addBar(bar);
	}

	/**
	 * Adds a new bar and x Axis to the 0 bar group
	 * <p>
	 *
	 * @param bar
	 * 		The bar to add to the bar group 0
	 */
	@Override
	public void addBar(JQPlotBar bar)
	{
		List<JQPlotBar> bars = getBarGroup(bar.getxAxisValue());
		bars.add(bar);
		bar.setWaterfall(true);
		getCategoryTickValues().add(bar.getxAxisValue());
	}

	/**
	 * Adds a new bar and category to the 0 bar group number for waterfall standard graphs
	 * <p>
	 *
	 * @param xAxisName
	 * 		The tick or category value
	 * @param startingPoint
	 * 		The starting point for a bar
	 * @param barValue
	 * 		The actual bar value
	 */
	@Override
	public void addBar(String xAxisName, Double startingPoint, Double barValue)
	{
		JQPlotBar bar = new JQPlotBar(xAxisName, startingPoint, barValue);
		barGraphOptions.setWaterfall(true);
		setWaterfall(true);
		addBar(bar);
	}

	/**
	 * Adds a new bar and category to the 0 bar group number for waterfall clustered graphs
	 * <p>
	 *
	 * @param xAxisName
	 * 		The tick or category value
	 * @param BarName
	 * 		The yAxis Value
	 * @param startingPoint
	 * 		The starting point for a bar
	 * @param barValue
	 * 		The actual bar value
	 */
	@Override
	public void addBar(String xAxisName, String BarName, Double startingPoint, Double barValue)
	{
		JQPlotBar bar = new JQPlotBar(xAxisName, BarName, startingPoint, barValue);
		barGraphOptions.setWaterfall(true);
		setWaterfall(true);
		addBar(bar);
	}

	/**
	 * Adds a new bar and category to the 0 bar group number
	 *
	 * @param XAxisValue
	 * 		The tick or category value
	 * @param dataValue
	 * 		The yAxis Value
	 * 		<p>
	 */
	public void addBar(String XAxisValue, Double dataValue)
	{
		JQPlotBar bar = new JQPlotBar(XAxisValue, dataValue);
		bar.setWaterfall(true);
		addBar(bar);
	}

}
