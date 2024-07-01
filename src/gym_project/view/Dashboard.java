/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_project.view;

import static gym_project.controller.trainerDao.showTrainers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        CardioCentralText = new javax.swing.JLabel();
        HomeofFitnessText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MemberAddtext = new javax.swing.JMenu();
        TrainerAddText = new javax.swing.JMenu();
        editmenu = new javax.swing.JMenu();
        MemerberEditText = new javax.swing.JMenu();
        TrainerEdit = new javax.swing.JMenu();
        AttendanceText = new javax.swing.JMenu();
        MemberAttendanceButton = new javax.swing.JMenu();
        TrainerAttendanceButton = new javax.swing.JMenu();
        Payment = new javax.swing.JMenu();
        LogoutButton = new javax.swing.JMenu();
        ExitButton = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 101, 130));

        jPanel1.setBackground(new java.awt.Color(4, 101, 130));

        CardioCentralText.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        CardioCentralText.setForeground(new java.awt.Color(255, 255, 255));
        CardioCentralText.setText("Cardio Central");

        HomeofFitnessText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HomeofFitnessText.setForeground(new java.awt.Color(255, 255, 255));
        HomeofFitnessText.setText("Home of Fitness");

        try{
            Object[][] trainers = showTrainers();
            String[] trainerHeader = {"ID","Name","Contact"};
            jTable1.setModel(new DefaultTableModel(trainers,trainerHeader));
        }catch(SQLException e){
            e.printStackTrace();
            jTable1.setModel(new DefaultTableModel(new Object[][] {{null,null,null}},new String[]{"ID","Name","Contact"}));
        }
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CardioCentralText)
                        .addGap(358, 358, 358))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(HomeofFitnessText)
                        .addGap(423, 423, 423))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(CardioCentralText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeofFitnessText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jMenuBar1.setBackground(new java.awt.Color(4, 101, 130));

        jMenu1.setBackground(new java.awt.Color(4, 101, 130));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Add");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        MemberAddtext.setText("Member");
        MemberAddtext.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MemberAddtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberAddtextMouseClicked(evt);
            }
        });
        jMenu1.add(MemberAddtext);

        TrainerAddText.setText("Trainer");
        TrainerAddText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TrainerAddText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainerAddTextMouseClicked(evt);
            }
        });
        jMenu1.add(TrainerAddText);

        jMenuBar1.add(jMenu1);

        editmenu.setForeground(new java.awt.Color(255, 255, 255));
        editmenu.setText("Edit");
        editmenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MemerberEditText.setText("Member");
        MemerberEditText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MemerberEditText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemerberEditTextMouseClicked(evt);
            }
        });
        editmenu.add(MemerberEditText);

        TrainerEdit.setText("Trainer");
        TrainerEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TrainerEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainerEditMouseClicked(evt);
            }
        });
        editmenu.add(TrainerEdit);

        jMenuBar1.add(editmenu);

        AttendanceText.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceText.setText("Attendance");
        AttendanceText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MemberAttendanceButton.setText("Member");
        MemberAttendanceButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MemberAttendanceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberAttendanceButtonMouseClicked(evt);
            }
        });
        AttendanceText.add(MemberAttendanceButton);

        TrainerAttendanceButton.setText("Trainer");
        TrainerAttendanceButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AttendanceText.add(TrainerAttendanceButton);

        jMenuBar1.add(AttendanceText);

        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setText("Payment");
        Payment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentMouseClicked(evt);
            }
        });
        jMenuBar1.add(Payment);

        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseExited(evt);
            }
        });
        jMenuBar1.add(LogoutButton);

        ExitButton.setBackground(new java.awt.Color(4, 101, 130));
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });
        jMenuBar1.add(ExitButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MemberAddtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberAddtextMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Membershipadd ss = new Membershipadd ();
        ss.setVisible(true);
    }//GEN-LAST:event_MemberAddtextMouseClicked

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginPage ss = new LoginPage();
        ss.setVisible(true);
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void LogoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_LogoutButtonMouseExited

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitButtonMouseExited

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void TrainerAddTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerAddTextMouseClicked
        // TODO add your handling code here:
        this.dispose();
        TrainerAdd ss = new TrainerAdd();
        ss.setVisible(true);
    }//GEN-LAST:event_TrainerAddTextMouseClicked

    private void MemerberEditTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemerberEditTextMouseClicked
        // TODO add your handling code here:
        this.dispose();
        EditMemberPage ss = new EditMemberPage();
        ss.setVisible(true);
    }//GEN-LAST:event_MemerberEditTextMouseClicked

    private void TrainerEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerEditMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TrainerEditMouseClicked

    private void MemberAttendanceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberAttendanceButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
        MemberAttendace ss = new MemberAttendace();
        ss.setVisible(true);
    }//GEN-LAST:event_MemberAttendanceButtonMouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:\
        this.dispose();
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void PaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseClicked
        // TODO add your handling code here:
        this.dispose();
        PaymentPage ss = new PaymentPage();
        ss.setVisible(true);
    }//GEN-LAST:event_PaymentMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AttendanceText;
    private javax.swing.JLabel CardioCentralText;
    private javax.swing.JMenu ExitButton;
    private javax.swing.JLabel HomeofFitnessText;
    private javax.swing.JMenu LogoutButton;
    private javax.swing.JMenu MemberAddtext;
    private javax.swing.JMenu MemberAttendanceButton;
    private javax.swing.JMenu MemerberEditText;
    private javax.swing.JMenu Payment;
    private javax.swing.JMenu TrainerAddText;
    private javax.swing.JMenu TrainerAttendanceButton;
    private javax.swing.JMenu TrainerEdit;
    private javax.swing.JMenu editmenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
