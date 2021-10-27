package org.example.Model;

public class Kanelbullar implements Product{

    private int id;
    private String productName;
    private double price;
    private String test;
    private String type;

    public Kanelbullar(int id, String productName, double price, String test, String type) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.test = test;
        this.type = type;
    }

    @Override
    public String examine() {
        return "id: " + getId() + ",test: " + this.test + ",testing: " + this.test;
    }

    @Override
    public String use() {
        return "Eating";
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
