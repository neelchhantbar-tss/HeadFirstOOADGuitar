package com.tss.RicksGuitarShop;

import java.util.Map;

public class Instrument {

    private final String serialNumber;
    private double price;
    private final InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public InstrumentSpec getSpec(){
        return spec;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(
                this.getClass().getSimpleName() + "{" +
                "serialNumber='" + getSerialNumber() + '\'' +
                ", price=" + getPrice() + '\''
        );
        for(Map.Entry<String, Object> entry: getSpec().properties().entrySet()){
            sb.append(", ")
                    .append(entry.getKey())
                    .append("='")
                    .append(entry.getValue())
                    .append('\'');
        }
        return sb.toString();
    }
}
