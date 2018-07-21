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
package com.jwebmp.plugins.jqplot.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.generics.CompassPoints;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * The Point Labels
 *
 * @author GedMarc
 * @since 27 Feb 2016
 */
public class JQPlotPointLabelsOptions<J extends JQPlotPointLabelsOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * show the labels or not.
	 */
	private Boolean show;

	/**
	 * compass location where to position the label around the point.
	 */
	private CompassPoints location;
	/**
	 * true to use labels within data point arrays.
	 */
	private Boolean labelsFromSeries;
	/**
	 * array index for location of labels within data point arrays.
	 */
	private List<String> seriesLabelIndex;
	/**
	 * array of arrays of labels, one array for each series.
	 */
	private List<String> labels;
	/**
	 * true to display value as stacked in a stacked plot.
	 */
	private Boolean stackedValue;
	/**
	 * vertical padding in pixels between point and label
	 */
	private Integer ypadding;
	/**
	 * horizontal padding in pixels between point and label
	 */
	private Integer xpadding;
	/**
	 * true to escape html entities in the labels.
	 */
	private Boolean escapeHTML;//
	/**
	 * Number of pixels that the label must be away from an axis boundary in order to be drawn.
	 */
	private Integer edgeTolerance;//
	/**
	 * A class of a formatter for the tick text.
	 */
	private String formatter;
	/**
	 * string passed to the formatter.
	 */
	private String formatString;//
	/**
	 * true to not show a label for a value which is 0.
	 */
	private Boolean hideZeros;

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * Constructs a new point labels option
	 *
	 * @param linkedGraph
	 */
	public JQPlotPointLabelsOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Gets whether or not to show the point labels
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Sets whether or not to show point labels
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
	 * compass location where to position the label around the point.
	 *
	 * @return
	 */
	public CompassPoints getLocation()
	{
		return location;
	}

	/**
	 * compass location where to position the label around the point.
	 *
	 * @param location
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLocation(CompassPoints location)
	{
		this.location = location;
		return (J) this;
	}

	/**
	 * true to use labels within data point arrays.
	 *
	 * @return
	 */
	public Boolean getLabelsFromSeries()
	{
		return labelsFromSeries;
	}

	/**
	 * true to use labels within data point arrays.
	 *
	 * @param labelsFromSeries
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabelsFromSeries(Boolean labelsFromSeries)
	{
		this.labelsFromSeries = labelsFromSeries;
		return (J) this;
	}

	/**
	 * array index for location of labels within data point arrays.
	 *
	 * @return
	 */
	public List getSeriesLabelIndex()
	{
		return seriesLabelIndex;
	}

	/**
	 * array index for location of labels within data point arrays.
	 *
	 * @param seriesLabelIndex
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSeriesLabelIndex(List seriesLabelIndex)
	{
		this.seriesLabelIndex = seriesLabelIndex;
		return (J) this;
	}

	/**
	 * *
	 * array of arrays of labels, one array for each series.
	 *
	 * @return
	 */
	public List<String> getLabels()

	{
		if (labels == null)
		{
			labels = new ArrayList<>();
		}
		return labels;
	}

	/**
	 * array of arrays of labels, one array for each series.
	 *
	 * @param labels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabels(List<String> labels)
	{
		this.labels = labels;
		return (J) this;
	}

	/**
	 * true to display value as stacked in a stacked plot.
	 *
	 * @return
	 */
	public Boolean getStackedValue()
	{
		return stackedValue;
	}

	/**
	 * true to display value as stacked in a stacked plot.
	 *
	 * @param stackedValue
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStackedValue(Boolean stackedValue)
	{
		this.stackedValue = stackedValue;
		return (J) this;
	}

	/**
	 * vertical padding in pixels between point and label
	 *
	 * @return
	 */
	public Integer getYpadding()
	{
		return ypadding;
	}

	/**
	 * vertical padding in pixels between point and label
	 *
	 * @param ypadding
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setYpadding(Integer ypadding)
	{
		this.ypadding = ypadding;
		return (J) this;
	}

	/**
	 * horizontal padding in pixels between point and label
	 *
	 * @return
	 */
	public Integer getXpadding()
	{
		return xpadding;
	}

	/**
	 * horizontal padding in pixels between point and label
	 *
	 * @param xpadding
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setXpadding(Integer xpadding)
	{
		this.xpadding = xpadding;
		return (J) this;
	}

	/**
	 * true to escape html entities in the labels.
	 *
	 * @return
	 */
	public Boolean getEscapeHTML()
	{
		return escapeHTML;
	}

	/**
	 * true to escape html entities in the labels.
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

	/**
	 * Number of pixels that the label must be away from an axis boundary in order to be drawn.
	 *
	 * @return
	 */
	public Integer getEdgeTolerance()
	{
		return edgeTolerance;
	}

	/**
	 * Number of pixels that the label must be away from an axis boundary in order to be drawn.
	 *
	 * @param edgeTolerance
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEdgeTolerance(Integer edgeTolerance)
	{
		this.edgeTolerance = edgeTolerance;
		return (J) this;
	}

	/**
	 * A class of a formatter for the tick text. sprintf by default.
	 *
	 * @return
	 */
	public String getFormatter()
	{
		return formatter;
	}

	/**
	 * A class of a formatter for the tick text. sprintf by default.
	 *
	 * @param formatter
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFormatter(String formatter)
	{
		this.formatter = formatter;
		return (J) this;
	}

	/**
	 * string passed to the formatter.
	 *
	 * @return
	 */
	public String getFormatString()
	{
		return formatString;
	}

	/**
	 * string passed to the formatter.
	 *
	 * @param formatString
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFormatString(String formatString)
	{
		this.formatString = formatString;
		return (J) this;
	}

	/**
	 * Whether or not to hide zeros
	 *
	 * @return
	 */
	public Boolean getHideZeros()
	{
		return hideZeros;
	}

	/**
	 * Whether or not to hide zeros
	 *
	 * @param hideZeros
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHideZeros(Boolean hideZeros)
	{
		this.hideZeros = hideZeros;
		return (J) this;
	}

	/**
	 * gets the linked graph
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/*
	 * Sets the linked graph
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLinkedGraph(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		return (J) this;
	}

}
