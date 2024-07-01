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
public class TrainerAttendance {
    private int attendance_id ;
    private Date date;
    private int trainer_id;

    public TrainerAttendance(int attendance_id, Date date, int trainer_id) {
        this.attendance_id = attendance_id;
        this.date = date;
        this.trainer_id = trainer_id;
    }

    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public int getAttendance_id() {
        return attendance_id;
    }

    public Date getDate() {
        return date;
    }

    public int getTrainer_id() {
        return trainer_id;
    }
    
    
}
