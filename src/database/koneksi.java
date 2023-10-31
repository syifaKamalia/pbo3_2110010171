/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.swing.JOptionPane;
//untuk koneksi
import java.sql.Connection;
import java.sql.DriverManager;
//untuk CRUD
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class koneksi {
    
    public static Connection konek;
    public static Statement stmt;
    public static PreparedStatement prstmt;
    
    public koneksi() {
        
        try {
            
            String url="jdbc:mysql://localhost/pbo2_2110010171";
            String user="root";
            String password="";
            
            Class.forName("com.mysql.jdbc.Driver");
            
            konek=DriverManager.getConnection(url, user, password);
            stmt=konek.createStatement();
            System.out.println("database berhasil terkoneksi");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
       
        }
    }
    
}
