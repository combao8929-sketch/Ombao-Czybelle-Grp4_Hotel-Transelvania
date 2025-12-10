/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ServiceModel {
    private int bookingId;
    private String name;
    private double price;

    public ServiceModel(int bookingId, String name, double price) {
        this.bookingId = bookingId;
        this.name = name;
        this.price = price;
    }

    public int getbookingId() { return bookingId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    @Override
    public String toString() { return name + " ($" + price + ")"; }
}
/**
 *
 * @author czybelle ombao
 */
