package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

public class GuitarSpec extends InstrumentSpec {
    private final int numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numStrings) {
        super(builder, type, backWood, topWood, model);
        this.numStrings = numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec guitar){
        if(!super.matches(guitar)){
            return false;
        }
        if(!(guitar instanceof GuitarSpec)){
            return false;
        }
        return numStrings == ((GuitarSpec) guitar).getNumStrings();
    }


    public int getNumStrings(){
        return numStrings;
    }
}
