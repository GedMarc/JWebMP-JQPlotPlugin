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

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.options.ticks.JQPlotTickOptionsAxisTick;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotAxisLabelRenderer;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotTickRenderer;

import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Set;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotAxisOptions<O extends JavaScriptPart & JQPlotAxisLabelRenderer, J extends JQPlotAxisOptions<O, J>>
		extends JavaScriptPart<J>
{


	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * whether or not to renderer the axis. Determined automatically.
	 */
	private Boolean show;
	/**
	 * Whether or not to show a label
	 */
	private Boolean showLabel;
	/**
	 * Auto-Scale the axis min and max values to provide sensible tick spacing.
	 */
	private Boolean autoscale;
	/**
	 * minimum numerical value of the axis. Determined automatically.
	 */
	private Integer min;
	/**
	 * maximum num vertical value of the axis. Determined automatically.
	 */
	private Integer max;
	/**
	 * a factor multiplied by the data range on the axis to give the
	 */
	private Double pad;
	/**
	 * axis range so that data points don't fall on the edges of the axis. a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...]
	 */
	@JsonIgnore
	private List<String> ticks;
	/**
	 * array of ticks to use. Computed automatically.
	 */
	private Integer numberTicks;
	/**
	 * array of ticks to use. Computed automatically.
	 */
	private Integer tickInterval;
	/**
	 * whether or not to show the tick labels, Wether to show the ticks (both marks and labels) or not.
	 */
	private Boolean showTicks;
	/**
	 * Whether or not to show the tick marks Wether to show the tick marks (line crossing grid) or not.
	 */
	private Boolean showTickMarks;
	/**
	 * A class of a rendering engine for creating the ticks labels displayed on the plot, See $.jqplot.AxisTickRenderer.
	 */
	@JsonRawValue
	private String tickRenderer;
	/**
	 * The options associated with the tick renderer
	 */
	@JsonProperty("tickOptions")
	private JavaScriptPart tickRendererOptions;
	/**
	 * The specific renderer options
	 */
	@JsonProperty("rendererOptions")
	private O rendererOptions;
	/**
	 * Label for the axis
	 */
	private String label;

	/**
	 * Padding to extend the range above data bounds.
	 */
	private Integer padMax;
	/**
	 * Padding to extend the range below data bounds.
	 */
	private Integer padMin;

	/**
	 * Whether or not to show minor ticks.
	 */
	private Boolean showMinorTicks;
	/**
	 * Use the color of the first series associated with this axis for the tick marks and line bordering this axis.
	 */
	private Boolean useSeriesColor;
	/**
	 * width of line stroked at the border of the axis.
	 */
	private Integer borderWidth;
	/**
	 * color of the border adjacent to the axis.
	 */
	private String borderColor;
	/**
	 * true to try and synchronize tick spacing across multiple axes so that ticks and grid lines line up.
	 */
	private Boolean syncTicks;
	/**
	 * Approximate pixel spacing between ticks on graph.
	 */
	private Integer tickSpacing;
	@JsonRawValue
	private String renderer;
	/**
	 * The physical label renderer
	 */
	@JsonRawValue
	private String labelRenderer;
	/**
	 * Returns the label renderer options
	 */
	private JQPlotAxisLabelRenderer labelRendererOptions;

	/**
	 * The linked graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotAxisOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Whether or not to show the axis
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Whether or not to show the axis
	 * <p>
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
	 * Whether or not to show a label
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowLabel()
	{
		return showLabel;
	}

	/**
	 * Whether or not to show a label
	 * <p>
	 *
	 * @param showLabel
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowLabel(Boolean showLabel)
	{
		this.showLabel = showLabel;
		return (J) this;
	}

	/**
	 * Autoscale the axis min and max values to provide sensible tick spacing.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getAutoscale()
	{
		return autoscale;
	}

	/**
	 * Autoscale the axis min and max values to provide sensible tick spacing.
	 * <p>
	 *
	 * @param autoscale
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoscale(Boolean autoscale)
	{
		this.autoscale = autoscale;
		return (J) this;
	}

	/**
	 * minimum numerical value of the axis. Determined automatically.
	 * <p>
	 *
	 * @return
	 */
	public Integer getMin()
	{
		return min;
	}

	/**
	 * minimum numerical value of the axis. Determined automatically.
	 * <p>
	 *
	 * @param min
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMin(Integer min)
	{
		this.min = min;
		return (J) this;
	}

	/**
	 * maximum num vertical value of the axis. Determined automatically
	 * <p>
	 *
	 * @return
	 */
	public Integer getMax()
	{
		return max;
	}

	/**
	 * maximum num vertical value of the axis. Determined automatically
	 * <p>
	 *
	 * @param max
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMax(Integer max)
	{
		this.max = max;
		return (J) this;
	}

	/**
	 * a factor multiplied by the data range on the axis to give the
	 * <p>
	 *
	 * @return
	 */
	public Double getPad()
	{
		return pad;
	}

	/**
	 * a factor multiplied by the data range on the axis to give the
	 * <p>
	 *
	 * @param pad
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPad(Double pad)
	{
		this.pad = pad;
		return (J) this;
	}

	/**
	 * axis range so that data points don't fall on the edges of the axis. a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...]
	 * <p>
	 *
	 * @return
	 */
	@JsonProperty("ticks")
	public List<String> getTicks()
	{
		return ticks;
	}

	/**
	 * axis range so that data points don't fall on the edges of the axis. a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...]
	 * <p>
	 *
	 * @param ticks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTicks(List<String> ticks)
	{
		this.ticks = ticks;
		return (J) this;
	}

	/**
	 * array of ticks to use. Computed automatically.
	 * <p>
	 *
	 * @return
	 */
	public Integer getNumberTicks()
	{
		return numberTicks;
	}

	/**
	 * array of ticks to use. Computed automatically.
	 * <p>
	 *
	 * @param numberTicks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNumberTicks(Integer numberTicks)
	{
		this.numberTicks = numberTicks;
		return (J) this;
	}

	/**
	 * array of ticks to use. Computed automatically.
	 * <p>
	 *
	 * @return
	 */
	public Integer getTickInterval()
	{
		return tickInterval;
	}

	/**
	 * array of ticks to use. Computed automatically.
	 * <p>
	 *
	 * @param tickInterval
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTickInterval(Integer tickInterval)
	{
		this.tickInterval = tickInterval;
		return (J) this;
	}

	/**
	 * Whether to show the ticks (both marks and labels) or not.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowTicks()
	{
		return showTicks;
	}

	/**
	 * Whether to show the ticks (both marks and labels) or not.
	 * <p>
	 *
	 * @param showTicks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowTicks(Boolean showTicks)
	{
		this.showTicks = showTicks;
		return (J) this;
	}

	/**
	 * Whether to show the tick marks (line crossing grid) or not.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowTickMarks()
	{
		return showTickMarks;
	}

	/**
	 * Whether to show the tick marks (line crossing grid) or not.
	 * <p>
	 *
	 * @param showTickMarks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowTickMarks(Boolean showTickMarks)
	{
		this.showTickMarks = showTickMarks;
		return (J) this;
	}

	/**
	 * A class of a rendering engine for creating the ticks labels displayed on the plot, See $.jqplot.AxisTickRenderer.
	 * <p>
	 *
	 * @return
	 */
	public String getTickRenderer()
	{
		return tickRenderer;
	}

	/**
	 * Get Tick Renderer Options Default JQPlotTickOptionsAxisTick
	 *
	 * @return
	 */
	public JavaScriptPart getTickRendererOptions()
	{
		if (tickRendererOptions == null)
		{
			tickRendererOptions = new JQPlotTickOptionsAxisTick();
		}
		return tickRendererOptions;
	}

	/**
	 * Set the tick renderer
	 *
	 * @param <O>
	 * 		A Valid Tick Renderer
	 * @param tickRendererOptions
	 * 		The Actual Options Class
	 */
	public <O extends JavaScriptPart & JQPlotTickRenderer> J setTickRendererOptions(O tickRendererOptions)
	{
		tickRenderer = tickRendererOptions.getRenderer();
		this.tickRendererOptions = tickRendererOptions;
		return (J) this;
	}

	/**
	 * Label for the axis
	 * <p>
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Label for the axis
	 * <p>
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
	 * Padding to extend the range above data bounds.
	 * <p>
	 *
	 * @return
	 */
	public Integer getPadMax()
	{
		return padMax;
	}

	/**
	 * Padding to extend the range above data bounds.
	 * <p>
	 *
	 * @param padMax
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPadMax(Integer padMax)
	{
		this.padMax = padMax;
		return (J) this;
	}

	/**
	 * Padding to extend the range below data bounds.
	 * <p>
	 *
	 * @return
	 */
	public Integer getPadMin()
	{
		return padMin;
	}

	/**
	 * Padding to extend the range below data bounds.
	 * <p>
	 *
	 * @param padMin
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPadMin(Integer padMin)
	{
		this.padMin = padMin;
		return (J) this;
	}

	/**
	 * Whether or not to show minor ticks.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowMinorTicks()
	{
		return showMinorTicks;
	}

	/**
	 * Whether or not to show minor ticks.
	 * <p>
	 *
	 * @param showMinorTicks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowMinorTicks(Boolean showMinorTicks)
	{
		this.showMinorTicks = showMinorTicks;
		return (J) this;
	}

	/**
	 * Use the color of the first series associated with this axis for the tick marks and line bordering this axis.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getUseSeriesColor()
	{
		return useSeriesColor;
	}

	/**
	 * Use the color of the first series associated with this axis for the tick marks and line bordering this axis.
	 * <p>
	 *
	 * @param useSeriesColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUseSeriesColor(Boolean useSeriesColor)
	{
		this.useSeriesColor = useSeriesColor;
		return (J) this;
	}

	/**
	 * width of line stroked at the border of the axis.
	 * <p>
	 *
	 * @return
	 */
	public Integer getBorderWidth()
	{
		return borderWidth;
	}

	/**
	 * width of line stroked at the border of the axis.
	 * <p>
	 *
	 * @param borderWidth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBorderWidth(Integer borderWidth)
	{
		this.borderWidth = borderWidth;
		return (J) this;
	}

	/**
	 * color of the border adjacent to the axis.
	 * <p>
	 *
	 * @return
	 */
	public String getBorderColor()
	{
		return borderColor;
	}

	/**
	 * color of the border adjacent to the axis.
	 * <p>
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
	 * true to try and synchronize tick spacing across multiple axes so that ticks and grid lines line up.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getSyncTicks()
	{
		return syncTicks;
	}

	/**
	 * true to try and synchronize tick spacing across multiple axes so that ticks and grid lines line up.
	 * <p>
	 *
	 * @param syncTicks
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSyncTicks(Boolean syncTicks)
	{
		this.syncTicks = syncTicks;
		return (J) this;
	}

	/**
	 * Approximate pixel spacing between ticks on graph.
	 * <p>
	 *
	 * @return
	 */
	public Integer getTickSpacing()
	{
		return tickSpacing;
	}

	/**
	 * Approximate pixel spacing between ticks on graph.
	 * <p>
	 *
	 * @param tickSpacing
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTickSpacing(Integer tickSpacing)
	{
		this.tickSpacing = tickSpacing;
		return (J) this;
	}

	/**
	 * Returns the assigned axis renderer options
	 *
	 * @return
	 */
	public O getRendererOptions()
	{
		return rendererOptions;
	}

	/**
	 * The the options
	 * <p>
	 *
	 * @param rendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRendererOptions(O rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		renderer = rendererOptions.getRenderer();
		return (J) this;
	}

	/**
	 * Returns the renderer
	 *
	 * @return
	 */
	public String getRenderer()
	{
		return renderer;
	}

	/**
	 * Gets the label renderer options JQPlotAxisLabelRendererOptionsCanvasLabels by default
	 *
	 * @return
	 */
	public JQPlotAxisLabelRenderer getLabelRendererOptions()
	{
		if (labelRendererOptions == null)
		{
			setLabelRendererOptions(new JQPlotAxisLabelRendererOptionsCanvasLabels(getLinkedGraph()));
		}
		return labelRendererOptions;
	}

	/**
	 * Returns the linked graph to this options
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
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
	public J setLinkedGraph(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		return (J) this;
	}

	/**
	 * Sets the label renderer options
	 *
	 * @param labelRendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabelRendererOptions(JQPlotAxisLabelRenderer labelRendererOptions)
	{
		this.labelRendererOptions = labelRendererOptions;
		labelRenderer = labelRendererOptions.getRenderer();
		return (J) this;
	}

	/**
	 * Returns the label renderer string assigned with this axis plot
	 *
	 * @return
	 */
	public String getLabelRenderer()
	{
		return labelRenderer;
	}

}
