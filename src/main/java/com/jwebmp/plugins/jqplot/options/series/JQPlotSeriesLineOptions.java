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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import jakarta.validation.constraints.NotNull;

/**
 * The properties for a line graph
 *
 * @author GedMarc
 * @version 1.0
 * @since 09 Aug 2015
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotSeriesLineOptions<J extends JQPlotSeriesLineOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotSeriesRenderer
{
	/**
	 * The graph that this is linked to
	 */
	@JsonIgnore
	private JQPlotGraph<?,?> linkedGraph;
	/**
	 * True to draw a smoothed (interpolated) line through the data points with automatically computed number of smoothing points.
	 */
	private Boolean smooth;
	/**
	 * True to use a more accurate smoothing algorithm that will not overshoot any data points.
	 */
	private Boolean constrainSmoothing;
	/**
	 * Data used to draw error bands or confidence intervals above/below a line.
	 */
	private String bandData;

	/**
	 * Constructs a new Line Options for the given graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotSeriesLineOptions(JQPlotGraph<?,?> linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Gets the graph associated with this options
	 *
	 * @return
	 */
	public JQPlotGraph<?,?> getLinkedGraph()
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
	public J setLinkedGraph(JQPlotGraph<?,?> linkedGraph)
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
		return "$.jqplot.LineRenderer";
	}

	/**
	 * True to draw a smoothed (interpolated) line through the data points with automatically computed number of smoothing points.
	 *
	 * @return
	 */
	public Boolean getSmooth()
	{
		return smooth;
	}

	/**
	 * True to draw a smoothed (interpolated) line through the data points with automatically computed number of smoothing points.
	 *
	 * @param smooth
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSmooth(Boolean smooth)
	{
		this.smooth = smooth;
		return (J) this;
	}

	/**
	 * True to use a more accurate smoothing algorithm that will not overshoot any data points.
	 *
	 * @return
	 */
	public Boolean getConstrainSmoothing()
	{
		return constrainSmoothing;
	}

	/**
	 * *
	 * True to use a more accurate smoothing algorithm that will not overshoot any data points.
	 *
	 * @param constrainSmoothing
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setConstrainSmoothing(Boolean constrainSmoothing)
	{
		this.constrainSmoothing = constrainSmoothing;
		return (J) this;
	}

	/**
	 * *
	 * A 2 dimensional array like [[yl1, yl2, ...], [yu1, yu2, ...]] where [yl1, yl2, ...] are y values of the lower line and [yu1, yu2, ...] are y values of the upper line. In
	 * this case there must be
	 * the same number of y data points as data points in the series and the bands will inherit the x values of the series.
	 * <p>
	 * A 2 dimensional array like [[[xl1, yl1], [xl2, yl2], ...], [[xh1, yh1], [xh2, yh2], ...]] where [xl1, yl1] are x,y data points for the lower line and [xh1, yh1] are x,y data
	 * points for the high
	 * line. x values do not have to correspond to the x values of the series and can be of any arbitrary length.
	 * <p>
	 * Can be of form [[yl1, yu1], [yl2, yu2], [yl3, yu3], ...] where there must be 3 or more arrays and there must be the same number of arrays as there are data points in the
	 * series. In this case,
	 * [yl1, yu1] specifies the lower and upper y values for the 1st data point and so on. The bands will inherit the x values from the series.
	 *
	 * @return
	 */
	public String getBandData()
	{
		return bandData;
	}

	/**
	 * *
	 * A 2 dimensional array like [[yl1, yl2, ...], [yu1, yu2, ...]] where [yl1, yl2, ...] are y values of the lower line and [yu1, yu2, ...] are y values of the upper line. In
	 * this case there must be
	 * the same number of y data points as data points in the series and the bands will inherit the x values of the series.
	 * <p>
	 * A 2 dimensional array like [[[xl1, yl1], [xl2, yl2], ...], [[xh1, yh1], [xh2, yh2], ...]] where [xl1, yl1] are x,y data points for the lower line and [xh1, yh1] are x,y data
	 * points for the high
	 * line. x values do not have to correspond to the x values of the series and can be of any arbitrary length.
	 * <p>
	 * Can be of form [[yl1, yu1], [yl2, yu2], [yl3, yu3], ...] where there must be 3 or more arrays and there must be the same number of arrays as there are data points in the
	 * series. In this case,
	 * [yl1, yu1] specifies the lower and upper y values for the 1st data point and so on. The bands will inherit the x values from the series.
	 *
	 * @param bandData
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBandData(String bandData)
	{
		this.bandData = bandData;
		return (J) this;
	}

}
