/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GuestModel {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;

    public GuestModel(String firstName, String lastName, String email, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getAge() { return age; }
}

/**
 *
 * @author czybelle ombao
 */
