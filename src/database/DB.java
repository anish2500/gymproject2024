/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DB {
    static Connection conn = null;
    public static void main ( String[] args){
        connect();
    }
    
// connection function 
public static Connection connect(){
        try{
            String url = "jdbc:mysql://localhost:3306/db";
            String userName = "root";
            String password = "password";
            
            conn = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Successful");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Unsuccessful");
        }
        return conn;
    }
}

