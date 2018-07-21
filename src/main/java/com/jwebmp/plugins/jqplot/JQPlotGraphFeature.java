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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * This is the default implementation of the JQPlot Graph Library
 *
 * @author mmagon
 * @version 2.0
 * 		<p>
 * 		2016/02/26 Update to the feature for 1.0.9 and updates to the JavaScript Engine
 * @since 2014/07/08
 */
public class JQPlotGraphFeature
		extends Feature<JavaScriptPart, JQPlotGraphFeature>
		implements JQPlotGraphFeatures, GlobalFeatures
{

	/**
	 * The graph this feature is linked to
	 */
	private JQPlotGraph graph;

	public JQPlotGraphFeature(JQPlotGraph forGraph)
	{
		super("JWGraphFeature");
		setComponent(forGraph);
		graph = forGraph;
		forGraph.addVariable(getVariableName());
	}

	public String getVariableName()
	{
		return graph.getID()
		            .replaceAll("-", "_") + "_plot";
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		getGraph().addVariable(getVariableName());
		StringBuilder sb = new StringBuilder();

		addQuery("$.jqplot.config.enablePlugins = true;" + getNewLine());

		sb.append("var ")
		  .append(getVariableName())
		  .append(" = ");
		sb.append(getComponent().getJQueryID())
		  .append("jqplot(");
		sb.append(graph.getDataPointRender())
		  .append(STRING_COMMNA)
		  .append(getNewLine());
		sb.append(getOptions());
		sb.append(");")
		  .append(getNewLine());
		addQuery(sb.toString());
	}

	/**
	 * Gets the graph with this feature
	 *
	 * @return
	 */
	public JQPlotGraph getGraph()
	{
		return graph;
	}

	/**
	 * Sets the graph for this feature
	 *
	 * @param graph
	 */
	public void setGraph(JQPlotGraph graph)
	{
		this.graph = graph;
	}
}
