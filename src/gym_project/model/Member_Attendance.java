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
public class Member_Attendance {
    private int member_attendance_id;
    private  Date date;
    private int member_id;

    public Member_Attendance(int member_attendance_id, Date date, int member_id) {
        this.member_attendance_id = member_attendance_id;
        this.date = date;
        this.member_id = member_id;
    }

    public void setMember_attendance_id(int member_attendance_id) {
        this.member_attendance_id = member_attendance_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getMember_attendance_id() {
        return member_attendance_id;
    }

    public Date getDate() {
        return date;
    }

    public int getMember_id() {
        return member_id;
    }
    
    
    
}
