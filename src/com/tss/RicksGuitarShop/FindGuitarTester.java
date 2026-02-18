package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER,"Stratocastor", 12);

        List<Guitar> guitar = inventory.search(whatErinLikes);

        if(guitar != null){
            System.out.println(guitar);
        }
        else{
            System.out.println("Sorry, Erin !");
        }
    }

    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("V95693",
                1499.95, Builder.FENDER, "Stratocastor",
                    Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
    }
}
