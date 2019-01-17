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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.css.fonts.FontWeights;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotAxisLabelRenderer;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 29 Feb 2016
 */
public class JQPlotAxisLabelRendererOptionsCanvasLabels<J extends JQPlotAxisLabelRendererOptionsCanvasLabels<J>>
		extends JavaScriptPart<J>
		implements JQPlotAxisLabelRenderer
{


	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * angle of text, measured clockwise from x axis.
	 */
	private Integer angle;
	/**
	 * Whether or not to show the tick (mark and label).
	 */
	private Boolean show;
	/**
	 * Whether or not to show the label.
	 */
	private Boolean showLabel;
	/**
	 * label for the axis.
	 */
	private String label;
	/**
	 * CSS spec for the font-family css attribute.
	 */
	private FontFamilies fontFamily;
	/**
	 * CSS spec for font size.
	 */
	private Integer fontSize;
	/**
	 * The font weight
	 */
	private FontWeights fontWeight;
	/**
	 * Multiplier to condense or expand font width.
	 */
	private Integer fontStretch;
	/**
	 * CSS spec for the color attribute.
	 */
	private ColourHex textColor;
	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+.
	 */
	private Boolean enableFontSupport;
	/**
	 * Point to pixel scaling factor, used for computing height of bounding box around a label.
	 * The labels text renderer has a default setting of 1.4, which should be suitable for most fonts. Leave as null to use default.
	 * If tops of letters appear clipped, increase this.
	 * If bounding box seems too big, decrease.
	 * This is an issue only with the native font renderering capabilities of Mozilla 3.5 and Safari 4 since they do not provide a method to determine the font height.
	 */
	private Double pt2px;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotAxisLabelRendererOptionsCanvasLabels(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.CanvasAxisLabelRenderer";
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
	 * angle of text, measured clockwise from x axis.
	 * <p>
	 *
	 * @return
	 */
	public Integer getAngle()
	{
		return angle;
	}

	/**
	 * angle of text, measured clockwise from x axis.
	 * <p>
	 *
	 * @param angle
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAngle(Integer angle)
	{
		this.angle = angle;
		return (J) this;
	}

	/**
	 * to show or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * whether or not to show the label render
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
	 * Gets the label to be shown
	 * <p>
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label to be shown
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
	 * Gets the font family for the label
	 * <p>
	 *
	 * @return
	 */
	public FontFamilies getFontFamily()
	{
		return fontFamily;
	}

	/**
	 * Sets the font family for the label
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
	 * Gets the current font size
	 * <p>
	 *
	 * @return
	 */
	public Integer getFontSize()
	{
		return fontSize;
	}

	/**
	 * Sets the current font size
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
	 * Gets the current font weight
	 * <p>
	 *
	 * @return
	 */
	public FontWeights getFontWeight()
	{
		return fontWeight;
	}

	/**
	 * Sets the current font weight
	 * <p>
	 *
	 * @param fontWeight
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFontWeight(FontWeights fontWeight)
	{
		this.fontWeight = fontWeight;
		return (J) this;
	}

	/**
	 * Multiplier to condense or expand font width.
	 * <p>
	 *
	 * @return
	 */
	public Integer getFontStretch()
	{
		return fontStretch;
	}

	/**
	 * Multiplier to condense or expand font width.
	 * <p>
	 *
	 * @param fontStretch
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFontStretch(Integer fontStretch)
	{
		this.fontStretch = fontStretch;
		return (J) this;
	}

	/**
	 * Gets the current text colour
	 * <p>
	 *
	 * @return
	 */
	public ColourHex getTextColor()
	{
		return textColor;
	}

	/**
	 * Sets the current text colour
	 * <p>
	 *
	 * @param textColor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTextColor(ColourHex textColor)
	{
		this.textColor = textColor;
		return (J) this;
	}

	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getEnableFontSupport()
	{
		return enableFontSupport;
	}

	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+.
	 * <p>
	 *
	 * @param enableFontSupport
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEnableFontSupport(Boolean enableFontSupport)
	{
		this.enableFontSupport = enableFontSupport;
		return (J) this;
	}

	/**
	 * Point to pixel scaling factor, used for computing height of bounding box around a label.
	 * The labels text renderer has a default setting of 1.4, which should be suitable for most fonts. Leave as null to use default.
	 * If tops of letters appear clipped, increase this.
	 * If bounding box seems too big, decrease.
	 * This is an issue only with the native font renderering capabilities of Mozilla 3.5 and Safari 4 since they do not provide a method to determine the font height.
	 * <p>
	 *
	 * @return
	 */
	public Double getPt2px()
	{
		return pt2px;
	}

	/**
	 * Point to pixel scaling factor, used for computing height of bounding box around a label.
	 * The labels text renderer has a default setting of 1.4, which should be suitable for most fonts. Leave as null to use default.
	 * If tops of letters appear clipped, increase this.
	 * If bounding box seems too big, decrease.
	 * This is an issue only with the native font renderering capabilities of Mozilla 3.5 and Safari 4 since they do not provide a method to determine the font height.
	 * <p>
	 *
	 * @param pt2px
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPt2px(Double pt2px)
	{
		this.pt2px = pt2px;
		return (J) this;
	}

}
