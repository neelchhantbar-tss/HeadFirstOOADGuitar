package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

public class GuitarSpec {
    private final Builder builder;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;
    private final String model;
    private final int numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numStrings) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec guitar){
        Builder builder = this.getBuilder();
        if ((builder != null) && (!builder.equals(guitar.getBuilder())))
            return false;
        String model = this.getModel();
        if ((model != null) && (!model.equals(guitar.getModel())))
            return false;
        Type type = this.getType();
        if ((type != null) && (!type.equals(guitar.getType())))
            return false;
        Wood backWood = this.getBackWood();
        if ((backWood != null) && (!backWood.equals(guitar.getBackWood())))
            return false;
        Wood topWood = this.getTopWood();
        if ((topWood != null) && (!topWood.equals(guitar.getTopWood())))
            return false;
        if(numStrings != guitar.getNumStrings()){
            return false;
        }
        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
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

    public int getNumStrings(){
        return numStrings;
    }
}
