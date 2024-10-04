/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;
/**
 *
 * @author dawil
 */
public class Latihan_01 {
    static final String db_prodi_si="jdbc:mysql://localhost:3306/db_prodi_si";
    private static Connection Utama;
    public static Connection db_prodi_si() throws SQLException , ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Proses Deteksi Driver Berhasil");
            DriverManager.getConnection(db_prodi_si,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
        return Utama;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
