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
package com.jwebmp.plugins.jqplot.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.MarkerStyles;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotMarkerRenderer;

import javax.validation.constraints.NotNull;

/**
 * The specific marker options available
 *
 * @author mmagon
 */
public class JQPlotMarkerOptions<J extends JQPlotMarkerOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotMarkerRenderer
{


	/**
	 * whether to show data point markers.
	 */
	private Boolean show;
	/**
	 * The default style of the marker
	 */
	private MarkerStyles style;
	/**
	 * width of the stroke drawing the marker.
	 */
	private Integer lineWidth;
	/**
	 * size (diameter, edge length, etc.) of the marker.
	 */
	private Integer size;
	/**
	 * color of marker, set to color of line by default.
	 */
	private String color;
	/**
	 * whether to draw shadow on marker or not.
	 */
	private Boolean shadow;
	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private Integer shadowAngle;
	/**
	 * The offset of the shadow from the marker
	 */
	private Integer shadowOffset;
	/**
	 * Number of strokes to make when drawing shadow.
	 * Each stroke offset by shadowOffset from the last.
	 */
	private Integer shadowDepth;
	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;

	/**
	 * Renderer that will draws the shadows on the marker.
	 */
	private JavaScriptPart shadowRenderer;
	/**
	 * Renderer that will draw the marker.
	 */
	private JavaScriptPart shapeRenderer;

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * Constructs a new instance of the Marker Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotMarkerOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * whether or not to show the marker.
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * whether or not to show the marker.
	 *
	 * @param show
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShow(Boolean show)
	{
		this.show = show;
		return (J) this;
	}

	/**
	 * One of diamond, circle, square, x, plus, dash, filledDiamond, filledCircle, filledSquare
	 *
	 * @return
	 */
	public MarkerStyles getStyle()
	{
		return style;
	}

	/**
	 * One of diamond, circle, square, x, plus, dash, filledDiamond, filledCircle, filledSquare
	 *
	 * @param style
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStyle(MarkerStyles style)
	{
		this.style = style;
		return (J) this;
	}

	/**
	 * size of the line for non-filled markers.
	 *
	 * @return
	 */
	public Integer getLineWidth()
	{
		return lineWidth;
	}

	/**
	 * size of the line for non-filled markers.
	 *
	 * @param lineWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLineWidth(Integer lineWidth)
	{
		this.lineWidth = lineWidth;
		return (J) this;
	}

	/**
	 * Size of the marker (diameter or circle, length of edge of square, etc.)
	 *
	 * @return
	 */
	public Integer getSize()
	{
		return size;
	}

	/**
	 * Size of the marker (diameter or circle, length of edge of square, etc.)
	 *
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(Integer size)
	{
		this.size = size;
		return (J) this;
	}

	/**
	 * color of marker.
	 *
	 * @return
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * color of marker.
	 *
	 * @param color
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setColor(ColourHex color)
	{
		this.color = color.getValue();
		return (J) this;
	}

	/**
	 * *
	 * whether or not to draw a shadow on the line
	 *
	 * @return
	 */
	public Boolean getShadow()
	{
		return shadow;
	}

	/**
	 * whether or not to draw a shadow on the line
	 *
	 * @param shadow
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return (J) this;
	}

	/**
	 * Shadow angle in degrees
	 *
	 * @return
	 */
	public Integer getShadowAngle()
	{
		return shadowAngle;
	}

	/**
	 * Shadow angle in degrees
	 *
	 * @param shadowAngle
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowAngle(Integer shadowAngle)
	{
		this.shadowAngle = shadowAngle;
		return (J) this;
	}

	/**
	 * Shadow offset from line in pixels
	 *
	 * @return
	 */
	public Integer getShadowOffset()
	{
		return shadowOffset;
	}

	/**
	 * Shadow offset from line in pixels
	 *
	 * @param shadowOffset
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowOffset(Integer shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return (J) this;
	}

	/**
	 * Number of times shadow is stroked, each stroke offset shadowOffset from the last.
	 *
	 * @return
	 */
	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	/**
	 * Number of times shadow is stroked, each stroke offset shadowOffset from the last.
	 *
	 * @param shadowDepth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return (J) this;
	}

	/**
	 * Alpha channel transparency of shadow.
	 *
	 * @return
	 */
	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	/**
	 * Alpha channel transparency of shadow.
	 *
	 * @param shadowAlpha
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return (J) this;
	}

	@Override
	@JsonIgnore
	public String getMarkerRenderer()
	{
		return "$.jqplot.MarkerRenderer";
	}

	/**
	 * Returns the shadow renderer
	 *
	 * @return
	 */
	public JavaScriptPart getShadowRenderer()
	{
		return shadowRenderer;
	}

	/**
	 * sets the shadow renderer
	 *
	 * @param shadowRenderer
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowRenderer(JavaScriptPart shadowRenderer)
	{
		this.shadowRenderer = shadowRenderer;
		return (J) this;
	}

	/**
	 * gets the shape renderer
	 *
	 * @return
	 */
	public JavaScriptPart getShapeRenderer()
	{
		return shapeRenderer;
	}

	/**
	 * sets the shape renderer
	 *
	 * @param shapeRenderer
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShapeRenderer(JavaScriptPart shapeRenderer)
	{
		this.shapeRenderer = shapeRenderer;
		return (J) this;
	}

	/**
	 * return the graph that is linked to this marker
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * sets the graph that is linked to this marker
	 *
	 * @param linkedGraph
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLinkedGraph(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		return (J) this;
	}

}
