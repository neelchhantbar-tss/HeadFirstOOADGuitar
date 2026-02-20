package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map<String, Object> erinInstrumentProperties = new HashMap<>();
        erinInstrumentProperties.put("InstrumentType", InstrumentType.GUITAR);
        erinInstrumentProperties.put("Builder", Builder.FENDER);
        erinInstrumentProperties.put("Type", Type.ELECTRIC);
        erinInstrumentProperties.put("BackWood", Wood.ALDER);
        erinInstrumentProperties.put("TopWood", Wood.ALDER);
        erinInstrumentProperties.put("Model", "Stratocastor");
        erinInstrumentProperties.put("NumberOfStrings", 12);

        Map<String, Object> neelInstrumentProperties = new HashMap<>();
        neelInstrumentProperties.put("InstrumentType", InstrumentType.MANDOLIN);
        neelInstrumentProperties.put("Builder", Builder.FENDER);
        neelInstrumentProperties.put("Type", Type.ACOUSTIC);
        neelInstrumentProperties.put("BackWood", Wood.CEDAR);
        neelInstrumentProperties.put("TopWood", Wood.CEDAR);
        neelInstrumentProperties.put("Model", "ABC");
        neelInstrumentProperties.put("Style", Style.A);

        InstrumentSpec whatErinLikes = new InstrumentSpec(erinInstrumentProperties);
        InstrumentSpec whatNeelLikes = new InstrumentSpec(neelInstrumentProperties);

        List<Instrument> erinLikeList = inventory.search(whatErinLikes);

        if(erinLikeList != null && !erinLikeList.isEmpty()) {
            System.out.println(erinLikeList);
        }
        else{
            System.out.println("Sorry, Erin !");
        }

        List<Instrument> neelLikeList = inventory.search(whatNeelLikes);

        if(neelLikeList != null && !neelLikeList.isEmpty()){
            System.out.println(neelLikeList);
        }
        else{
            System.out.println("Sorry, Neel !");
        }
    }

    private static void initializeInventory(Inventory inventory){
        Map<String, Object> guitarProperties = new HashMap<>();
        guitarProperties.put("InstrumentType", InstrumentType.GUITAR);
        guitarProperties.put("Builder", Builder.FENDER);
        guitarProperties.put("Type", Type.ELECTRIC);
        guitarProperties.put("BackWood", Wood.ALDER);
        guitarProperties.put("TopWood", Wood.ALDER);
        guitarProperties.put("Model", "Stratocastor");
        guitarProperties.put("NumberOfStrings", 12);

        Map<String, Object> mandolinProperties = new HashMap<>();
        mandolinProperties.put("InstrumentType", InstrumentType.MANDOLIN);
        mandolinProperties.put("Builder", Builder.FENDER);
        mandolinProperties.put("Type", Type.ACOUSTIC);
        mandolinProperties.put("BackWood", Wood.ALDER);
        mandolinProperties.put("TopWood", Wood.CEDAR);
        mandolinProperties.put("Model", "ABC");
        mandolinProperties.put("Style", Style.A);


        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("WGW342", 1300, new InstrumentSpec(mandolinProperties));
    }
}
