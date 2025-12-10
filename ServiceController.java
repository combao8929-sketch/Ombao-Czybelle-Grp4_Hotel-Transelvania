/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ServiceModel;
import util.DBConnection;

public class ServiceController {
    public List<ServiceModel> getAllServices() {
        List<ServiceModel> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM services")) {
            while (rs.next()) {
                list.add(new ServiceModel(rs.getInt("id"), rs.getString("name"), rs.getDouble("price")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
/**
 *
 * @author czybelle ombao
 */

