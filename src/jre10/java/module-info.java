import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqplot.JQPlotPageConfigurator;

module com.jwebmp.plugins.jqplot {
	exports com.jwebmp.plugins.jqplot;
	exports com.jwebmp.plugins.jqplot.parts;
	exports com.jwebmp.plugins.jqplot.parts.interfaces;
	exports com.jwebmp.plugins.jqplot.options;
	exports com.jwebmp.plugins.jqplot.options.axis;
	exports com.jwebmp.plugins.jqplot.options.grid;
	exports com.jwebmp.plugins.jqplot.options.legends;
	exports com.jwebmp.plugins.jqplot.options.series;
	exports com.jwebmp.plugins.jqplot.options.ticks;
	exports com.jwebmp.plugins.jqplot.options.title;

	exports com.jwebmp.plugins.jqplot.graphs;
	exports com.jwebmp.plugins.jqplot.graphs.display;
	exports com.jwebmp.plugins.jqplot.references;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQPlotPageConfigurator;

}
