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
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.generics.CompassPoints;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.options.legends.JQPlotLegendRendererEnhancedOptions;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotLegendRenderer;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * The Legend options
 * <p>
 *
 * @param <O>
 *
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
public class JQPlotLegendOptions<O extends JavaScriptPart & JQPlotLegendRenderer, J extends JQPlotLegendOptions<O, J>>
		extends JavaScriptPart<J>
{
	/**
	 * The legend renderer string
	 */
	@JsonRawValue
	private String renderer;

	/**
	 * The legend renderer options
	 */
	private O rendererOptions;

	/**
	 * Whether to display the legend on the graph.
	 */
	private Boolean show;
	/**
	 * Placement of the legend. compass direction, nw, n, ne, e, se, s, sw, w.
	 */
	private CompassPoints location;
	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 */
	private Integer xoffset;
	/**
	 * pixel offset of the legend box from the y (or y2) axis.
	 */
	private Integer yoffset;

	/**
	 * Array of labels to use.
	 */
	private List<String> labels;
	/**
	 * true to show the label text on the legend.
	 */
	private Boolean showLabels;
	/**
	 * true to show the color swatches on the legend.
	 */
	private Boolean showSwatch;
	/**
	 * “insideGrid? places legend inside the grid area of the plot.
	 */
	private String placement;
	/**
	 * CSS spec for the border around the legend box.
	 */
	private String border;
	/**
	 * CSS spec for the background of the legend box.
	 */
	private String background;
	/**
	 * CSS color spec for the legend text.
	 */
	private String textColor;
	/**
	 * CSS font-family spec for the legend text.
	 */
	private FontFamilies fontFamily;
	/**
	 * CSS font-size spec for the legend text.
	 */
	private Integer fontSize;
	/**
	 * CSS padding-top spec for the rows in the legend.
	 */
	private Integer rowSpacing;

	/**
	 * Whether to draw the legend before the series or not.
	 */
	private Boolean predraw;
	/**
	 * CSS margin for the legend DOM element.
	 */
	private Integer marginTop;
	/**
	 * CSS margin for the legend DOM element.
	 */
	private Integer marginRight;
	/**
	 * CSS margin for the legend DOM element.
	 */
	private Integer marginBottom;
	/**
	 * CSS margin for the legend DOM element.
	 */
	private Integer marginLeft;

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * Sets the linked graph for this options
	 *
	 * @param linkedGraph
	 */
	public JQPlotLegendOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Whether to display the legend on the graph.
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Whether to display the legend on the graph.
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
	 * Placement of the legend. compass direction, nw, n, ne, e, se, s, sw, w.
	 * <p>
	 *
	 * @return
	 */
	public CompassPoints getLocation()
	{
		return location;
	}

	/**
	 * Placement of the legend. compass direction, nw, n, ne, e, se, s, sw, w.
	 * <p>
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
	 * pixel offset of the legend box from the x (or x2) axis.
	 * <p>
	 */
	public Integer getXoffset()
	{
		return xoffset;
	}

	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 * <p>
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setXoffset(Integer xoffset)
	{
		this.xoffset = xoffset;
		return (J) this;
	}

	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 * <p>
	 */
	public Integer getYoffset()
	{
		return yoffset;
	}

	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 * <p>
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setYoffset(Integer yoffset)
	{
		this.yoffset = yoffset;
		return (J) this;
	}

	/**
	 * Custom list of labels
	 * <p>
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
	 * Sets a custom display list for labels
	 * <p>
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
	 * Sets to show the labels or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowLabels()
	{
		return showLabels;
	}

	/**
	 * Sets to show the labels
	 * <p>
	 *
	 * @param showLabels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowLabels(Boolean showLabels)
	{
		this.showLabels = showLabels;
		return (J) this;
	}

	/**
	 * Whether to show the swatch or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowSwatch()
	{
		return showSwatch;
	}

	/**
	 * Whether to show the swatch or not
	 * <p>
	 *
	 * @param showSwatch
	 */
	public J setShowSwatch(Boolean showSwatch)
	{
		this.showSwatch = showSwatch;
		return (J) this;
	}

	/**
	 * ?insideGrid? places legend inside the grid area of the plot “outsideGrid? places the legend outside the grid but inside the plot container, shrinking the grid to accomodate
	 * the legend “inside?
	 * synonym for “insideGrid?,
	 * <p>
	 * “outside? places the legend ouside the grid area, but does not shrink the grid which can cause the legend to overflow the plot container.
	 * <p>
	 *
	 * @return
	 */
	public String getPlacement()
	{
		return placement;
	}

	/**
	 * ?insideGrid? places legend inside the grid area of the plot<p>
	 * “outsideGrid? places the legend outside the grid but inside the plot container, shrinking the grid to accomodate the legend<p>
	 * “inside? synonym for “insideGrid?,
	 * <p>
	 * “outside? places the legend ouside the grid area, but does not shrink the grid which can cause the legend to overflow the plot container.<p>
	 * <p>
	 *
	 * @param placement
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPlacement(String placement)
	{
		this.placement = placement;
		return (J) this;
	}

	/**
	 * CSS Border Configuration line
	 * <p>
	 *
	 * @return
	 */
	public String getBorder()
	{
		return border;
	}

	/**
	 * Sets the css border configuration
	 * <p>
	 *
	 * @param border
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBorder(String border)
	{
		this.border = border;
		return (J) this;
	}

	/**
	 * Sets the CSS Background
	 * <p>
	 *
	 * @return
	 */
	public String getBackground()
	{
		return background;
	}

	/**
	 * Sets the CSS Background
	 * <p>
	 *
	 * @param background
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackground(String background)
	{
		this.background = background;
		return (J) this;
	}

	/**
	 * Gets the text colour
	 * <p>
	 *
	 * @return
	 */
	public String getTextColor()
	{
		return textColor;
	}

	/**
	 * Sets the text colour
	 * <p>
	 *
	 * @param textColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTextColor(ColourHex textColor)
	{
		this.textColor = textColor.getValue();
		return (J) this;
	}

	/**
	 * Gets the font family used
	 * <p>
	 *
	 * @return
	 */
	public FontFamilies getFontFamily()
	{
		return fontFamily;
	}

	/**
	 * Sets the font family used
	 * <p>
	 *
	 * @param fontFamily
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFontFamily(FontFamilies fontFamily)
	{
		this.fontFamily = fontFamily;
		return (J) this;
	}

	/**
	 * Gets the font size
	 * <p>
	 *
	 * @return
	 */
	public Integer getFontSize()
	{
		return fontSize;
	}

	/**
	 * Sets the font size
	 * <p>
	 *
	 * @param fontSize
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFontSize(Integer fontSize)
	{
		this.fontSize = fontSize;
		return (J) this;
	}

	/**
	 * Gets the row spacing
	 * <p>
	 *
	 * @return
	 */
	public Integer getRowSpacing()
	{
		return rowSpacing;
	}

	/**
	 * Sets the row spacing
	 * <p>
	 *
	 * @param rowSpacing
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRowSpacing(Integer rowSpacing)
	{
		this.rowSpacing = rowSpacing;
		return (J) this;
	}

	/**
	 * Whether to draw the legend before the series or not.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getPredraw()
	{
		return predraw;
	}

	/**
	 * Whether to draw the legend before the series or not.
	 * <p>
	 *
	 * @param predraw
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPredraw(Boolean predraw)
	{
		this.predraw = predraw;
		return (J) this;
	}

	/**
	 * Sets the margin top
	 * <p>
	 *
	 * @return
	 */
	public Integer getMarginTop()
	{
		return marginTop;
	}

	/**
	 * Sets the margin top
	 * <p>
	 *
	 * @param marginTop
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarginTop(Integer marginTop)
	{
		this.marginTop = marginTop;
		return (J) this;
	}

	/**
	 * Sets the margin right
	 * <p>
	 *
	 * @return
	 */
	public Integer getMarginRight()
	{
		return marginRight;
	}

	/**
	 * Sets the margin right
	 * <p>
	 *
	 * @param marginRight
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarginRight(Integer marginRight)
	{
		this.marginRight = marginRight;
		return (J) this;
	}

	/**
	 * Gets the margin bottom
	 * <p>
	 *
	 * @return
	 */
	public Integer getMarginBottom()
	{
		return marginBottom;
	}

	/**
	 * Sets the margin bottom
	 * <p>
	 *
	 * @param marginBottom
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarginBottom(Integer marginBottom)
	{
		this.marginBottom = marginBottom;
		return (J) this;
	}

	/**
	 * Sets the margin left
	 * <p>
	 *
	 * @return
	 */
	public Integer getMarginLeft()
	{
		return marginLeft;
	}

	/**
	 * Sets the margin left
	 * <p>
	 *
	 * @param marginLeft
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarginLeft(Integer marginLeft)
	{
		this.marginLeft = marginLeft;
		return (J) this;
	}

	/**
	 * Legend Renderer Options
	 * <p>
	 * Defaults to JQPlotLegendRendererEnhancedOptions
	 *
	 * @return
	 */
	public O getRendererOptions()
	{
		if (rendererOptions == null)
		{
			setRendererOptions((O) new JQPlotLegendRendererEnhancedOptions(getLinkedGraph()));
		}
		return rendererOptions;
	}

	/**
	 * Gets the linked graph for this legends box
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Sets the linked graph for this box
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
	 * Sets legend renderer options
	 *
	 * @param rendererOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRendererOptions(O rendererOptions)
	{
		renderer = rendererOptions.getRenderer();
		this.rendererOptions = rendererOptions;
		return (J) this;
	}

	/**
	 * Returns the renderer string for the options
	 *
	 * @return
	 */
	public String getRenderer()
	{
		return renderer;
	}

}
