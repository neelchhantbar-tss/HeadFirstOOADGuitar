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
        Instrument instrument = new Instrument(serialNumber, price, spec);
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

    public List<Instrument> search(InstrumentSpec searchInstrument){
        List<Instrument> matching = new LinkedList<>();
        for(Instrument instrument: instruments){
            if(instrument.getSpec().matches(searchInstrument))
                matching.add(instrument);
        }
        return matching;
    }
}
