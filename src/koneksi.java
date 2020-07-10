/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIKRI
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LxP
 */
public class koneksi {
   private static Connection MySQLConfig;

public static Connection getKoneksi(){
if(MySQLConfig == null) {
    try{
	String url = "jdbc:mysql://localhost:3306/ta_pbo";
	String user = "root";
	String pass = "";
	
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	MySQLConfig = DriverManager.getConnection(url, user, pass);
	
}catch(SQLException e){
	System.out.println("Koneksi ke Database Gagal" + e.getMessage());
    }
}
    return MySQLConfig;
    }
  }

