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
package com.jwebmp.plugins.jqplot.options.axis;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.plugins.jqplot.graphs.JQPlotBarGraph;
import com.jwebmp.plugins.jqplot.options.ticks.JQPlotTickOptionsAxisTick;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotAxisDateRendererOptionsTest
{

	public JQPlotAxisDateRendererOptionsTest()
	{
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testDateOnAxis()
	{
		JQPlotBarGraph graph = new JQPlotBarGraph(Orientation.VERTICAL);
		JQPlotAxisOptions axis = new JQPlotAxisOptions(graph);

		JQPlotAxisDateRendererOptions dateRender = new JQPlotAxisDateRendererOptions(graph);

		axis.setRendererOptions(dateRender);
		axis.setMin(5);
		JQPlotTickOptionsAxisTick.class.cast(axis.getTickRendererOptions())
		                               .setFormatString("%b %#d, %#I %p");

		System.out.println(axis);
	}

}
