/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.model;

/**
 *
 * @author user
 */
public class Member {
    private int member_id;
    private String first_name;
    private String last_name;
    private String address;
    private String phoneNumber;
    private int trainer_id;

    public Member(int member_id, String first_name, String last_name, String address, String phoneNumber, int trainer_id) {
        this.member_id = member_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.trainer_id = trainer_id;
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

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getTrainer_id() {
        return trainer_id;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }
    
    
    
}
