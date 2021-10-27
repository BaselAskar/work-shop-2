package org.example.Model;

public class VendingMachineImp implements VendingMachine{


    private final int[] CURRENCIES = {1,2,5,10,20,50,100,200,500,1000};
    private Product[] products;
    private int depositPool;

    public VendingMachineImp(Product... products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {
        for (int currency: CURRENCIES) {
            if (amount == currency) depositPool += amount;
        }
    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public Product request(int id) {
        Product product = null;

        //Finding the product
        for (Product p : products ){
            if (p.getId() == id) product = p;

            //Checking price
            if (this.depositPool >= product.getPrice()) return product;
        }

        return product;
    }

    @Override
    public int endSession() {
        int balance = getBalance();
        this.depositPool = 0;
        return balance;
    }

    @Override
    public String getDescription(int id) {
        return "This is " + request(id).getProductName() + "for" + request(id).use() + " and it is " + request(id).examine();
    }

    @Override
    public String[] getProducts() {
        String[] productsDetails = new String[this.products.length];
        String productDetail;
        for (int i = 0; i < this.products.length;i++) {
            productDetail = "id = " + this.products[i].getId() + ",Product's name: "
                    + this.products[i].getProductName()
                    + ",price = " + this.products[i].getPrice();

            productsDetails[i] = productDetail;
        }

        return productsDetails;
    }



}
