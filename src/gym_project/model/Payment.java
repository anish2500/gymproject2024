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
public class Payment {
    private int payment_id;
    private Date paymentDate;
    private int amount;
    private int member_id;

    public Payment(int payment_id, Date paymentDate, int amount, int member_id) {
        this.payment_id = payment_id;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.member_id = member_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public int getMember_id() {
        return member_id;
    }
    
    
    
    
}
