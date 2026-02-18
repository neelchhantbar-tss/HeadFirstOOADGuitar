package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood){
        GuitarSpec guitarSpec = new GuitarSpec(builder, type, backWood, topWood, model);
        Guitar guitar = new Guitar("1215235", 100, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {

                return guitar;
            }
        }
        return null;
    }

    public Guitar search(GuitarSpec searchGuitar){
        for(Guitar g: guitars){
            GuitarSpec guitar = g.guitarSpec;

            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) &&
                    (!builder.equals(guitar.getBuilder())))
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.isEmpty()) &&
                    (!model.equals(guitar.getModel())))
                continue;
            Type type = searchGuitar.getType();
            if ((type != null) &&
                    (!type.equals(guitar.getType())))
                continue;
            Wood backWood = searchGuitar.getBackWood();
            if ((backWood != null) &&
                    (!backWood.equals(guitar.getBackWood())))
                continue;
            Wood topWood = searchGuitar.getTopWood();
            if ((topWood != null) &&
                    (!topWood.equals(guitar.getTopWood())))
                continue;

            return g;
        }
        return null;
    }
}
