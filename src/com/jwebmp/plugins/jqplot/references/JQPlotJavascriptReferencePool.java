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
package com.jwebmp.plugins.jqplot.references;

import com.jwebmp.base.references.JavascriptReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum JQPlotJavascriptReferencePool
{

	/**
	 * The basic core for the graphing system
	 */
	GraphCore(new JavascriptReference("jqPlot", 1.09, "bower_components/jqplot-jwebswing/jquery.jqplot.min.js",
	                                  "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/jquery.jqplot.min.js", 15)),
	/**
	 * If the ie is less than version 9 this is required
	 */
	ExCanvas(new JavascriptReference("excanvas", 1.09, "bower_components/jqplot-jwebswing/excanvas.min.js", "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/excanvas.min.js",
	                                 16)),
	/**
	 * Builds a Bezier Curve Graph
	 */
	BezierCurveRenderer(new JavascriptReference("jqplotBezeierCurve", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.BezierCurveRenderer.min.js",
	                                            "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.BezierCurveRenderer.min.js", 17)),
	/**
	 * Renders the Bars
	 */
	BarRenderer(new JavascriptReference("jqplotBar", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.barRenderer.min.js",
	                                    "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.barRenderer.min.js", 20)),
	//AxisLabelRenderer(new JavascriptReference("jqplotAxisLabelRenderer", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.axisLabelRenderer.min.js", "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.axisLabelRenderer.min.js", 17)),
	BlockRenderer(new JavascriptReference("jqplotBlock", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.blockRenderer.min.js",
	                                      "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.blockRenderer.min.js", 20)),
	BubbleRenderer(new JavascriptReference("jqplotBubble", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.bubbleRenderer.min.js",
	                                       "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.bubbleRenderer.min.js", 20)),
	CanvasAxisLabelRenderer(new JavascriptReference("jqplotAxisLabel", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.canvasAxisLabelRenderer.min.js",
	                                                "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.canvasAxisLabelRenderer.min.js", 17)),
	CanvasAxisTickRenderer(new JavascriptReference("jqplotAxisTickLabel", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.canvasAxisTickRenderer.min.js",
	                                               "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.canvasAxisTickRenderer.min.js", 17)),
	CanvasOverlayRenderer(new JavascriptReference("jqplotCanvasOverlay", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.canvasOverlay.min.js",
	                                              "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.canvasOverlay.min.js", 20)),
	CanvasTextRenderer(new JavascriptReference("jqplotTextRenderer", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.canvasTextRenderer.min.js",
	                                           "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.canvasTextRenderer.min.js", 16)),
	CategoryAxisRenderer(new JavascriptReference("jqplotCategoryAxisRenderer", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.categoryAxisRenderer.min.js",
	                                             "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.categoryAxisRenderer.min.js", 17)),
	CIParserRenderer(new JavascriptReference("jqplotCIParser", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.ciParser.min.js",
	                                         "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.ciParser.min.js", 17)),
	CursorRenderer(new JavascriptReference("jqplotCursor", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.cursor.min.js",
	                                       "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.cursor.min.js", 17)),
	DateAxisRenderer(new JavascriptReference("jqplotDateAxis", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.dateAxisRenderer.min.js",
	                                         "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.dateAxisRenderer.min.js", 17)),
	DoughnutRenderer(new JavascriptReference("jqplotDoughnut", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.donutRenderer.min.js",
	                                         "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.donutRenderer.min.js", 20)),
	DraggableRenderer(new JavascriptReference("jqplotDrag", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.dragable.min.js",
	                                          "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.dragable.min.js", 17)),
	EnhancedLegenedRenderer(new JavascriptReference("jqplotEnhancedLegend", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.enhancedLegendRenderer.min.js",
	                                                "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.enhancedLegendRenderer.min.js", 20)),
	EnhancedPieLegenedRenderer(new JavascriptReference("jqplotEnhancedLegend", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.enhancedPieLegendRenderer.min.js",
	                                                   "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.enhancedPieLegendRenderer.min.js", 20)),
	FunnelRenderer(new JavascriptReference("jqplotFunnel", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.funnelRenderer.min.js",
	                                       "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.funnelRenderer.min.js", 20)),
	HighlightRenderer(new JavascriptReference("jqplotHighlight", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.highlighter.min.js",
	                                          "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.highlighter.min.js", 17)),
	JSON2Renderer(new JavascriptReference("jqplotJSON2", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.json2.min.js",
	                                      "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.json2.min.js", 16)),
	LogAxisRenderer(new JavascriptReference("jqplotLogAxis", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.logAxisRenderer.min.js",
	                                        "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.logAxisRenderer.min.js", 17)),
	MekkoAxisRenderer(new JavascriptReference("jqplotMekkoAxis", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.mekkoAxisRenderer.min.js",
	                                          "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.mekkoAxisRenderer.min.js", 20)),
	MekkoRenderer(new JavascriptReference("jqplotMekko", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.mekkoRenderer.min.js",
	                                      "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.mekkoRenderer.min.js", 20)),
	MeterGaugeRenderer(new JavascriptReference("jqplotMeter", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.meterGaugeRenderer.min.js",
	                                           "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.meterGaugeRenderer.min.js", 20)),
	Mobile(new JavascriptReference("jqplotMobile", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.mobile.min.js",
	                               "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.mobile.min.js", 16)),
	OHLCRenderer(new JavascriptReference("jqplotOLHC", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.ohlcRenderer.min.js",
	                                     "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.ohlcRenderer.min.js", 20)),
	PieRenderer(new JavascriptReference("jqplotPie", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.pieRenderer.min.js",
	                                    "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.pieRenderer.min.js", 20)),
	PointLabelsRenderer(new JavascriptReference("jqplotPointLabels", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.pointLabels.min.js",
	                                            "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.pointLabels.min.js", 20)),
	PyramidAxisRenderer(new JavascriptReference("jqplotPyramidAxisRender", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.pyramidAxisRenderer.min.js",
	                                            "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.pyramidAxisRenderer.min.js", 20)),
	PyramidGridRenderer(new JavascriptReference("jqplotPyramidGridRender", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.pyramidGridRenderer.min.js",
	                                            "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.pyramidGridRenderer.min.js", 20)),
	PyramidRenderer(new JavascriptReference("jqplotPyramid", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.pyramidRenderer.min.js",
	                                        "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.pyramidRenderer.min.js", 20)),
	TrendlineRenderer(new JavascriptReference("jqplotTrendLine", 1.09, "bower_components/jqplot-jwebswing/plugins/jqplot.trendline.min.js",
	                                          "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.9/plugins/jqplot.trendline.min.js", 20)),;
	private final JavascriptReference reference;

	JQPlotJavascriptReferencePool(JavascriptReference reference)
	{
		this.reference = reference;

	}

	public JavascriptReference getReference()
	{
		return reference;
	}

}
