package com.tss.RicksGuitarShop;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public record InstrumentSpec(Map<String, Object> properties) {

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties = Objects.requireNonNullElseGet(properties, HashMap::new);
    }

    public Object getProperty(String propertyName) {
        return properties.getOrDefault(propertyName, "Does Not Exist");
    }

    public boolean matches(InstrumentSpec spec) {
        for (String s : spec.properties().keySet()) {
            if (!this.getProperty(s).equals(spec.getProperty(s))) {
                return false;
            }
        }
        return true;
    }
}
