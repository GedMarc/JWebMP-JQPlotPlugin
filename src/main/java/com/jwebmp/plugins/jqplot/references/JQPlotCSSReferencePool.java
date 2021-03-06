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
package com.jwebmp.plugins.jqplot.references;

import com.jwebmp.core.base.references.CSSReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum JQPlotCSSReferencePool
{

	GraphCore(new CSSReference("jqPlot", 1.08, "bower_components/jqplot-jwebswing/jquery.jqplot.css", "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.8/jquery.jqplot.css"));

	private final CSSReference reference;

	JQPlotCSSReferencePool(CSSReference reference)
	{
		this.reference = reference;

	}

	public CSSReference getReference()
	{
		return reference;
	}

}
