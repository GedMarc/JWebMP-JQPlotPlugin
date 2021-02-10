package com.jwebmp.plugins.jqplot.graphs.display;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JQPlotBarSeries implements JQPlotSeriesItem {

    @JsonValue
    public List<Double> value = new ArrayList<>();

    public JQPlotBarSeries addValue(Double value) {
        this.value.add(value);
        return this;
    }

    public List<Double> getValue() {
        return value;
    }

    public JQPlotBarSeries setValue(List<Double> value) {
        this.value = value;
        return this;
    }
}
