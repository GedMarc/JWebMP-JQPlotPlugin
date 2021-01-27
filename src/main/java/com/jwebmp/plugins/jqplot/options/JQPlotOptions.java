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

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.options.axis.JQPlotAxisOptions;
import com.jwebmp.plugins.jqplot.options.grid.JQPlotGridOptionsCanvasGrid;
import com.jwebmp.plugins.jqplot.options.title.JQPlotTitleOptions;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotMarkerRenderer;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * The Global options allowed for a JQPlotGraph
 *
 * @author GedMarc
 * @since 26 Feb 2016
 */
@SuppressWarnings("MissingClassJavaDoc")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotOptions<J extends JQPlotOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Version 1
	 */
	@JsonIgnore
	private JQPlotGraph<?,?> linkedGraph;
	/**
	 * True to animate the series on initial plot draw (renderer dependent).
	 */
	@JsonIgnore
	private Boolean animate;
	/**
	 * True to animate series after a call to the replot() method. Replots can happen very frequently under certain circumstances (e.g. resizing, dragging points) and animation in
	 * these situations can
	 * cause problems.
	 */
	private Boolean animateReplot;
	/**
	 * false to not sort the data passed in by the user.
	 */
	private Boolean sortData;
	/**
	 * true or false, creates a stack or “mountain? plot.
	 */
	private Boolean stackSeries;
	/**
	 * if true, right-click events are intercepted and a jqplotRightClick event will be fired. This will also block the context menu.
	 */
	private Boolean captureRightClick;
	/**
	 * The Highlighter Plugin Options
	 */
	private JQPlotHighlightOptions<?,?> highlighter;
	/**
	 * The title options available
	 */
	private JQPlotTitleOptions<?,?> title;
	/**
	 * The cursor options available
	 */
	private JQPlotCursorOptions<?> cursor;
	/**
	 * A grouping of colours
	 */
	@JsonProperty("seriesColors")
	private List<String> seriesColours;
	/**
	 * A grouping of colours
	 */
	@JsonProperty("negativeSeriesColors")
	private List<String> negativeSeriesColours;
	/**
	 * The default options for all series
	 */
	private JQPlotSeriesOptions<?,?,?> seriesDefaults;
	/**
	 * Each series configuration in order of display
	 */
	private List<JQPlotSeriesOptions<?,?,?>> series;
	/**
	 * An array of all the axis available. Can be up to 9. Example [x,y,z] or [x,y1,x2,y2,y3,y4,y5,y6]
	 */
	private JQPlotAxes<?> axes;
	/**
	 * The default legendOptions
	 */
	@JsonProperty("legend")
	private JQPlotLegendOptions<?,?> legendOptions;
	/**
	 * The grid canvas options
	 */
	private JQPlotGridOptionsCanvasGrid<?> gridOptions;
	/**
	 * The default axis configuration
	 */
	private JQPlotAxisOptions<?,?> axesDefaults;
	
	/**
	 * A direct string for the canvas object
	 */
	@JsonProperty("canvasOverlay")
	@JsonRawValue
	private String canvas;

	/**
	 * The graph options available. This is the complete set
	 * <p>
	 *
	 * @param linkedGraph
	 * 		A linked graph if required
	 */
	public JQPlotOptions(JQPlotGraph<?,?> linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Gets the Title Part for this Graph
	 * <p>
	 *
	 * @return The Graph Title Part
	 */
	public JQPlotTitleOptions getTitle()
	{
		if (title == null)
		{
			title = new JQPlotTitleOptions("", linkedGraph);
		}
		return title;
	}

	/**
	 * Sets the Graph Title Part for this Graph
	 * <p>
	 *
	 * @param title
	 * 		The title object to set
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTitle(JQPlotTitleOptions title)
	{
		this.title = title;
		return (J) this;
	}

	/**
	 * Gets the Highlighter associated with this graph
	 * <p>
	 *
	 * @return
	 */
	public JQPlotHighlightOptions getHighlighter()
	{
		if (highlighter == null)
		{
			highlighter = new JQPlotHighlightOptions(linkedGraph);
		}
		return highlighter;
	}

	/**
	 * Sets the Highlighter for this graph
	 * <p>
	 *
	 * @param highlighter
	 * 		The highlighting to use
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHighlighter(JQPlotHighlightOptions highlighter)
	{
		this.highlighter = highlighter;
		return (J) this;
	}

	/**
	 * Get the cursor option associated with this graph
	 * <p>
	 *
	 * @return
	 */
	public JQPlotCursorOptions getCursor()
	{
		if (cursor == null)
		{
			cursor = new JQPlotCursorOptions(linkedGraph);
		}
		return cursor;
	}

	/**
	 * Sets the Cursor options associated with this graph
	 * <p>
	 *
	 * @param cursor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCursor(JQPlotCursorOptions cursor)
	{
		this.cursor = cursor;
		return (J) this;
	}

	/**
	 * Returns the series Colours that are associated with this Graph
	 * <p>
	 *
	 * @return
	 */
	public List<String> getSeriesColours()
	{
		if (seriesColours == null)
		{
			seriesColours = new ArrayList<>();
		}
		return seriesColours;
	}

	/**
	 * Set the series Colours to be used for this graph
	 * <p>
	 *
	 * @param seriesColours
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSeriesColours(List<String> seriesColours)
	{
		this.seriesColours = seriesColours;
		return (J) this;
	}

	/**
	 * Returns the series Colours that are associated with this Graph when negative
	 * <p>
	 *
	 * @return
	 */
	public List<String> getNegativeSeriesColours()
	{
		if (negativeSeriesColours == null)
		{
			negativeSeriesColours = new ArrayList<>();
		}
		return negativeSeriesColours;
	}

	/**
	 * Set the series Colours to be used for this graph when negative
	 * <p>
	 *
	 * @param negativeSeriesColours
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNegativeSeriesColours(List<String> negativeSeriesColours)
	{
		this.negativeSeriesColours = negativeSeriesColours;
		return (J) this;
	}

	/**
	 * Returns the current allocated series defaults
	 * <p>
	 *
	 * @return Null if not applied or is Line Graph
	 */
	public <O extends JavaScriptPart<?> & JQPlotSeriesRenderer, M extends JavaScriptPart<?> & JQPlotMarkerRenderer> JQPlotSeriesOptions<O, M, ?> getSeriesDefaults()
	{
		if (seriesDefaults == null)
		{
			seriesDefaults = new JQPlotSeriesOptions<>(linkedGraph);
		}
		return (JQPlotSeriesOptions<O, M, ?>) seriesDefaults;
	}

	/**
	 * Sets the current allocated Series Defaults.
	 * <p>
	 *
	 * @param seriesDefaults
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSeriesDefaults(JQPlotSeriesOptions seriesDefaults)
	{
		this.seriesDefaults = seriesDefaults;
		return (J) this;
	}

	/**
	 * Gets the array list of each series different options in order of addition
	 * <p>
	 *
	 * @return
	 */
	public List<JQPlotSeriesOptions<?,?,?>> getSeries()
	{
		if (series == null)
		{
			series = new ArrayList<>();
		}
		return series;
	}

	/**
	 * Sets the series configuration
	 * <p>
	 *
	 * @param series
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSeries(List<JQPlotSeriesOptions<?,?,?>> series)
	{
		this.series = series;
		return (J) this;
	}

	/**
	 * Gets the Axes Defaults
	 * <p>
	 *
	 * @return
	 */
	public JQPlotAxisOptions getAxesDefaults()
	{
		if (axesDefaults == null)
		{
			axesDefaults = new JQPlotAxisOptions(getLinkedGraph());
		}
		return axesDefaults;
	}

	/**
	 * Sets the Axes Defaults
	 * <p>
	 *
	 * @param axesDefaults
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAxesDefaults(JQPlotAxisOptions axesDefaults)
	{
		this.axesDefaults = axesDefaults;
		return (J) this;
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
	 * Returns the legendOptions options
	 * <p>
	 *
	 * @return
	 */
	public JQPlotLegendOptions getLegendOptions()
	{
		if (legendOptions == null)
		{
			legendOptions = new JQPlotLegendOptions(getLinkedGraph());
		}
		return legendOptions;
	}

	/**
	 * Sets the legendOptions options
	 * <p>
	 *
	 * @param legendOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLegendOptions(JQPlotLegendOptions legendOptions)
	{
		this.legendOptions = legendOptions;
		return (J) this;
	}

	/**
	 * Gets the grid options
	 * <p>
	 *
	 * @return
	 */
	public JQPlotGridOptionsCanvasGrid getGridOptions()
	{
		if (gridOptions == null)
		{
			gridOptions = new JQPlotGridOptionsCanvasGrid(getLinkedGraph());
		}
		return gridOptions;
	}

	/**
	 * Sets the grid options
	 * <p>
	 *
	 * @param gridOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGridOptions(JQPlotGridOptionsCanvasGrid gridOptions)
	{
		this.gridOptions = gridOptions;
		return (J) this;
	}

	@JsonProperty(value = "animate")
	@JsonRawValue
	/**
	 * True to animate the series on initial plot draw (renderer dependent).
	 * <p>
	 * @return
	 */ public String getAnimate()
	{
		if (animate == null)
		{
			return null;
		}
		if (animate)
		{
			return "!$.jqplot.use_excanvas";
		}
		else
		{
			return "false";
		}
	}

	/**
	 * True to animate the series on initial plot draw (renderer dependent).
	 * <p>
	 *
	 * @param animate
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnimate(Boolean animate)
	{
		this.animate = animate;
		return (J) this;
	}

	/**
	 * True to animate series after a call to the replot() method. Replots can happen very frequently under certain circumstances (e.g. resizing, dragging points) and animation in
	 * these situations can
	 * cause problems.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getAnimateReplot()
	{
		return animateReplot;
	}

	/**
	 * True to animate series after a call to the replot() method. Replots can happen very frequently under certain circumstances (e.g. resizing, dragging points) and animation in
	 * these situations can
	 * cause problems.
	 * <p>
	 *
	 * @param animateReplot
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnimateReplot(Boolean animateReplot)
	{
		this.animateReplot = animateReplot;
		return (J) this;
	}

	/**
	 * false to not sort the data passed in by the user.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getSortData()
	{
		return sortData;
	}

	/**
	 * false to not sort the data passed in by the user.
	 * <p>
	 *
	 * @param sortData
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSortData(Boolean sortData)
	{
		this.sortData = sortData;
		return (J) this;
	}

	/**
	 * true or false, creates a stack or “mountain? plot.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getStackSeries()
	{
		return stackSeries;
	}

	/**
	 * true or false, creates a stack or “mountain? plot.
	 * <p>
	 *
	 * @param stackSeries
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStackSeries(Boolean stackSeries)
	{
		this.stackSeries = stackSeries;
		return (J) this;
	}

	/**
	 * if true, right-click events are intercepted and a jqplotRightClick event will be fired. This will also block the context menu.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getCaptureRightClick()
	{
		return captureRightClick;
	}

	/**
	 * if true, right-click events are intercepted and a jqplotRightClick event will be fired. This will also block the context menu.
	 * <p>
	 *
	 * @param captureRightClick
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCaptureRightClick(Boolean captureRightClick)
	{
		this.captureRightClick = captureRightClick;
		return (J) this;
	}
	
	/**
	 * The canvas overlay property
	 * @return
	 */
	public String getCanvas()
	{
		return canvas;
	}
	
	/**
	 * The canvas overlay property
	 * @param canvas
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setCanvas(String canvas)
	{
		this.canvas = canvas;
		return (J) this;
	}
	
	/**
	 * An array of all the axis available. Can be up to 9. Example [x,y,z] or [x,y1,x2,y2,y3,y4,y5,y6]
	 * <p>
	 *
	 * @return A map in order for the options render
	 */
	public JQPlotAxes getAxes()
	{
		if (axes == null)
		{
			axes = new JQPlotAxes(linkedGraph);
		}
		return axes;
	}

	/**
	 * Sets the map in order
	 * <p>
	 *
	 * @param axes
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAxes(JQPlotAxes axes)
	{
		this.axes = axes;
		return (J) this;
	}

}
