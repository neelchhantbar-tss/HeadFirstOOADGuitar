package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Style;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

public class MandolinSpec extends InstrumentSpec{
    private final Style style;

    public MandolinSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, Style style) {
        super(builder, type, backWood, topWood, model);
        this.style = style;
    }

    @Override
    public boolean matches(InstrumentSpec mandolin){
        if(!super.matches(mandolin)){
            return false;
        }
        if(!(mandolin instanceof MandolinSpec)){
            return false;
        }
        return style == ((MandolinSpec) mandolin).getStyle();
    }


    public Style getStyle(){
        return style;
    }
}
