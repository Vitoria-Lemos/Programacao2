package Aula2025_02_10;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerId;
    private ArrayList <Product> productList;


    public ShoppingCart(int customerId) {
        this.customerId = customerId;
        this.productList  =  new ArrayList<>();
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public void getContents() {

        for(int i = 0; i < productList.size(); i++){
            System.out.println(productList.get(i).getName() +": " +productList.get(i).getPrice());
        }

    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getItemCount() {
        return this.productList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for(int i = 0; i < productList.size(); i++){

            totalPrice+= productList.get(i).getPrice();
        }
        return totalPrice;
    }





}
