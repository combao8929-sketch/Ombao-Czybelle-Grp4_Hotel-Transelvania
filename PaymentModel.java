/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class PaymentModel {
    private int id;
    private int bookingId;
    public double amount;
    public String method;

    public PaymentModel(int bookingId, double amount, String method) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.method = method;
    }
   
}
/**
 *
 * @author czybelle ombao
 */

