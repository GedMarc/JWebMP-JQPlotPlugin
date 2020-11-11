package com.jwebmp.plugins.jqplot.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQPlotExclusionsModule
		implements IGuiceScanModuleExclusions<JQPlotExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqplot");
		return strings;
	}
}
