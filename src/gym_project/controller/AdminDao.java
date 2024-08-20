/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.controller;
import database.DB;
import gym_project.model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author user
 */

public class AdminDao {
    public static void main(String[] args) throws SQLException {
       java.util.Date cdate = new java.util.Date();
//        Admin admin1 = new Admin("Anish","Moktan", 21,"Male","12345678910", cdate,"imadol", "anish123", "iamanish");
//        addAdmin(admin1);
    }
    public static void addAdmin(Admin admin) throws SQLException{
        java.sql.Date sqlDate= new java.sql.Date(admin.getDate_of_birth().getTime());
        Connection conn = DB.connect();
        String insertQ = "insert into Admin("
                + "first_name, last_name,age, gender, contact_number, date_of_birth, "
                + "address, username, password)"
                + "values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertPS = conn.prepareStatement(insertQ);        
        insertPS.setString(1, admin.getFirst_name());
        insertPS.setString(2, admin.getLast_name());
        insertPS.setInt(3, admin.getAge());
        insertPS.setString(4,admin.getGender());
        insertPS.setString(5, admin.getContact_number());
        insertPS.setDate(6, sqlDate);
        insertPS.setString(7, admin.getAddress());
        insertPS.setString(8, admin.getUsername());
        insertPS.setString(9, admin.getPassword());
           
        insertPS.executeUpdate();
        System.out.println("Data inserted");
        
    }
}
