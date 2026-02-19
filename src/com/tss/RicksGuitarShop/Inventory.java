package com.tss.RicksGuitarShop;

import com.tss.RicksGuitarShop.DataTypes.Builder;
import com.tss.RicksGuitarShop.DataTypes.Type;
import com.tss.RicksGuitarShop.DataTypes.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Instrument> instruments;
    public Inventory(){
        instruments = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if(spec instanceof GuitarSpec){
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        }
        else if(spec instanceof MandolinSpec){
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNumber){
        for (Instrument Instrument : instruments) {
            if (Instrument.getSerialNumber().equals(serialNumber)) {

                return Instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchInstrument){
        List<Guitar> matching = new LinkedList<>();
        for(Instrument instrument: instruments){
            if(instrument.getSpec().matches(searchInstrument))
                matching.add(((Guitar)instrument));
        }   
        return matching;
    }

    public List<Mandolin> search(MandolinSpec searchInstrument){
        List<Mandolin> matching = new LinkedList<>();
        for(Instrument instrument: instruments){
            if(instrument.getSpec().matches(searchInstrument))
                matching.add(((Mandolin)instrument));
        }
        return matching;
    }
}
