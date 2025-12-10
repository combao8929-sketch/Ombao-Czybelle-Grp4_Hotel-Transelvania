/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.DestinationModel;
import model.RoomModel;
import util.DBConnection;

public class RoomController {
    
    public List<DestinationModel> getAllDestinations() {
        List<DestinationModel> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM destinations")) {
            while (rs.next()) {
                list.add(new DestinationModel(rs.getInt("id"), rs.getString("name"), rs.getString("type")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    public List<RoomModel> searchRooms(int capacity) {
        List<RoomModel> list = new ArrayList<>();
        String sql = "SELECT * FROM rooms WHERE capacity >= ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, capacity);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                list.add(new RoomModel(
                    rs.getInt("id"),
                    rs.getString("room_number"),
                    rs.getString("room_type"),
                    rs.getInt("capacity"),
                    rs.getString("base_price")
                ));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}

/**
 *
 * @author czybelle ombao
 */