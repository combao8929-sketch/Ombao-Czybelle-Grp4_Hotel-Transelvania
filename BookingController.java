/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import model.BookingModel;
import util.DBConnection;

public class BookingController {
    
    public int createBooking(BookingModel booking) {
        String sql = "INSERT INTO bookings (guest_id, room_id, check_in, check_out, total_amount) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, booking.getGuestModel().getId());
            pstmt.setInt(2, booking.getRoomModel().getRoomId());
            pstmt.setDate(3, Date.valueOf(booking.getCheckIn()));
            pstmt.setDate(4, Date.valueOf(booking.getCheckOut()));
            pstmt.setDouble(5, booking.getTotalAmount());
            pstmt.executeUpdate();
            
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) { e.printStackTrace(); }
        return -1;
    }
}
/**
 *
 * @author czybelle ombao
 */
