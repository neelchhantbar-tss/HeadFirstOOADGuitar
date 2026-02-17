package com.tss.RicksGuitarShop;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor",
                "electric", "Alder", "Alder");

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
                1499.95, "Fender", "Stratocastor",
                "electric", "Alder", "Alder");
    }
}
