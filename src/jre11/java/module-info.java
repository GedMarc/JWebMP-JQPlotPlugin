import com.jwebmp.plugins.jqplot.implementations.JQPlotInclusionModule;

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
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqplot.JQPlotPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQPlotInclusionModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqplot.implementations.JQPlotExclusionsModule;

	opens com.jwebmp.plugins.jqplot to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.parts.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.axis to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.grid to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.legends to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.series to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.ticks to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.title to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.graphs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.graphs.display to com.fasterxml.jackson.databind, com.jwebmp.core;
}
