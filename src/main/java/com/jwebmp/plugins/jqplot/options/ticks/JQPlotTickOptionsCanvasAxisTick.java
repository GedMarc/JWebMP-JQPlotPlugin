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
package com.jwebmp.plugins.jqplot.options.ticks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotTickRenderer;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
public class JQPlotTickOptionsCanvasAxisTick<J extends JQPlotTickOptionsCanvasAxisTick<J>>
		extends JavaScriptPart<J>
		implements JQPlotTickRenderer
{


	@JsonIgnore
	private final JQPlotGraph linkedGraph;
	/**
	 * tick mark on the axis. One of ‘inside’, ‘outside’, ‘cross’, ‘’ or null.
	 */
	private String mark;
	/**
	 * Whether or not to show the mark on the axis.
	 */
	private Boolean showMark;
	/**
	 * Whether or not to draw the gridline on the grid at this tick.
	 */
	private Boolean showGridline;
	/**
	 * css spec for the font-size css attribute.
	 */
	private Integer angle;
	/**
	 * if this is a minor tick.
	 */
	private Boolean isMinorTick;
	/**
	 * Length of the tick marks in pixels.
	 */
	private Boolean markSize;
	/**
	 * Whether or not to show the tick (mark and label).
	 */
	private Boolean show;
	/**
	 * wether or not to show the label.
	 */
	private Boolean showLabel;
	/**
	 * A class of a formatter for the tick text. $.jqplot.DefaultTickFormatter
	 * <p>
	 * A class of a formatter for the tick text. sprintf by default.
	 */
	private String formatter;
	/**
	 * String to prepend to the tick label.
	 */
	private String prefix;
	/**
	 * string passed to the formatter.
	 * <p>
	 */
	private String formatString;
	/**
	 * css spec for the font-family css attribute.
	 */
	private FontFamilies fontFamily;
	/**
	 * css spec for the font-size css attribute.
	 */
	private Integer fontSize;
	/**
	 * css spec for the color attribute.
	 */
	private ColourHex textColor;
	/**
	 * true to escape HTML entities in the label.
	 */
	private Boolean escapeHTML;
	/**
	 * ‘auto’, ‘start’, ‘middle’ or ‘end’.
	 */
	private String labelPosition;

	/**
	 * Constructs a new tick options canvas
	 *
	 * @param linkedGraph
	 */
	public JQPlotTickOptionsCanvasAxisTick(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * tick mark on the axis. One of ‘inside’, ‘outside’, ‘cross’, ‘’ or null.
	 * <p>
	 *
	 * @return
	 */
	public String getMark()
	{
		return mark;
	}

	/**
	 * tick mark on the axis. One of ‘inside’, ‘outside’, ‘cross’, ‘’ or null.
	 * <p>
	 *
	 * @param mark
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMark(String mark)
	{
		this.mark = mark;
		return (J) this;
	}

	/**
	 * Show the mark or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowMark()
	{
		return showMark;
	}

	/**
	 * Show the mark or not
	 * <p>
	 *
	 * @param showMark
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowMark(Boolean showMark)
	{
		this.showMark = showMark;
		return (J) this;
	}

	/**
	 * Whether to show the grid line
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowGridline()
	{
		return showGridline;
	}

	/**
	 * Whether to show the grid line
	 * <p>
	 *
	 * @param showGridline
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowGridline(Boolean showGridline)
	{
		this.showGridline = showGridline;
		return (J) this;
	}

	/**
	 * The angle of the text
	 * <p>
	 *
	 * @return
	 */
	public Integer getAngle()
	{
		return angle;
	}

	/**
	 * The angle of the text
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
	 * Display minor ticks or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getIsMinorTick()
	{
		return isMinorTick;
	}

	/**
	 * Display minor ticks or not
	 * <p>
	 *
	 * @param isMinorTick
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIsMinorTick(Boolean isMinorTick)
	{
		this.isMinorTick = isMinorTick;
		return (J) this;
	}

	/**
	 * Gets the mark size
	 * <p>
	 *
	 * @return
	 */
	public Boolean getMarkSize()
	{
		return markSize;
	}

	/**
	 * Sets the mark size
	 * <p>
	 *
	 * @param markSize
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMarkSize(Boolean markSize)
	{
		this.markSize = markSize;
		return (J) this;
	}

	/**
	 * Whether or not to show the ticks
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Whether or not to show the ticks
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
	 * Whether or not to show the label
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShowLabel()
	{
		return showLabel;
	}

	/**
	 * Whether or not to show the label
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
	 * Get a sprintf formatter
	 * <p>
	 *
	 * @return
	 */
	public String getFormatter()
	{
		return formatter;
	}

	/**
	 * Set the sprint f format string
	 * <p>
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
	 * Text to display before the value
	 * <p>
	 *
	 * @return
	 */
	public String getPrefix()
	{
		return prefix;
	}

	/**
	 * Text to display before the prefix
	 * <p>
	 *
	 * @param prefix
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPrefix(String prefix)
	{
		this.prefix = prefix;
		return (J) this;
	}

	/**
	 * The string to pass to the formatter
	 * <p>
	 *
	 * @return
	 */
	public String getFormatString()
	{
		return formatString;
	}

	/**
	 * The string to pass to the formatter
	 * <p>
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
	 * The CSS Font Family
	 * <p>
	 *
	 * @return
	 */
	public FontFamilies getFontFamily()
	{
		return fontFamily;
	}

	/**
	 * The CSS Font Family
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
	 * The font size setting
	 * <p>
	 *
	 * @return
	 */
	public Integer getFontSize()
	{
		return fontSize;
	}

	/**
	 * The font size setting
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
	 * The text colour
	 * <p>
	 *
	 * @return
	 */
	public ColourHex getTextColor()
	{
		return textColor;
	}

	/**
	 * The text colour
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
	 * Escape html characters in the axis label or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getEscapeHTML()
	{
		return escapeHTML;
	}

	/**
	 * Escape html characters in the axis label or not
	 * <p>
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
	 * ‘auto’, ‘start’, ‘middle’ or ‘end’.
	 * <p>
	 *
	 * @return
	 */
	public String getLabelPosition()
	{
		return labelPosition;
	}

	/**
	 * ‘auto’, ‘start’, ‘middle’ or ‘end’.
	 * <p>
	 *
	 * @param labelPosition
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabelPosition(String labelPosition)
	{
		this.labelPosition = labelPosition;
		return (J) this;
	}

	@Override
	@JsonRawValue
	public String getRenderer()
	{
		return "$.jqplot.CanvasAxisTickRenderer";
	}
}
