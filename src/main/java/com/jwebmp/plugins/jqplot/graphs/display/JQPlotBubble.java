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

import com.jwebmp.core.utilities.StaticStrings;

import java.io.Serializable;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_COMMNA;
import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_DOUBLE_QUOTES;
import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * A specific bubble for the JQ Plot Library
 *
 * @author GedMarc
 * @since 29 Feb 2016
 */
public class JQPlotBubble
		implements JQPlotSeriesItem, Serializable
{


	private double x;
	private double y;
	private int radius;
	private String label;

	/**
	 * Constructs a new Graph Bubble
	 *
	 * @param x
	 * 		The X Position
	 * @param y
	 * 		The Y Position
	 * @param radius
	 * 		The Radius of the Bubble
	 * @param label
	 * 		The Label of the Bubble - Optional
	 */
	public JQPlotBubble(double x, double y, int radius, String label)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.label = label;
	}

	/**
	 * Returns a [] Plot Bubble
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return "[" + getX().intValue() + STRING_COMMNA + getY().intValue() + STRING_COMMNA + getRadius() + ",\"" + getLabel() + STRING_DOUBLE_QUOTES + "]";
	}

	/**
	 * Gets the X Position
	 *
	 * @return
	 */
	public Double getX()
	{
		return x;
	}

	/**
	 * Sets the X Position
	 *
	 * @param x
	 */
	public void setX(double x)
	{
		this.x = x;
	}

	/**
	 * Gets the Y Position
	 *
	 * @return
	 */
	public Double getY()
	{
		return y;
	}

	/**
	 * Sets the Y Position
	 *
	 * @param y
	 */
	public void setY(double y)
	{
		this.y = y;
	}

	/**
	 * Gets the radius of the bubble
	 *
	 * @return
	 */
	public Integer getRadius()
	{
		return radius;
	}

	/**
	 * Sets the radius of the bubble
	 *
	 * @param radius
	 */
	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	/**
	 * Gets the label
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label
	 *
	 * @param label
	 */
	public void setLabel(String label)
	{
		this.label = label;
	}
}
