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
package com.jwebmp.plugins.jqplot.graphs.display;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * Container Class for Donut Pie Groupings
 *
 * @author GedMarc
 * @since 05 Mar 2016
 */
public class JQPlotDonutGroup
		extends JavaScriptPart
{


	private List<List<JQPlotPieSlice>> donutGroup;

	/**
	 * The donut group
	 */
	public JQPlotDonutGroup()
	{
		//Nothing Needed
	}

	/**
	 * Returns a specific donut group. Rendered as [] in
	 *
	 * @return
	 */
	public List<List<JQPlotPieSlice>> getDonutGroup()
	{
		if (donutGroup == null)
		{
			donutGroup = new ArrayList<>();
		}
		return donutGroup;
	}

	/**
	 * Sets the specific donut group
	 *
	 * @param donutGroup
	 */
	public void setDonutGroup(List<List<JQPlotPieSlice>> donutGroup)
	{
		this.donutGroup = donutGroup;
	}

	public List<JQPlotPieSlice> getDonutGroupSlices(int groupNumber)
	{
		if (donutGroup == null)
		{
			donutGroup = new ArrayList<>();
			if (donutGroup.size() < groupNumber)
			{
				donutGroup.add(groupNumber, new ArrayList<>());
			}
		}
		return donutGroup.get(groupNumber);
	}

}
