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
package com.jwebmp.plugins.jqplot.options.grid;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotGridRenderer;

import javax.validation.constraints.NotNull;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 07 Aug 2015
 */
public class JQPlotGridOptionsCanvasGrid<J extends JQPlotGridOptionsCanvasGrid<J>>
		extends JavaScriptPart<J>
		implements JQPlotGridRenderer
{

	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * whether to draw lines across the grid or not.
	 */
	private Boolean drawGridLines;
	/**
	 * *Color of the grid lines.
	 */
	private String gridLineColor;
	/**
	 * CSS color spec for background colour of grid.
	 */
	private String background;
	/**
	 * CSS color spec for border around grid.
	 */
	private String borderColor;
	/**
	 * pixel width of border around grid.
	 */
	private Double borderWidth;
	/**
	 * draw a shadow for grid.
	 */
	private Boolean shadow;
	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private Integer shadowAngle;
	/**
	 * offset from the line of the shadow.
	 */
	private Double shadowOffset;
	/**
	 * width of the stroke for the shadow.
	 */
	private Integer shadowWidth;
	/**
	 * Number of strokes to make when drawing shadow.
	 * Each stroke offset by shadowOffset from the last.
	 */
	private Integer shadowDepth;
	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;
	private JavaScriptPart rendererOptions;

	/**
	 * Construct a new Grid Options with the linked graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotGridOptionsCanvasGrid(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Returns the linked graph with this object
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Whether or not to draw grid lines
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDrawGridLines()
	{
		return drawGridLines;
	}

	/**
	 * Whether or not to draw grid lines
	 * <p>
	 *
	 * @param drawGridLines
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDrawGridLines(Boolean drawGridLines)
	{
		this.drawGridLines = drawGridLines;
		return (J) this;
	}

	/**
	 * Color of the grid lines.
	 *
	 * @return
	 */
	public String getGridLineColor()
	{
		return gridLineColor;
	}

	/**
	 * Color of the grid lines.
	 *
	 * @param gridLineColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGridLineColor(ColourHex gridLineColor)
	{
		this.gridLineColor = gridLineColor.getValue();
		return (J) this;
	}

	/**
	 * Get background colour
	 *
	 * @return
	 */
	public String getBackground()
	{
		return background;
	}

	/**
	 * Set background colour
	 *
	 * @param background
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackground(ColourHex background)
	{
		this.background = background.getValue();
		return (J) this;
	}

	/**
	 * Get border colour
	 *
	 * @return
	 */
	public String getBorderColor()
	{
		return borderColor;
	}

	/**
	 * Set border colour
	 *
	 * @param borderColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBorderColor(ColourHex borderColor)
	{
		this.borderColor = borderColor.getValue();
		return (J) this;
	}

	/**
	 * Get border width
	 *
	 * @return
	 */
	public Double getBorderWidth()
	{
		return borderWidth;
	}

	/**
	 * Set border width
	 *
	 * @param borderWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBorderWidth(Double borderWidth)
	{
		this.borderWidth = borderWidth;
		return (J) this;
	}

	/**
	 * Get shadow
	 *
	 * @return
	 */
	public Boolean getShadow()
	{
		return shadow;
	}

	/**
	 * set shadow
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
	 * Get shadow angle
	 *
	 * @return
	 */
	public Integer getShadowAngle()
	{
		return shadowAngle;
	}

	/**
	 * Set shadow angle
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
	 * get shadow offset
	 *
	 * @return
	 */
	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	/**
	 * Set the shadow offset
	 *
	 * @param shadowOffset
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return (J) this;
	}

	/**
	 * Get the shadow width
	 *
	 * @return
	 */
	public Integer getShadowWidth()
	{
		return shadowWidth;
	}

	/**
	 * Set the shadow width
	 *
	 * @param shadowWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowWidth(Integer shadowWidth)
	{
		this.shadowWidth = shadowWidth;
		return (J) this;
	}

	/**
	 * Get the shadow depth
	 *
	 * @return
	 */
	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	/**
	 * Set the shadow depth
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
	 * Get the shadow alpa
	 *
	 * @return
	 */
	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	/**
	 * Set the shadow alpha
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

	/**
	 * Get the render options
	 *
	 * @return
	 */
	public JavaScriptPart getRendererOptions()
	{
		return rendererOptions;
	}

	/**
	 * Set the renderer options
	 *
	 * @param rendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRendererOptions(JavaScriptPart rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return (J) this;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.CanvasGridRenderer";
	}
}
