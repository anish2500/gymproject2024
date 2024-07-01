/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.controller;

import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class trainerDao {
    public static void main(String[] args) throws SQLException {
        System.out.println(Arrays.deepToString(showTrainers()));
    }
    public static Object[][] showTrainers() throws SQLException{
        ArrayList<Object[]> trainersArr = new ArrayList<>();
        Connection conn = DB.connect();
        String sel = "Select * from trainer ";
        PreparedStatement showTrainerPS = conn.prepareStatement(sel);
        ResultSet showTrainerRS = showTrainerPS.executeQuery();
        while(showTrainerRS.next()){
            Object[] indArr = {showTrainerRS.getInt("trainer_id"),showTrainerRS.getString("name"),showTrainerRS.getString("contact")};
            trainersArr.add(indArr);
        }
        
        Object[][] outputArr = new Object[trainersArr.size()][3];
        for(int i = 0; i<trainersArr.size();i++){
            outputArr[i] = trainersArr.get(i);
        }
        
        return outputArr;
    }
    
}
