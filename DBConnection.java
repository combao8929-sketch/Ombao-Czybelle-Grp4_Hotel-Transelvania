/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
/**
 *
 * @author czybelle ombao
 */
public class DBConnection {
    private static final String URL ="jdbc:mysql://localhost:3306/hotel_transelvania";
    private static final String USER ="root";
    private static final String PASSWORD ="";
    
    public static Connection getConnection() {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
        }catch (ClassNotFoundException|SQLException e){
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return con;
    }
    public static void main (String[] args){
        System.out.println("Testing Connection...");
        Connection c = getConnection();
        if (c!=null){
            System.out.println("Connected kana");
        }else {
            System.out.println("Hindi ka pa Connected");
        }
    }
}
