/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingModel {
    private int id;
    private GuestModel guest;
    private RoomModel room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<AddonModel> addonModel = new ArrayList<>();
    private List<ServiceModel> serviceModel = new ArrayList<>();
    private double totalAmount;

    public BookingModel() {}

    // Getters and Setters
    public void setGuest(GuestModel guest) { this.guest = guest; }
    public GuestModel getGuestModel() { return guest; }
    
    public void setRoomModel(RoomModel room) { this.room = room; }
    public RoomModel getRoomModel() { return room; }
    
    public void setCheckIn(LocalDate checkIn) { this.checkIn = checkIn; }
    public LocalDate getCheckIn() { return checkIn; }
    
    public void setCheckOut(LocalDate checkOut) { this.checkOut = checkOut; }
    public LocalDate getCheckOut() { return checkOut; }
    
    public void addAddon(AddonModel addon) { this.addonModel.add(addon); }
    public List<AddonModel> getAddonModel() { return addonModel; }
    
    public void addServiceModel(ServiceModel service) { this.serviceModel.add(service); }
    public List<ServiceModel> getServiceModel() { return serviceModel; }
    
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public double getTotalAmount() { return totalAmount; }
    
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public Object getGuest() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
/**
 *
 * @author czybelle ombao
 */

    

