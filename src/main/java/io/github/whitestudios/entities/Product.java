package io.github.whitestudios.entities;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public Product(String name, double price, int quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    public double TotalValueInStock(){
        return this.Price * this.Quantity;
    }

    public void AddProducts(int quantity) {
        this.Quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.Quantity -= quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}