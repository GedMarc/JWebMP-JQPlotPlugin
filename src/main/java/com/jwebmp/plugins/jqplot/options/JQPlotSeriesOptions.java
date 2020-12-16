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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.options.series.JQPlotSeriesLineOptions;
import com.jwebmp.plugins.jqplot.parts.XAxisTypes;
import com.jwebmp.plugins.jqplot.parts.YAxisTypes;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotMarkerRenderer;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import jakarta.validation.constraints.NotNull;

/**
 * @param <O>
 * @param <M>
 * @author mmagon
 */
public class JQPlotSeriesOptions<O extends JavaScriptPart<?> & JQPlotSeriesRenderer,
		M extends JavaScriptPart<?> & JQPlotMarkerRenderer,
		J extends JQPlotSeriesOptions<O, M, J>>
		extends JavaScriptPart<J>
{
	@JsonIgnore
	private JQPlotGraph<?,?> linkedGraph;
	
	private Boolean fillToZero;
	
	private String linePattern;
	/**
	 * Whether to show this series or not
	 */
	private Boolean show;
	/**
	 * either 'xaxis' or 'x2axis'.
	 */
	private XAxisTypes xaxis;
	/**
	 * either 'yaxis' or 'y2axis'.
	 */
	private YAxisTypes yaxis;
	/**
	 * label to use in the legend for this line.
	 */
	private String label;
	/**
	 * CSS color spec to use for the line. Determined automatically.
	 */
	private String colors;
	/**
	 * Width of the line in pixels.
	 */
	private Double lineWidth;
	/**
	 * show shadow or not.
	 */
	private Boolean shadow;
	/**
	 * angle (degrees) of the shadow, clockwise from x axis.
	 */
	private Integer shadowAngle;
	/**
	 * offset from the line of the shadow.
	 */
	private Double shadowOffset;
	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset from the last.
	 */
	private Integer shadowDepth;
	/**
	 * Opacity of the shadow.
	 */
	private Double shadowAlpha;
	/**
	 * whether to render the line segments or not.
	 */
	private Boolean showLine;
	/**
	 * render the data point markers or not.
	 */
	private Boolean showMarker;
	/**
	 * fill under the line,
	 */
	private Boolean fill;
	/**
	 * stroke a line at top of fill area.
	 */
	private Boolean fillAndStroke;
	/**
	 * *custom fill color for filled lines (default is line color).
	 */
	private String fillColor;
	/**
	 * custom alpha to apply to fillColor
	 */
	private String fillAlpha;
	/**
	 * renderer: $.jqplot.LineRenderer], // renderer used to draw the series.
	 */
	@JsonProperty("renderer")
	@JsonRawValue
	private String seriesRenderer;
	/**
	 * The series renderer options
	 */
	@JsonProperty("rendererOptions")
	private O rendererOptions;
	/**
	 * markerRenderer: $.jqplot.MarkerRenderer, // renderer to use to draw the data // point markers.
	 */
	@JsonRawValue
	private String markerRenderer;
	/**
	 * The Marker Renderer Options
	 */
	@JsonProperty("markerOptions")
	private M markerRendererOptions;
	/**
	 * Whether or not to show the labels for a point
	 */
	private JQPlotPointLabelsOptions<?> pointLabels;
	
	/**
	 * Construct a new instance of the series defaults with the given renderer
	 * <p>
	 *
	 * @param linkedGraph
	 */
	public JQPlotSeriesOptions(JQPlotGraph<?,?> linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		
	}
	
	/**
	 * Whether or not to show a line
	 * <p>
	 *
	 * @return
	 */
	public Boolean isShowLine()
	{
		return showLine;
	}
	
	/**
	 * To show or not show the series
	 * <p>
	 *
	 * @return
	 */
	public Boolean isShow()
	{
		return show;
	}
	
	/**
	 * render the data point markers or not.
	 *
	 * @return
	 */
	public Boolean isShowMarker()
	{
		return showMarker;
	}
	
	/**
	 * show shadow or not.
	 *
	 * @return
	 */
	public Boolean isShadow()
	{
		return shadow;
	}
	
	/**
	 * Gets the X Axis
	 *
	 * @return
	 */
	public XAxisTypes getXaxis()
	{
		return xaxis;
	}
	
	/**
	 * Sets the X Axis
	 *
	 * @param xaxis
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setXaxis(XAxisTypes xaxis)
	{
		this.xaxis = xaxis;
		return (J) this;
	}
	
	/**
	 * Gets the Y Axis
	 *
	 * @return
	 */
	public YAxisTypes getYaxis()
	{
		return yaxis;
	}
	
	/**
	 * Sets the Y Axis
	 *
	 * @param yaxis
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setYaxis(YAxisTypes yaxis)
	{
		this.yaxis = yaxis;
		return (J) this;
	}
	
	/**
	 * Gets the label for the series
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}
	
	/**
	 * Sets the label for the series
	 *
	 * @param label
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
	}
	
	/**
	 * CSS color spec to use for the line. Determined automatically.
	 *
	 * @return
	 */
	public String getColors()
	{
		return colors;
	}
	
	/**
	 * CSS color spec to use for the line. Determined automatically.
	 *
	 * @param colors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setColors(ColourHex colors)
	{
		this.colors = colors.getValue();
		return (J) this;
	}
	
	/**
	 * CSS color spec to use for the line. Determined automatically.
	 *
	 * @param colors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setColors(String colors)
	{
		this.colors = colors;
		return (J) this;
	}
	
	/**
	 * Width of the line in pixels.
	 *
	 * @return
	 */
	public Double getLineWidth()
	{
		return lineWidth;
	}
	
	/**
	 * Width of the line in pixels.
	 *
	 * @param lineWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
		return (J) this;
	}
	
	/**
	 * angle (degrees) of the shadow, clockwise from x axis.
	 *
	 * @return
	 */
	public Integer getShadowAngle()
	{
		return shadowAngle;
	}
	
	/**
	 * angle (degrees) of the shadow, clockwise from x axis.
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
	 * offset from the line of the shadow.
	 *
	 * @return
	 */
	public Double getShadowOffset()
	{
		return shadowOffset;
	}
	
	/**
	 * offset from the line of the shadow.
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
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset from the last.
	 *
	 * @return
	 */
	public Integer getShadowDepth()
	{
		return shadowDepth;
	}
	
	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset from the last.
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
	 * Opacity of the shadow.
	 *
	 * @return
	 */
	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}
	
	/**
	 * Opacity of the shadow.
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
	 * fill under the line,
	 *
	 * @return
	 */
	public Boolean getFill()
	{
		return fill;
	}
	
	/**
	 * fill under the line,
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
	 * stroke a line at top of fill area.
	 *
	 * @return
	 */
	public Boolean getFillAndStroke()
	{
		return fillAndStroke;
	}
	
	/**
	 * stroke a line at top of fill area.
	 *
	 * @param fillAndStroke
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillAndStroke(Boolean fillAndStroke)
	{
		this.fillAndStroke = fillAndStroke;
		return (J) this;
	}
	
	/**
	 * custom fill color for filled lines (default is line color).
	 *
	 * @return
	 */
	public String getFillColor()
	{
		return fillColor;
	}
	
	/**
	 * custom fill color for filled lines (default is line color).
	 *
	 * @param fillColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillColor(ColourHex fillColor)
	{
		this.fillColor = fillColor.getValue();
		return (J) this;
	}
	
	/**
	 * custom fill color for filled lines (default is line color).
	 *
	 * @param fillColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return (J) this;
	}
	
	/**
	 * custom alpha to apply to fillColor
	 *
	 * @return
	 */
	public String getFillAlpha()
	{
		return fillAlpha;
	}
	
	/**
	 * custom alpha to apply to fillColor
	 *
	 * @param fillAlpha
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillAlpha(ColourHex fillAlpha)
	{
		this.fillAlpha = fillAlpha.getValue();
		return (J) this;
	}
	
	/**
	 * custom fill color for filled lines (default is line color).
	 *
	 * @param fillAlpha
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFillAlpha(String fillAlpha)
	{
		this.fillAlpha = fillAlpha;
		return (J) this;
	}
	
	/**
	 * Gets the current series renderer name
	 *
	 * @return
	 */
	public String getSeriesRenderer()
	{
		return seriesRenderer;
	}
	
	/**
	 * Get the Series Renderer Options
	 * <p>
	 * JQPlotSeriesLineOptions by default
	 *
	 * @return
	 */
	public O getRendererOptions()
	{
		if (rendererOptions == null)
		{
			rendererOptions = (O) new JQPlotSeriesLineOptions(getLinkedGraph());
		}
		return rendererOptions;
	}
	
	/**
	 * Sets the series renderer options
	 *
	 * @param rendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRendererOptions(O rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		seriesRenderer = rendererOptions.getRenderer();
		return (J) this;
	}
	
	/**
	 * Gets the linked graph
	 *
	 * @return
	 */
	public JQPlotGraph<?,?> getLinkedGraph()
	{
		return linkedGraph;
	}
	
	/**
	 * Sets the linked graph
	 *
	 * @param linkedGraph
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLinkedGraph(JQPlotGraph<?,?> linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		return (J) this;
	}
	
	/**
	 * Sets the Marker Renderer
	 *
	 * @return
	 */
	public String getMarkerRenderer()
	{
		return markerRenderer;
	}
	
	/**
	 * Set the marker renderer string
	 *
	 * @param markerRenderer
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarkerRenderer(String markerRenderer)
	{
		this.markerRenderer = markerRenderer;
		return (J) this;
	}
	
	/**
	 * Set to use point labels or not
	 *
	 * @return
	 */
	public JQPlotPointLabelsOptions<?> getPointLabels()
	{
		if (pointLabels == null)
		{
			pointLabels = new JQPlotPointLabelsOptions<>(linkedGraph);
		}
		return pointLabels;
	}
	
	/**
	 * Set to use point labels
	 *
	 * @param pointLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPointLabels(JQPlotPointLabelsOptions<?> pointLabels)
	{
		this.pointLabels = pointLabels;
		return (J) this;
	}
	
	/**
	 * Gets the specified Marker Renderer Options
	 * <p>
	 * Default to JQPlotMarkerOptions
	 *
	 * @return
	 */
	public M getMarkerRendererOptions()
	{
		if (markerRendererOptions == null)
		{
			setMarkerRendererOptions((M) new JQPlotMarkerOptions(getLinkedGraph()));
		}
		return markerRendererOptions;
	}
	
	/**
	 * Sets the Marker Renderer Options
	 *
	 * @param markerRendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarkerRendererOptions(M markerRendererOptions)
	{
		this.markerRendererOptions = markerRendererOptions;
		markerRenderer = markerRendererOptions.getMarkerRenderer();
		return (J) this;
	}
	
	/**
	 * Show series
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}
	
	/**
	 * To show or not show the series
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
	 * get Shadow
	 *
	 * @return
	 */
	public Boolean getShadow()
	{
		return shadow;
	}
	
	/**
	 * show shadow or not.
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
	 * Is Show Line
	 *
	 * @return
	 */
	public Boolean getShowLine()
	{
		return showLine;
	}
	
	/**
	 * Whether or not to show a line
	 * <p>
	 *
	 * @param showLine Whether to show the line or not
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowLine(Boolean showLine)
	{
		this.showLine = showLine;
		return (J) this;
	}
	
	/**
	 * Is Show Marker
	 *
	 * @return
	 */
	public Boolean getShowMarker()
	{
		return showMarker;
	}
	
	/**
	 * render the data point markers or not.
	 *
	 * @param showMarker
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowMarker(Boolean showMarker)
	{
		this.showMarker = showMarker;
		return (J) this;
	}
	
	/**
	 * Gets the fill to zero
	 *
	 * @return
	 */
	public Boolean getFillToZero()
	{
		return fillToZero;
	}
	
	/**
	 * Sets the fill to zero
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
	
	/**
	 * line pattern ‘dashed’, ‘dotted’, ‘solid’, some combination of ‘-’ and ‘.’ characters such as ‘.-.’ or a numerical array like [draw, skip, draw, skip, ...] such as [1, 10] to
	 * draw a dotted line,
	 * [1, 10, 20, 10] to draw a dot-dash line, and so on.
	 *
	 * @return
	 */
	public String getLinePattern()
	{
		return linePattern;
	}
	
	/**
	 * line pattern ‘dashed’, ‘dotted’, ‘solid’, some combination of ‘-’ and ‘.’ characters such as ‘.-.’ or a numerical array like [draw, skip, draw, skip, ...] such as [1, 10] to
	 * draw a dotted line,
	 * [1, 10, 20, 10] to draw a dot-dash line, and so on.
	 *
	 * @param linePattern
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLinePattern(String linePattern)
	{
		this.linePattern = linePattern;
		return (J) this;
	}
	
}
