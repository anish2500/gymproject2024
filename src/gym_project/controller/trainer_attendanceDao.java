/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.controller;

import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class trainer_attendanceDao {
    
    public static void main(String [] args ) throws SQLException{
    takeTrainerAttendance(1);
    }
    
    public static void takeTrainerAttendance( int id) throws SQLException{
     java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Connection conn = DB.connect();
        String insertQ = "insert into trainer_attendance(date, trainer_id ) values(?,?)";
        PreparedStatement insertPS = conn.prepareStatement(insertQ);

        insertPS.setDate(1, sqlDate);
        insertPS.setInt(2, id);

        insertPS.executeUpdate();
        System.out.println("Data inserted");
    
    
    
    }
    
}
