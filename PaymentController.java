/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import model.PaymentModel;
import util.DBConnection;

public class PaymentController {
    public boolean processPayment(PaymentModel payment) {
        String sql = "INSERT INTO payments (booking_id, amount, payment_method) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            // Note: In a real app, you would use payment.getBookingId()
            // For this simplified version, we assume the Booking object has the ID set
            pstmt.setInt(1, 1); // Placeholder: Needs linked booking ID
            pstmt.setDouble(2, payment.amount); // Access via getter in real code
            pstmt.setString(3, payment.method); // Access via getter in real code
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) { e.printStackTrace(); }
        return false;
    }
}
/**
 *
 * @author czybelle ombao
 */

