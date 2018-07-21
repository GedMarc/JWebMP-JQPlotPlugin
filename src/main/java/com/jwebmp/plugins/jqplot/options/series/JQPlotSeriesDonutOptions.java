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
package com.jwebmp.plugins.jqplot.options.series;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * The properties for a line graph
 *
 * @author Marc Magon
 * @version 1.0
 * @since 09 Aug 2015
 */
public class JQPlotSeriesDonutOptions<J extends JQPlotSeriesDonutOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotSeriesRenderer
{

	private static final long serialVersionUID = 1L;
	/**
	 * The graph that this is linked to
	 */
	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * Outer diameter of the pie, auto computed by default
	 */
	private Integer diameter;//
	/**
	 * padding between the pie and plot edges, legend, etc.
	 */
	private Double padding;
	/**
	 * angular spacing between pie slices in degrees.
	 */
	private Integer sliceMargin;
	/**
	 * true or false, whether to fil the slices.
	 */
	private Boolean fill;
	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the shadow from the last.
	 */
	private Integer shadowOffset;
	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 */
	private Double shadowAlpha;
	/**
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the last.
	 */
	private Integer shadowDepth;
	/**
	 * True to highlight slice when moused over.
	 */
	private Boolean highlightMouseOver;
	/**
	 * True to highlight when a mouse button is pressed over a slice.
	 */
	private Boolean highlightMouseDown;
	/**
	 * an array of colors to use when highlighting a slice.
	 */
	private List<String> highlightColors;
	/**
	 * Either ‘label’, ‘value’, ‘percent’ or an array of labels to place on the pie slices.
	 */
	private String dataLabels;
	/**
	 * true to show data labels on slices.
	 */
	private Boolean showDataLabels;
	/**
	 * Format string for data labels.
	 */
	private String dataLabelFormatString;
	/**
	 * Threshold in percentage (0-100) of pie area, below which no label will be displayed.
	 */
	private Integer dataLabelThreshold;
	/**
	 * A Multiplier (0-1) of the pie radius which controls position of label on slice.
	 */
	private Double dataLabelPositionFactor;
	/**
	 * Number of pixels to slide the label away from (+) or toward (-) the center of the pie.
	 */
	private Integer dataLabelNudge;
	/**
	 * True to center the data label at its position.
	 */
	private Boolean dataLabelCenterOn;
	/**
	 * Angle to start drawing pie in degrees.
	 */
	private Integer startAngle;
	/**
	 * Array for whether the pie chart slice for a data element should be displayed.
	 */
	private List<Boolean> showSlice;

	/**
	 * Constructs a new Line Options for the given graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotSeriesDonutOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
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
	 * Sets the series render to bubble
	 *
	 * @return
	 */
	@Override
	public String getRenderer()
	{
		return "$.jqplot.DonutRenderer";
	}

	/**
	 * Outer diameter of the pie, auto computed by default
	 *
	 * @return
	 */
	public Integer getDiameter()
	{
		return diameter;
	}

	/**
	 * Outer diameter of the pie, auto computed by default
	 * <p>
	 * <p>
	 *
	 * @param diameter
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDiameter(Integer diameter)
	{
		this.diameter = diameter;
		return (J) this;
	}

	/**
	 * padding between the pie and plot edges, legend, etc.
	 *
	 * @return
	 */
	public Double getPadding()
	{
		return padding;
	}

	/**
	 * padding between the pie and plot edges, legend, etc.
	 * <p>
	 *
	 * @param padding
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPadding(Double padding)
	{
		this.padding = padding;
		return (J) this;
	}

	/**
	 * angular spacing between pie slices in degrees.
	 *
	 * @return
	 */
	public Integer getSliceMargin()
	{
		return sliceMargin;
	}

	/**
	 * angular spacing between pie slices in degrees.
	 * <p>
	 *
	 * @param sliceMargin
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSliceMargin(Integer sliceMargin)
	{
		this.sliceMargin = sliceMargin;
		return (J) this;
	}

	/**
	 * true or false, whether to fil the slices.
	 *
	 * @return
	 */
	public Boolean getFill()
	{
		return fill;
	}

	/**
	 * true or false, whether to fill the slices.
	 * <p>
	 *
	 * @param fill
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFill(Boolean fill)
	{
		this.fill = fill;
		return (J) this;
	}

	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the shadow from the last.
	 *
	 * @return
	 */
	public Integer getShadowOffset()
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
	public J setShadowOffset(Integer shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return (J) this;
	}

	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
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
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the last.
	 *
	 * @return
	 */
	public Integer getShadowDepth()
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
	public J setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return (J) this;
	}

	/**
	 * True to highlight slice when moused over.
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
	 * an array of colors to use when highlighting a slice.
	 *
	 * @return
	 */
	public List<String> getHighlightColors()
	{
		return highlightColors;
	}

	/**
	 * an array of colors to use when highlighting a slice.
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
	 * Either ‘label’, ‘value’, ‘percent’ or an array of labels to place on the pie slices.
	 *
	 * @return
	 */
	public String getDataLabels()
	{
		return dataLabels;
	}

	/**
	 * Either ‘label’, ‘value’, ‘percent’ or an array of labels to place on the pie slices.
	 * <p>
	 *
	 * @param dataLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabels(String dataLabels)
	{
		this.dataLabels = dataLabels;
		return (J) this;
	}

	/**
	 * true to show data labels on slices
	 *
	 * @return
	 */
	public Boolean getShowDataLabels()
	{
		return showDataLabels;
	}

	/**
	 * true to show data labels on slices
	 * <p>
	 *
	 * @param showDataLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowDataLabels(Boolean showDataLabels)
	{
		this.showDataLabels = showDataLabels;
		return (J) this;
	}

	/**
	 * Format string for data labels. If none, ‘%s’ is used for “label” and for arrays, ‘%d’ for value and ‘%d%%’ for percentage.
	 *
	 * @return
	 */
	public String getDataLabelFormatString()
	{
		return dataLabelFormatString;
	}

	/**
	 * Format string for data labels. If none, ‘%s’ is used for “label” and for arrays, ‘%d’ for value and ‘%d%%’ for percentage.
	 * <p>
	 *
	 * @param dataLabelFormatString
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabelFormatString(String dataLabelFormatString)
	{
		this.dataLabelFormatString = dataLabelFormatString;
		return (J) this;
	}

	/**
	 * Threshhold in percentage (0-100) of pie area, below which no label will be displayed.
	 *
	 * @return
	 */
	public Integer getDataLabelThreshold()
	{
		return dataLabelThreshold;
	}

	/**
	 * Threshhold in percentage (0-100) of pie area, below which no label will be displayed.
	 * <p>
	 *
	 * @param dataLabelThreshold
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabelThreshold(Integer dataLabelThreshold)
	{
		this.dataLabelThreshold = dataLabelThreshold;
		return (J) this;
	}

	/**
	 * A Multiplier (0-1) of the pie radius which controls position of label on slice.
	 *
	 * @return
	 */
	public Double getDataLabelPositionFactor()
	{
		return dataLabelPositionFactor;
	}

	/**
	 * A Multiplier (0-1) of the pie radius which controls position of label on slice.
	 * <p>
	 *
	 * @param dataLabelPositionFactor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabelPositionFactor(Double dataLabelPositionFactor)
	{
		this.dataLabelPositionFactor = dataLabelPositionFactor;
		return (J) this;
	}

	/**
	 * Number of pixels to slide the label away from (+) or toward (-) the center of the pie.
	 *
	 * @return
	 */
	public Integer getDataLabelNudge()
	{
		return dataLabelNudge;
	}

	/**
	 * Number of pixels to slide the label away from (+) or toward (-) the center of the pie.
	 * <p>
	 *
	 * @param dataLabelNudge
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabelNudge(Integer dataLabelNudge)
	{
		this.dataLabelNudge = dataLabelNudge;
		return (J) this;
	}

	/**
	 * True to center the data label at its position.
	 *
	 * @return
	 */
	public Boolean getDataLabelCenterOn()
	{
		return dataLabelCenterOn;
	}

	/**
	 * True to center the data label at its position.
	 * <p>
	 *
	 * @param dataLabelCenterOn
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDataLabelCenterOn(Boolean dataLabelCenterOn)
	{
		this.dataLabelCenterOn = dataLabelCenterOn;
		return (J) this;
	}

	/**
	 * Angle to start drawing pie in degrees.
	 *
	 * @return
	 */
	public Integer getStartAngle()
	{
		return startAngle;
	}

	/**
	 * Angle to start drawing pie in degrees.
	 * <p>
	 *
	 * @param startAngle
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStartAngle(Integer startAngle)
	{
		this.startAngle = startAngle;
		return (J) this;
	}

	/**
	 * Array for whether the pie chart slice for a data element should be displayed.
	 *
	 * @return
	 */
	public List<Boolean> getShowSlice()
	{
		return showSlice;
	}

	/**
	 * Array for whether the pie chart slice for a data element should be displayed.
	 * <p>
	 *
	 * @param showSlice
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowSlice(List<Boolean> showSlice)
	{
		this.showSlice = showSlice;
		return (J) this;
	}

}
