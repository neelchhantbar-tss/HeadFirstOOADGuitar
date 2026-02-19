package com.tss.RicksGuitarShop;

public class Guitar extends Instrument {
    private final GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber, price);
        this.guitarSpec = guitarSpec;
    }

    @Override
    public InstrumentSpec getSpec(){
        return guitarSpec;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numStrings=" + guitarSpec.getNumStrings() +
                '}';
    }
}
