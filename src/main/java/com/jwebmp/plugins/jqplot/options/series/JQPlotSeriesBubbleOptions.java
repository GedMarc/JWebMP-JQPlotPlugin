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
package com.jwebmp.plugins.jqplot.options.series;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * @since 09 Aug 2015
 */
public class JQPlotSeriesBubbleOptions<J extends JQPlotSeriesBubbleOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotSeriesRenderer
{


	/**
	 * The graph that this is linked to
	 */
	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 */
	private Boolean varyBubbleColors;
	/**
	 * True to scale the bubble radius based on plot size.
	 */

	private Boolean autoscaleBubbles;
	/**
	 * Multiplier the bubble size if autoscaleBubbles is true.
	 */

	private Integer autoscaleMultiplier;
	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 */

	private Integer autoscalePointsFactor;
	/**
	 * True to escape HTML in bubble label text.
	 */

	private Boolean escapeHtml;
	/**
	 * True to highlight bubbles when Moused over.
	 */

	private Boolean highlightMouseOver;
	/**
	 * True to highlight when a mouse button is pressed over a bubble.
	 */

	private Boolean highlightMouseDown;
	/**
	 * An array of colors to use when highlighting a slice.
	 */

	private String highlightColors;
	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 */

	private Double bubbleAlpha;
	/**
	 * Alpha transparency to apply when highlighting bubble.
	 */

	private Double highlightAlpha;
	/**
	 * True to color the bubbles with gradient fills instead of flat colors.;
	 */

	private Boolean bubbleGradients;
	/**
	 * True to show labels on bubbles (if any), false to not show.
	 */

	private Boolean showLabels;

	/**
	 * Constructs a new Bubble Options for the given graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotSeriesBubbleOptions(JQPlotGraph linkedGraph)
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
		return "$.jqplot.BubbleRenderer";
	}

	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 *
	 * @return
	 */
	public boolean getVaryBubbleColors()
	{
		return varyBubbleColors;
	}

	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 *
	 * @param varyBubbleColors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setVaryBubbleColors(boolean varyBubbleColors)
	{
		this.varyBubbleColors = varyBubbleColors;
		return (J) this;
	}

	/**
	 * True to scale the bubble radius based on plot size.
	 *
	 * @return
	 */
	public boolean getAutoscaleBubbles()
	{
		return autoscaleBubbles;
	}

	/**
	 * True to scale the bubble radius based on plot size.
	 *
	 * @param autoscaleBubbles
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoscaleBubbles(boolean autoscaleBubbles)
	{
		this.autoscaleBubbles = autoscaleBubbles;
		return (J) this;
	}

	/**
	 * Multiplier the bubble size if autoscaleBubbles get true.
	 *
	 * @return
	 */
	public int getAutoscaleMultiplier()
	{
		return autoscaleMultiplier;
	}

	/**
	 * Multiplier the bubble size if autoscaleBubbles get true.
	 *
	 * @param autoscaleMultiplier
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoscaleMultiplier(int autoscaleMultiplier)
	{
		this.autoscaleMultiplier = autoscaleMultiplier;
		return (J) this;
	}

	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 *
	 * @return
	 */
	public int getAutoscalePointsFactor()
	{
		return autoscalePointsFactor;
	}

	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 *
	 * @param autoscalePointsFactor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoscalePointsFactor(int autoscalePointsFactor)
	{
		this.autoscalePointsFactor = autoscalePointsFactor;
		return (J) this;
	}

	/**
	 * True to escape html in bubble label text.
	 *
	 * @return
	 */
	public boolean getEscapeHtml()
	{
		return escapeHtml;
	}

	/**
	 * True to escape html in bubble label text.
	 *
	 * @param escapeHtml
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEscapeHtml(boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return (J) this;
	}

	/**
	 * True to highlight bubbles when moused over.
	 *
	 * @return
	 */
	public boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	/**
	 * True to highlight bubbles when moused over.
	 *
	 * @param highlightMouseOver
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightMouseOver(boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return (J) this;
	}

	/**
	 * True to highlight when a mouse button get pressed over a bubble.
	 *
	 * @return
	 */
	public boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	/**
	 * True to highlight when a mouse button get pressed over a bubble.
	 *
	 * @param highlightMouseDown
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightMouseDown(boolean highlightMouseDown)
	{
		this.highlightMouseDown = highlightMouseDown;
		return (J) this;
	}

	/**
	 * An array of colors to use when highlighting a slice.
	 *
	 * @return
	 */
	public String getHighlightColors()
	{
		return highlightColors;
	}

	/**
	 * An array of colors to use when highlighting a slice.
	 *
	 * @param highlightColors
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightColors(String highlightColors)
	{
		this.highlightColors = highlightColors;
		return (J) this;
	}

	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 *
	 * @return
	 */
	public double getBubbleAlpha()
	{
		return bubbleAlpha;
	}

	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 *
	 * @param bubbleAlpha
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBubbleAlpha(double bubbleAlpha)
	{
		this.bubbleAlpha = bubbleAlpha;
		return (J) this;
	}

	/**
	 * Alpha transparency to apply when highlighting bubble.
	 *
	 * @return
	 */
	public double getHighlightAlpha()
	{
		return highlightAlpha;
	}

	/**
	 * Alpha transparency to apply when highlighting bubble.
	 *
	 * @param highlightAlpha
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlightAlpha(double highlightAlpha)
	{
		this.highlightAlpha = highlightAlpha;
		return (J) this;
	}

	/**
	 * True to color the bubbles with gradient fills instead of flat colors.
	 *
	 * @return
	 */
	public boolean getBubbleGradients()
	{
		return bubbleGradients;
	}

	/**
	 * True to color the bubbles with gradient fills instead of flat colors.
	 *
	 * @param bubbleGradients
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBubbleGradients(boolean bubbleGradients)
	{
		this.bubbleGradients = bubbleGradients;
		return (J) this;
	}

	/**
	 * True to show labels on bubbles (if any), false to not show.
	 *
	 * @return
	 */
	public boolean getShowLabels()
	{
		return showLabels;
	}

	/**
	 * True to show labels on bubbles (if any), false to not show.
	 *
	 * @param showLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowLabels(boolean showLabels)
	{
		this.showLabels = showLabels;
		return (J) this;
	}

}
