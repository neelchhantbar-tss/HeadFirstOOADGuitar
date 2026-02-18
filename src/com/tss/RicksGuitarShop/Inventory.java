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
                          Type type, Wood backWood, Wood topWood, int numStrings){
        GuitarSpec guitarSpec = new GuitarSpec(builder, type, backWood, topWood, model, numStrings);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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

    public List<Guitar> search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Guitar guitar: guitars){
            if(guitar.guitarSpec.matches(searchGuitar))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }


}
