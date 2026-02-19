package com.tss.RicksGuitarShop;

public abstract class Instrument {

    private final String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
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

    public abstract InstrumentSpec getSpec();

    public String toString(){
        return  this.getClass().getSimpleName() + "{" +
                "serialNumber='" + getSerialNumber() + '\'' +
                ", builder='" + getSpec().getBuilder() + '\'' +
                ", model='" + getSpec().getModel() + '\'' +
                ", type='" + getSpec().getType() + '\'' +
                ", backWood='" + getSpec().getBackWood() + '\'' +
                ", topWood='" + getSpec().getTopWood() + '\'' +
                ", price=" + getPrice() + '\'';
    }
}
