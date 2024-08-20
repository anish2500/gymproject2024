/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.controller;

import database.DB;
import gym_project.model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author user
 */
public class memberDao {
        public static void main(String[] args) throws SQLException {
       java.util.Date cdate = new java.util.Date();

               System.out.println(Arrays.deepToString(showMembers()));
    }
    public static void addMember(Member member) throws SQLException{
        java.sql.Date sqlDate= new java.sql.Date(member.getDate_of_birth().getTime());
        Connection conn = DB.connect();
        String insertQ = "insert into Member("
                + "first_name, last_name,age,date_of_birth,  gender, phoneNumber, email, "
                + "address, payment, gym_time, membership_duration, trainer_category)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertPS = conn.prepareStatement(insertQ);
        
         insertPS.setString(1, member.getFirst_name());
        insertPS.setString(2, member.getLast_name());
        insertPS.setInt(3, member.getAge());
        insertPS.setDate(4,sqlDate);
        insertPS.setString(5, member.getGender());
        insertPS.setString(6, member.getPhoneNumber());
        insertPS.setString(7, member.getEmail());
        insertPS.setString(8, member.getAddress());
        insertPS.setInt(9,member.getPayment());
        insertPS.setString(10, member.getGym_time());
        insertPS.setInt(11, member.getMembership_duration());
        insertPS.setString(12, member.getTrainer_category());        
        insertPS.executeUpdate();
        System.out.println("Data inserted");
        
    }
        public static Object[][] showMembers() throws SQLException{
        ArrayList<Object[]> membersArr = new ArrayList<>();
        Connection conn = DB.connect();
        String sel = "Select * from member ";
        PreparedStatement showMemberPS = conn.prepareStatement(sel);
        ResultSet showMemberRS = showMemberPS.executeQuery();
        while(showMemberRS.next()){
            Object[] indArr = {showMemberRS.getString("first_name"),showMemberRS.getString("phoneNumber"),showMemberRS.getString("address"),
             showMemberRS.getString("email")};
            membersArr.add(indArr);
        }
        
        Object[][] outputArr = new Object[membersArr.size()][3];
        for(int i = 0; i<membersArr.size();i++){
            outputArr[i] = membersArr.get(i);
        }
        
        return outputArr;
        
    }

public static void updateMember_Page(Member member, int id) throws SQLException {
    java.sql.Date sqlDate = new java.sql.Date(member.getDate_of_birth().getTime());
    
    String update_query = "UPDATE member SET "
                        + "first_name = ?, "
                        + "last_name = ?, "
                        + "address = ?, "
                        + "phoneNumber = ?, "
                        + "age = ?, "
                        + "gender = ?, "
                        + "email = ?, "
                        + "payment = ?, "
                        + "gym_time = ?, "
                        + "membership_duration = ?, "
                        + "date_of_birth = ?, "
                        + "trainer_category = ? "
                        + "WHERE member_id = ?";
    
    try (Connection conn = DB.connect();
         PreparedStatement ps = conn.prepareStatement(update_query)) {
         
        ps.setString(1, member.getFirst_name());
        ps.setString(2, member.getLast_name());
        ps.setString(3, member.getAddress());
        ps.setString(4, member.getPhoneNumber());
        ps.setInt(5, member.getAge());
        ps.setString(6, member.getGender());
        ps.setString(7, member.getEmail());
        ps.setInt(8, member.getPayment());
        ps.setString(9, member.getGym_time());
        ps.setInt(10, member.getMembership_duration());
        ps.setDate(11, sqlDate);
        ps.setString(12, member.getTrainer_category());
        ps.setInt(13, id);  // Pass the id as a parameter
        
        ps.executeUpdate();
    }
}

  public static void Delete_Member(int id) throws SQLException {

        try (Connection con = DB.connect()) {
            String delete_query = "DELETE from  member where member_id= ?";
            PreparedStatement ps = con.prepareStatement(delete_query);
            ps.setInt(1, id);
            ps.executeUpdate();

        }
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author user
 */

//public class AdminDao {
//    public static void main(String[] args) throws SQLException {
//       java.util.Date cdate = new java.util.Date();
////        Admin admin1 = new Admin("Anish","Moktan", 21,"Male","12345678910", cdate,"imadol", "anish123", "iamanish");
//        addAdmin(admin1);
    
//    public static void addAdmin(Admin admin) throws SQLException{
//        java.sql.Date sqlDate= new java.sql.Date(admin.getDate_of_birth().getTime());
//        Connection conn = DB.connect();
//        String insertQ = "insert into Admin("
//                + "first_name, last_name,age, gender, contact_number, date_of_birth, "
//                + "address, username, password)"
//                + "values(?,?,?,?,?,?,?,?,?)";
//        PreparedStatement insertPS = conn.prepareStatement(insertQ);
//        
//        insertPS.setString(1, admin.getFirst_name());
//        insertPS.setString(2, admin.getLast_name());
//        insertPS.setInt(3, admin.getAge());
//        insertPS.setString(4,admin.getGender());
//        insertPS.setString(5, admin.getContact_number());
//        insertPS.setDate(6, sqlDate);
//        insertPS.setString(7, admin.getAddress());
//        insertPS.setString(8, admin.getUsername());
//        insertPS.setString(9, admin.getPassword());
//        
//        
//        
//        
//        
//        insertPS.executeUpdate();
//        System.out.println("Data inserted");
//        
//    }
//}
