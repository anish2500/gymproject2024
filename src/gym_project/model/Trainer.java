/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_project.model;

/**
 *
 * @author user
 */
public class Trainer {
    private int trainer_id;
    private String name;
    private String contact;
    
    public Trainer(int trainer_id, String name, String contact){
        this.trainer_id = trainer_id;
        this.name = name;
        this.contact = contact;
        
    }
    
    public void setTrainerID(int trainer_id ){
        this.trainer_id = trainer_id;
    }
    
    public void setName(String name){
        this.name  = name;
    }
    public void setContact (String contact){
        this.contact = contact;
    }
    
    
    public int getTrainerID(){
        return trainer_id;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
}
