package org.example.Model;

public class PlasticCar implements Product{

    private int id;
    private String productName;
    private double price;
    private String color;
    private String type;


    public PlasticCar(int id, String productName, double price, String color, String type) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String examine() {
        return "id: " + getId() + ",type: " + this.type + ",color: " + this.color;
    }

    @Override
    public String use() {
        return "Playing";
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
