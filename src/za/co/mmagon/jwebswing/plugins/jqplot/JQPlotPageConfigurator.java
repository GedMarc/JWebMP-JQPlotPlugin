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
package za.co.mmagon.jwebswing.plugins.jqplot;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
@PluginInformation(pluginName = "JqPlot",
                   pluginUniqueName = "jq-plot",
                   pluginDescription = "Computation and drawing of lines, axes, shadows even the grid itself is handled by pluggable \"renderers\". Not only are the plot elements customizable, plugins can expand functionality of the plot too! There are plenty of hooks into the core jqPlot code allowing for custom event handlers, creation of new plot types, adding canvases to the plot, and more!",
                   pluginVersion = "1.9.1",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "jqplot,jquery,graphs,graphing,plotting",
                   pluginSubtitle = "A Versatile and Expandable jQuery Plotting Plugin!",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin",
                   pluginSourceUrl = "https://sourceforge.net/p/jwebswing/jquery-jqplot/ci/master/tree/",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQMetroPlugin/wiki",
                   pluginOriginalHomepage = "http://www.jqplot.com/",
                   pluginSourceDonateUrl = "http://www.jqplot.com/donate.php",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQPlotPlugin.jar/download",
                   pluginIconUrl = "bower_components/jqplot-jwebswing/jqplot_icon.jpg",
                   pluginIconImageUrl = "bower_components/jqplot-jwebswing/jqplot_logo.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class JQPlotPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    public JQPlotPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {

        }
        return page;
    }
}
