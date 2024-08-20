/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.model;
 

/**
 *
 * @author user
 */
import java.util.Date;
public class Trainer {

    private String first_name;
    private String last_name;
    private int age;
    private Date date_of_birth;
    private String address;
    private String gender;
    private String phone_number;
    private String email;
    private String duration ;
    private int trainer_id;
    private String gym_time;
    private String category;

    public Trainer(String first_name, String last_name, int age, Date date_of_birth, String address, String gender, String phone_number, String email, String duration, String gym_time, String category) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
        this.duration = duration;
//        this.trainer_id = trainer_id;
        this.gym_time = gym_time;
        this.category = category;
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

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public void setGym_time(String gym_time) {
        this.gym_time = gym_time;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public String getDuration() {
        return duration;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public String getGym_time() {
        return gym_time;
    }

    public String getCategory() {
        return category;
    }
    
    
    
   
    
  
}
