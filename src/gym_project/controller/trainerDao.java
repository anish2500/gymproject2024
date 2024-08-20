/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.controller;

import database.DB;
import gym_project.model.Member;
import gym_project.model.Trainer;
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
    
    public static void addTrainers(Trainer trainer) throws SQLException{
        java.sql.Date sqlDate= new java.sql.Date(trainer.getDate_of_birth().getTime());
    Connection conn = DB.connect();
    String insertA= "insert into trainer("
                + "first_name, last_name,age,date_of_birth,address,gender, "
                + "phone_number, email, duration , trainer_id, gym_time, category)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertTrainer = conn.prepareStatement(insertA);
        insertTrainer.setString(1, trainer.getFirst_name());
        insertTrainer.setString(2, trainer.getLast_name());
        insertTrainer.setInt(3, trainer.getAge());
        insertTrainer.setDate(4, sqlDate);
        insertTrainer.setString(5, trainer.getAddress());
        insertTrainer.setString(6, trainer.getGender());
        insertTrainer.setString(7, trainer.getPhone_number());
        insertTrainer.setString(8, trainer.getEmail());
        insertTrainer.setString(9, trainer.getDuration());
        insertTrainer.setInt(10, trainer.getTrainer_id());
        insertTrainer.setString(11, trainer.getGym_time());
        insertTrainer.setString(12, trainer.getCategory());
        
        insertTrainer.executeUpdate();
      
        
    }
     
    public static Object[][] showTrainers() throws SQLException{
        ArrayList<Object[]> trainersArr = new ArrayList<>();
        Connection conn = DB.connect();
        String sel = "Select * from trainer ";
        PreparedStatement showTrainerPS = conn.prepareStatement(sel);
        ResultSet showTrainerRS = showTrainerPS.executeQuery();
        while(showTrainerRS.next()){
            Object[] indArr = {showTrainerRS.getInt("trainer_id"),showTrainerRS.getString("first_name"),showTrainerRS.getString("phone_number")};
            trainersArr.add(indArr);
        }
        
        Object[][] outputArr = new Object[trainersArr.size()][3];
        for(int i = 0; i<trainersArr.size();i++){
            outputArr[i] = trainersArr.get(i);
        }
        
        return outputArr;
        
    }
    public static void updateTrainer_Page(Trainer trainer, int id) throws SQLException {
    java.sql.Date sqlDate = new java.sql.Date(trainer.getDate_of_birth().getTime());
    
    String update_query = "UPDATE trainer SET "
                        + "first_name = ?, "
                        + "last_name = ?, "
                        + "address = ?, "
                        + "phone_number = ?, "
                        + "age = ?, "
                        + "gender = ?, "
                        + "email = ?, "
                          
                        + "gym_time = ?, "
                        + "duration = ?, "
                        + "Date_of_birth= ?, "
                        + "category = ?"
                        + "WHERE trainer_id = ?";
    
    try (Connection conn = DB.connect();
         PreparedStatement ps = conn.prepareStatement(update_query)) {
         
        ps.setString(1, trainer.getFirst_name());
        ps.setString(2, trainer.getLast_name());
        ps.setString(3, trainer.getAddress());
        ps.setString(4, trainer.getPhone_number());
        ps.setInt(5, trainer.getAge());
        ps.setString(6, trainer.getGender());
        ps.setString(7, trainer.getEmail());
        
        ps.setString(8, trainer.getGym_time());
//        ps.setInt(9,Integer.parseInt( trainer.getDuration()));
        ps.setString(9, trainer.getDuration());
        ps.setDate(10, sqlDate);
        ps.setString(11, trainer.getCategory());
        ps.setInt(12, id);  // Pass the id as a parameter
        
        ps.executeUpdate();
    }
}
    
   

    
}
