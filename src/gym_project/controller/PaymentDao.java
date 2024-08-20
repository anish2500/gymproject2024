package gym_project.controller;

import database.DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PaymentDao {
    public static void main(String[] args) throws SQLException {
        completePayment(4,2000);
    }
    public static void completePayment(int id, int amount ) throws SQLException {
         //java.util.Date utilDate = new java.util.Date();
        //java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Connection conn = DB.connect();
        String insertQ = "insert into payment( member_id , amount) values(?,?)";
        PreparedStatement insertPS = conn.prepareStatement(insertQ);
//        int  amount = 0;

        insertPS.setInt(1, id);
        insertPS.setInt(2, amount);

        insertPS.executeUpdate();
        System.out.println("Data inserted");

    }

    
}
