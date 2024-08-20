/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Model 
package gym_project.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Admin {
    private int admin_id;
    private String first_name;
    private String last_name;
    private int age;
    private String gender;
    private String contact_number;
    private Date date_of_birth;
    private String address;
    private String username;
    private String password;

    public Admin(String first_name, String last_name, int age, String gender, String contact_number, Date date_of_birth, String address, String username, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.contact_number = contact_number;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public int getAdmin_id() {
        return admin_id;
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

    public String getGender() {
        return gender;
    }

    public String getContact_number() {
        return contact_number;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
