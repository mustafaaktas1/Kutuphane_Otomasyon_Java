/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MustafaAktas
 */
public class DBConnection {

//    String constr = "";//"jdbc:sqlserver://localhost:1433; databasename=SQLKutuphane";
//    String driver = "jdbc:sqlserver://";
//    String sunucu = "localhost";
//    String port = "1433";
//    String database = "SQLKutuphane";
//    String user = "sa";
//    String pass = "123456";
    String constr, driver, sunucu, port, database, user, pass;

    public Connection con = null;

    public DBConnection() {
        try {
            File dosya = new File(".\\src\\main\\java\\utils\\ConnectionString.txt");
            if (dosya.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(dosya));
                // String satir = reader.readLine();
                driver = reader.readLine();
                sunucu = reader.readLine();
                port = reader.readLine();
                database = reader.readLine();
                user = reader.readLine();
                pass = reader.readLine();

                // System.out.println(driver + "\n" + sunucu + "\n" + port + "\n" + database + "\n" + user + "\n" + pass);
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası.");
        }
//        if (!txtEmail.getText().isEmpty()) {
//            txtSifre.requestFocus(true);
//        }

        if (!port.equals("")) {
            port = ":" + port;
        }
        constr = driver + sunucu + port + ";" + "encrypt=true;trustServerCertificate=true;" + "databasename=" + database;

    }

    public Connection CreateConnection() {

        try {
            con = DriverManager.getConnection(constr, user, pass);
             System.out.println("Veri Tabanı Bağlantısı Başarılı Oldu");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Veri Tabanı Bağlantısında Hata Oluştu!!!");
        }
       

        return con;
    }

}
