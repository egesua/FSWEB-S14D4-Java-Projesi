package com.workintech.product;

public class Coke extends ProductForSale{
    private boolean hasSugar;
    private double liter;
    public Coke(String type, double price, String description, boolean hasSugar, double liter) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.liter = liter;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", liter=" + liter +
                '}';
    }
}
