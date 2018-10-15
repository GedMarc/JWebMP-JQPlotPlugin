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
package com.jwebmp.plugins.jqplot;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqplot.references.JQPlotCSSReferencePool;
import com.jwebmp.plugins.jqplot.references.JQPlotJavascriptReferencePool;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@PluginInformation(pluginName = "JqPlot",
		pluginUniqueName = "jq-plot",
		pluginDescription = "Computation and drawing of lines, axes, shadows even the grid itself is handled by pluggable \"renderers\". Not only are the plot elements customizable, plugins can expand functionality of the plot too! There are plenty of hooks into the core jqPlot code allowing for custom event handlers, creation of new plot types, adding canvases to the plot, and more!",
		pluginVersion = "1.9.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jqplot,jquery,graphs,graphing,plotting",
		pluginSubtitle = "A Versatile and Expandable jQuery Plotting Plugin!",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQMetroPlugin",
		pluginSourceUrl = "https://sourceforge.net/p/jwebswing/jquery-jqplot/ci/master/tree/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQMetroPlugin/wiki",
		pluginOriginalHomepage = "http://www.jqplot.com/",
		pluginSourceDonateUrl = "http://www.jqplot.com/donate.php",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQPlotPlugin.jar/download",
		pluginIconUrl = "bower_components/jqplot-jwebswing/jqplot_icon.jpg",
		pluginIconImageUrl = "bower_components/jqplot-jwebswing/jqplot_logo.png",
		pluginLastUpdatedDate = "2017/03/04")
public class JQPlotPageConfigurator
		implements IPageConfigurator<JQPlotPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public JQPlotPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQPlotPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQPlotPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.addCssReference(JQPlotCSSReferencePool.GraphCore.getReference());

			page.addJavaScriptReference(JQPlotJavascriptReferencePool.GraphCore.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.ExCanvas.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.BezierCurveRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.BarRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.BlockRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.BubbleRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CanvasAxisLabelRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CanvasAxisTickRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CanvasOverlayRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CanvasTextRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CategoryAxisRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CIParserRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.CursorRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.DateAxisRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.DoughnutRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.DraggableRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.EnhancedLegenedRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.EnhancedPieLegenedRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.FunnelRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.HighlightRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.JSON2Renderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.LogAxisRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.MekkoAxisRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.MekkoRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.MeterGaugeRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.Mobile.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.OHLCRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.PieRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.PointLabelsRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.PyramidAxisRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.PyramidGridRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.PyramidRenderer.getReference());
			page.addJavaScriptReference(JQPlotJavascriptReferencePool.TrendlineRenderer.getReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQPlotPageConfigurator.enabled;
	}
}
