package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        Guitar guitar = inventory.search(whatErinLikes);

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
                    Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
