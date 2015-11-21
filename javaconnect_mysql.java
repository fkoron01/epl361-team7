package pkg361;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Demetres
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Javaconnect_mysql {
    
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 //  static final String DB_URL = "jdbc:mysql://Anninos2:3306/anninos2";
   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/Database";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "1234";
    
        
    public static Connection ConnecrDB(){
        Connection conn = null;
        try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      JOptionPane.showMessageDialog(null,"Connected");
            return conn;
            
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    
}
