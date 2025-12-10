/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class DestinationModel {
    private int id;
    private String name;
    private String type; 

    public DestinationModel(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    
    @Override
    public String toString() { return name; } 
}

/**
 *
 * @author czybelle ombao
 */