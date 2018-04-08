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
package za.co.mmagon.jwebswing.plugins.jqplot.options.series;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 09 Aug 2015
 */
public class JQPlotSeriesBarOptions<J extends JQPlotSeriesBarOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotSeriesRenderer
{

	private static final long serialVersionUID = 1L;
	private Boolean disableStack;
	/**
	 * The graph that this is linked to
	 */
	@JsonIgnore
	private JQPlotGraph linkedGraph;
	private Boolean fillToZero;

	/**
	 * Number of pixels between adjacent bars at the same axis value.
	 */
	private Integer barPadding;
	/**
	 * Number of pixels between groups of bars at adjacent axis values.
	 */
	private Integer barMargin;
	/**
	 * ‘vertical’ = up and down bars, ‘horizontal’ = side to side bars
	 */
	private Orientation barDirection;
	/**
	 * Width of the bar in pixels (auto by devaul).
	 */
	private Integer barWidth;
	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the shadow from the last.
	 */
	private Double shadowOffset;
	/**
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the last.
	 */
	private Double shadowDepth;
	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 */
	private Double shadowAlpha;
	/**
	 * true to enable waterfall plot.
	 */
	private Boolean waterfall;
	/**
	 * group bars into this many groups
	 */
	private Integer groups;
	/**
	 * true to color each bar of a series separately rather than have every bar of a given series the same color.
	 */
	private Boolean varyBarColor;
	/**
	 * True to highlight slice when moused over.
	 */
	private Boolean highlightMouseOver;
	/**
	 * True to highlight when a mouse button is pressed over a slice.
	 */
	private Boolean highlightMouseDown;
	/**
	 * an array of colors to use when highlighting a bar.
	 */
	private List<String> highlightColors;
	/**
	 * NOT IMPLEMENTED YET.
	 * True if this is a horizontal bar plot and x and y values are “transposed”.
	 * Transposed, or “swapped”, data is required prior to rev.
	 * 894 builds of jqPlot with horizontal bars.
	 * Allows backward compatability of bar renderer horizontal bars with old style data sets.
	 */
	private Boolean transposedData;

	private Boolean useNegativeColors;

	public JQPlotSeriesBarOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Number of pixels between adjacent bars at the same axis value.
	 * <p>
	 *
	 * @return
	 */
	public Integer getBarPadding()
	{
		return barPadding;
	}

	/**
	 * Number of pixels between adjacent bars at the same axis value.
	 * <p>
	 *
	 * @param barPadding
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBarPadding(Integer barPadding)
	{
		this.barPadding = barPadding;
		return (J) this;
	}

	/**
	 * Number of pixels between groups of bars at adjacent axis values.
	 * <p>
	 *
	 * @return
	 */
	public Integer getBarMargin()
	{
		return barMargin;
	}

	/**
	 * Number of pixels between groups of bars at adjacent axis values.
	 * <p>
	 *
	 * @param barMargin
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBarMargin(Integer barMargin)
	{
		this.barMargin = barMargin;
		return (J) this;
	}

	/**
	 * ‘vertical’ = up and down bars, ‘horizontal’ = side to side bars
	 * <p>
	 *
	 * @return
	 */
	public Orientation getBarDirection()
	{
		return barDirection;
	}

	/**
	 * ‘vertical’ = up and down bars, ‘horizontal’ = side to side bars
	 * <p>
	 *
	 * @param barDirection
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBarDirection(Orientation barDirection)
	{
		this.barDirection = barDirection;
		return (J) this;
	}

	/**
	 * Width of the bar in pixels (auto by devaul).
	 * <p>
	 *
	 * @return
	 */
	public Integer getBarWidth()
	{
		return barWidth;
	}

	/**
	 * Width of the bar in pixels (auto by devaul).
	 * <p>
	 *
	 * @param barWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBarWidth(Integer barWidth)
	{
		this.barWidth = barWidth;
		return (J) this;
	}

	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the shadow from the last.
	 * <p>
	 *
	 * @return
	 */
	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the shadow from the last.
	 * <p>
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
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the last.
	 * <p>
	 *
	 * @return
	 */
	public Double getShadowDepth()
	{
		return shadowDepth;
	}

	/**
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the last.
	 * <p>
	 *
	 * @param shadowDepth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShadowDepth(Double shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return (J) this;
	}

	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 * <p>
	 *
	 * @return
	 */
	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 * <p>
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
	 * true to enable waterfall plot.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getWaterfall()
	{
		return waterfall;
	}

	/**
	 * true to enable waterfall plot.
	 * <p>
	 *
	 * @param waterfall
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWaterfall(Boolean waterfall)
	{
		this.waterfall = waterfall;
		return (J) this;
	}

	/**
	 * group bars into this many groups
	 * <p>
	 *
	 * @return
	 */
	public Integer getGroups()
	{
		return groups;
	}

	/**
	 * group bars into this many groups
	 * <p>
	 *
	 * @param groups
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGroups(Integer groups)
	{
		this.groups = groups;
		return (J) this;
	}

	/**
	 * true to color each bar of a series separately rather than have every bar of a given series the same color.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getVaryBarColor()
	{
		return varyBarColor;
	}

	/**
	 * true to color each bar of a series separately rather than have every bar of a given series the same color.
	 * <p>
	 *
	 * @param varyBarColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setVaryBarColor(Boolean varyBarColor)
	{
		this.varyBarColor = varyBarColor;
		return (J) this;
	}

	/**
	 * *
	 * True to highlight slice when moused over.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	/**
	 * True to highlight slice when moused over.
	 * <p>
	 *
	 * @param highlightMouseOver
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightMouseOver(Boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return (J) this;
	}

	/**
	 * True to highlight when a mouse button is pressed over a slice.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	/**
	 * True to highlight when a mouse button is pressed over a slice.
	 * <p>
	 *
	 * @param highlightMouseDown
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightMouseDown(Boolean highlightMouseDown)
	{
		this.highlightMouseDown = highlightMouseDown;
		return (J) this;
	}

	/**
	 * an array of colors to use when highlighting a bar.
	 * <p>
	 *
	 * @return
	 */
	public List<String> getHighlightColors()
	{
		if (highlightColors == null)
		{
			highlightColors = new ArrayList<>();
		}
		return highlightColors;
	}

	/**
	 * an array of colors to use when highlighting a bar.
	 * <p>
	 *
	 * @param highlightColors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightColors(List<String> highlightColors)
	{
		this.highlightColors = highlightColors;
		return (J) this;
	}

	/**
	 * NOT IMPLEMENTED YET. True if this is a horizontal bar plot and x and y values are “transposed”.
	 * Tranposed, or “swapped”, data is required prior to rev. 894 builds of jqPlot with horizontal
	 * bars.
	 * Allows backward compatability of bar renderer horizontal bars with old style data sets.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getTransposedData()
	{
		return transposedData;
	}

	/**
	 * NOT IMPLEMENTED YET. True if this is a horizontal bar plot and x and y values are “transposed”.
	 * Tranposed, or “swapped”, data is required prior to rev. 894 builds of jqPlot with horizontal
	 * bars.
	 * Allows backward compatability of bar renderer horizontal bars with old style data sets.
	 * <p>
	 *
	 * @param transposedData
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTransposedData(Boolean transposedData)
	{
		this.transposedData = transposedData;
		return (J) this;
	}

	/**
	 * Gets the graph associated with this options
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Sets the graph that is linked to this options
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

	/**
	 * Gets to fill to zero for negative numbers
	 *
	 * @return
	 */
	public Boolean getFillToZero()
	{
		return fillToZero;
	}

	/**
	 * sets fill to zero for negative numbers
	 *
	 * @param fillToZero
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillToZero(Boolean fillToZero)
	{
		this.fillToZero = fillToZero;
		return (J) this;
	}

	@Override
	public String getRenderer()
	{
		return "$.jqplot.BarRenderer";
	}

	/**
	 * Whether or not to use negative colours
	 *
	 * @return
	 */
	public Boolean getUseNegativeColors()
	{
		return useNegativeColors;
	}

	/**
	 * Whether or not to use negative colours
	 *
	 * @param useNegativeColors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseNegativeColors(Boolean useNegativeColors)
	{
		this.useNegativeColors = useNegativeColors;
		return (J) this;
	}

	/**
	 * Sets whether or not disable stack should be implement
	 *
	 * @return
	 */
	public Boolean getDisableStack()
	{
		return disableStack;
	}

	/**
	 * Sets disable stack for the bar graph
	 *
	 * @param disableStack
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisableStack(Boolean disableStack)
	{
		this.disableStack = disableStack;
		return (J) this;
	}

}
