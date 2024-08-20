/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Member {
    private int member_id;
    private String first_name; 
    private String last_name; 
    private int age ; 
    private String address; 
    private String phoneNumber ; 
    private String email; 
    private int payment; 
    private String gym_time ; 
    private int membership_duration; 
    private Date date_of_birth; 
    private String trainer_category; 
    private String gender; 

    public Member(String first_name, String last_name, int age, String address, String phoneNumber, String email, int payment, String gym_time, int membership_duration, Date  date_of_birth, 
    String trainer_category, String gender ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.payment = payment;
        this.gym_time = gym_time;
        this.membership_duration = membership_duration;
        this.date_of_birth = date_of_birth;
        this.gender = gender ;
        this.trainer_category = trainer_category;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setGym_time(String gym_time) {
        this.gym_time = gym_time;
    }

    public void setMembership_duration(int membership_duration) {
        this.membership_duration = membership_duration;
    }
    
    public void setDate_of_birth(Date date_of_birth){
        this.date_of_birth = date_of_birth;
    }
    public void setTrainer_category(String trainer_category){
        this.trainer_category  = trainer_category;
    }
    
    public void setGender(String gender ){
        this.gender = gender; 
    }

    public int getMember_id() {
        return member_id;
    }
    
   

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }


    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPayment() {
        return payment;
    }

    public String getGym_time() {
        return gym_time;
    }

    public int getMembership_duration() {
        return membership_duration;
    }
    
    public Date getDate_of_birth(){
        return date_of_birth; 
    }
    
    public String getTrainer_category(){
        return trainer_category; 
    }
    
    public String getGender(){
        return gender; 
    }
    
    
    
    
}
