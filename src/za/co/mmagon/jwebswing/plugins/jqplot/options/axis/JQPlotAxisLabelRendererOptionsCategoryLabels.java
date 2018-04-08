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
package za.co.mmagon.jwebswing.plugins.jqplot.options.axis;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.parts.interfaces.JQPlotAxisLabelRenderer;
import za.co.mmagon.jwebswing.plugins.jqplot.parts.interfaces.JQPlotTickRenderer;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 29 Feb 2016
 */
public class JQPlotAxisLabelRendererOptionsCategoryLabels<O extends JavaScriptPart & JQPlotTickRenderer, J extends JQPlotAxisLabelRendererOptionsCategoryLabels<O, J>>
		extends JavaScriptPart<J>
		implements JQPlotAxisLabelRenderer
{

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * True to sort tick labels when labels are created by merging x axis values from multiple series.
	 */
	private Boolean sortMergedLabels;
	/**
	 * A class of a rendering engine for creating the ticks labels displayed on the plot, See $.jqplot.AxisTickRenderer.
	 */
	private O tickRenderer;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotAxisLabelRendererOptionsCategoryLabels(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.CategoryAxisRenderer";
	}

	/**
	 * Gets the linked graph
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
	 * True to sort tick labels when labels are created by merging x axis values from multiple series.
	 *
	 * @return
	 */
	public Boolean getSortMergedLabels()
	{
		return sortMergedLabels;
	}

	/**
	 * True to sort tick labels when labels are created by merging x axis values from multiple series.
	 *
	 * @param sortMergedLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSortMergedLabels(Boolean sortMergedLabels)
	{
		this.sortMergedLabels = sortMergedLabels;
		return (J) this;
	}

	/**
	 * A class of a rendering engine for creating the ticks labels displayed on the plot, See $.jqplot.AxisTickRenderer.
	 *
	 * @return
	 */
	public O getTickRenderer()
	{
		return tickRenderer;
	}

	/**
	 * A class of a rendering engine for creating the ticks labels displayed on the plot, See $.jqplot.AxisTickRenderer.
	 *
	 * @param tickRenderer
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTickRenderer(O tickRenderer)
	{
		this.tickRenderer = tickRenderer;
		return (J) this;
	}

}
