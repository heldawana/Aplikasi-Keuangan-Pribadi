/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
//import packages yang diperlukan
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author 
 * Nama : Heldawana
 * NPM : 2310010669
 * Kelas : TI 5B Nonreg BJM
 * Jurusan : Teknik informatika
 */
public class Koneksi {
    //buat koneksi database MySQL
 private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/heldawanadb";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return mysqlkonek;
}
    
}
