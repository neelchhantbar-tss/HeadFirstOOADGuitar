package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

public abstract class InstrumentSpec {
    private final Builder builder;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;
    private final String model;

    public InstrumentSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public boolean matches(InstrumentSpec spec){
        Builder builder = this.getBuilder();
        if ((builder != null) && (!builder.equals(spec.getBuilder())))
            return false;
        String model = this.getModel();
        if ((model != null) && (!model.equals(spec.getModel())))
            return false;
        Type type = this.getType();
        if ((type != null) && (!type.equals(spec.getType())))
            return false;
        Wood backWood = this.getBackWood();
        if ((backWood != null) && (!backWood.equals(spec.getBackWood())))
            return false;
        Wood topWood = this.getTopWood();
        if ((topWood != null) && (!topWood.equals(spec.getTopWood())))
            return false;

        return true;
    }
}
