package com.tss.RicksGuitarShop;

public class Guitar {
    private final String serialNumber;
    private double price;
    final GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
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

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", builder='" + guitarSpec.getBuilder() + '\'' +
                ", model='" + guitarSpec.getModel() + '\'' +
                ", type='" + guitarSpec.getType() + '\'' +
                ", backWood='" + guitarSpec.getBackWood() + '\'' +
                ", topWood='" + guitarSpec.getTopWood() + '\'' +
                ", price=" + price +
                '}';
    }
}
