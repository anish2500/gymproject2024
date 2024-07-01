/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.model;

/**
 *
 * @author user
 */
public class Membership {
    private int membership_id;
    private double price;
    private String duration;
    private int member_id;

    public Membership(int membership_id, double price, String duration, int member_id) {
        this.membership_id = membership_id;
        this.price = price;
        this.duration = duration;
        this.member_id = member_id;
    }

    public void setMembership_id(int membership_id) {
        this.membership_id = membership_id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getMembership_id() {
        return membership_id;
    }

    public double getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public int getMember_id() {
        return member_id;
    }
    
    
    
    
}
