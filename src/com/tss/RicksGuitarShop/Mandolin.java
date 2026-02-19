package com.tss.RicksGuitarShop;

public class Mandolin extends Instrument{
    private final MandolinSpec mandolinSpec;

    public Mandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber, price);
        this.mandolinSpec = mandolinSpec;
    }

    @Override
    public InstrumentSpec getSpec(){
        return mandolinSpec;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numStrings=" + mandolinSpec.getStyle() +
                '}';
    }
}
