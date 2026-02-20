package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Style;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER,"Stratocastor", 12);
        MandolinSpec whatNeelLikes = new MandolinSpec(Builder.FENDER, Type.ACOUSTIC,Wood.CEDAR, Wood.CEDAR, "ABC", Style.A);

        List<Instrument> guitars = inventory.search(whatErinLikes);

        if(guitars != null && !guitars.isEmpty()) {
            System.out.println(guitars);
        }
        else{
            System.out.println("Sorry, Erin !");
        }

        List<Instrument> mandolins = inventory.search(whatNeelLikes);

        if(mandolins != null && !mandolins.isEmpty()){
            System.out.println(mandolins);
        }
        else{
            System.out.println("Sorry, Neel !");
        }
    }

    private static void initializeInventory(Inventory inventory){
        GuitarSpec spec = new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, "Stratocastor", 12);
        inventory.addInstrument("V95693", 1499.95, spec);

        MandolinSpec spec1 = new MandolinSpec(Builder.FENDER, Type.ACOUSTIC,Wood.CEDAR, Wood.CEDAR, "ABC", Style.A);
        inventory.addInstrument("WGW342", 1300, spec1);
    }
}
