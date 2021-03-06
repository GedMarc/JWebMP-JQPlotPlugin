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
import com.jwebmp.core.Component;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotAxisLabelRenderer;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 29 Feb 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotAxisLabelRendererOptionsAxisLabels<J extends JQPlotAxisLabelRendererOptionsAxisLabels<J>>
		extends JavaScriptPart<J>
		implements JQPlotAxisLabelRenderer
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * whether or not to show the tick (mark and label).
	 */
	private Boolean show;
	/**
	 * The text or html for the label.
	 */
	private String label;
	/**
	 * true to escape HTML entities in the label.
	 */
	private Boolean escapeHTML;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotAxisLabelRendererOptionsAxisLabels(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.AxisLabelRenderer";
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
	 * Whether or not to show the axis
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Wheter or not to show the axis label
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
	 * Gets the label
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label to a component
	 *
	 * @param label
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(Component label)
	{
		label.setTiny(true);
		this.label = label.toString(true);
		setEscapeHTML(true);
		return (J) this;
	}

	/**
	 * Sets the label
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
	 * Whether or not to escape the html
	 *
	 * @return
	 */
	public Boolean getEscapeHTML()
	{
		return escapeHTML;
	}

	/**
	 * Whether or not to escape html in the label field
	 *
	 * @param escapeHTML
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEscapeHTML(Boolean escapeHTML)
	{
		this.escapeHTML = escapeHTML;
		return (J) this;
	}

}
