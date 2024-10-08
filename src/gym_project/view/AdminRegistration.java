/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_project.view;

import gym_project.controller.AdminDao;
import gym_project.model.Admin;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class AdminRegistration extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegistration
     */
    public AdminRegistration() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CardioText = new javax.swing.JLabel();
        HomeOFFitnessField = new javax.swing.JLabel();
        adminRegText = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        AgeText = new javax.swing.JLabel();
        AgeField = new javax.swing.JTextField();
        GenderText = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        AddressText = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        DOBText = new javax.swing.JLabel();
        ContactText = new javax.swing.JLabel();
        ContactField = new javax.swing.JTextField();
        UsernameText = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        ConfirmPassText = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmPassField = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 101, 130));
        setLocation(320,100);

        CardioText.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        CardioText.setForeground(new java.awt.Color(255, 255, 255));
        CardioText.setText("Cardio Central");

        HomeOFFitnessField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HomeOFFitnessField.setForeground(new java.awt.Color(255, 255, 255));
        HomeOFFitnessField.setText("Home of Fitness");

        adminRegText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminRegText.setForeground(new java.awt.Color(255, 255, 255));
        adminRegText.setText("Admin Registration");

        FirstNameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FirstNameText.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameText.setText("First Name:");

        FirstNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LastNameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastNameText.setForeground(new java.awt.Color(255, 255, 255));
        LastNameText.setText("Last Name:");

        LastNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        AgeText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AgeText.setForeground(new java.awt.Color(255, 255, 255));
        AgeText.setText("Age:");

        AgeField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        GenderText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GenderText.setForeground(new java.awt.Color(255, 255, 255));
        GenderText.setText("Gender:");

        maleButton.setBackground(new java.awt.Color(4, 101, 130));
        buttonGroup.add(maleButton);
        maleButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        maleButton.setForeground(new java.awt.Color(255, 255, 255));
        maleButton.setText("Male");

        femaleButton.setBackground(new java.awt.Color(4, 101, 130));
        buttonGroup.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        femaleButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleButton.setText("Female");

        AddressText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AddressText.setForeground(new java.awt.Color(255, 255, 255));
        AddressText.setText("Address:");

        AddressField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        DOBText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DOBText.setForeground(new java.awt.Color(255, 255, 255));
        DOBText.setText("Date of Birth:");

        ContactText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ContactText.setForeground(new java.awt.Color(255, 255, 255));
        ContactText.setText("Contact Number:");

        ContactField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        UsernameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(255, 255, 255));
        UsernameText.setText("Username:");

        usernameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(255, 255, 255));
        PasswordText.setText("Password:");

        ConfirmPassText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ConfirmPassText.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassText.setText("Confirm Password:");

        RegisterButton.setBackground(new java.awt.Color(57, 20, 162));
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
        });
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(57, 20, 162));
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ConfirmPassField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CardioText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(HomeOFFitnessField)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(adminRegText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FirstNameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AgeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ContactText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContactField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddressText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PasswordText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GenderText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femaleButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UsernameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConfirmPassText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(DOBText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LastNameText)
                            .addGap(18, 18, 18)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(RegisterButton)
                .addGap(93, 93, 93)
                .addComponent(ExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CardioText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeOFFitnessField)
                .addGap(44, 44, 44)
                .addComponent(adminRegText)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameText)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameText)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeText)
                            .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderText)
                            .addComponent(maleButton)
                            .addComponent(femaleButton))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOBText)
                            .addComponent(ContactText)
                            .addComponent(ContactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressText)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameText)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordText)
                    .addComponent(ConfirmPassText)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(ExitButton))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
        // TODO add your handling code here:
      
        
        String regex = "\\d{10}";
          if (FirstNameField.getText().equals("")
             ||LastNameField.getText().equals("")
             ||AgeField.getText().equals("")
             ||ContactField.getText().equals("")
             ||jDateChooser1.getDate()==null
             ||AddressField.getText().equals("")
             ||usernameField.getText().equals("")
             ||PasswordField.getText().equals("")
             ||ConfirmPassField.getText().equals("")
                  ){
        JOptionPane.showMessageDialog(rootPane, "Insufficient credentials given");
        
        
    }else if(!ContactField.getText().matches(regex)){
        JOptionPane.showMessageDialog(rootPane, "Invalid Contact. Enter contact number with 10 digits and no characters ");
    }else if(!PasswordField.getText().equals(ConfirmPassField.getText())){
        JOptionPane.showMessageDialog(rootPane, "Password and ConfirmPassword doesn't match.");
    }
          
    else{
         System.out.println("The button is clicked!");
        String first_name = FirstNameField.getText();
        String last_name= LastNameField.getText();
        int age = Integer.parseInt(AgeField.getText());
        String gender;
        if(maleButton.isSelected()){
        gender = "Male";
        }else if(femaleButton.isSelected()){
        gender = "Female";
        }else{
            gender = "none";
        }
        String contact_number = ContactField.getText();
        Date date_of_birth  = jDateChooser1.getDate();
        String address = AddressField.getText();
        String username = usernameField.getText();
        String password = PasswordField.getText();
//        String confirm_password = ConfirmPassField.getText();
        
        
        
        Admin adminInput = new Admin(first_name, last_name,age,gender, contact_number,date_of_birth, address,  username,password);
        
        FirstNameField.setText("");
        LastNameField.setText("");
        AgeField.setText("");
        ContactField.setText("");
        jDateChooser1.setDate(null);
        AddressField.setText("");
        usernameField.setText("");
        PasswordField.setText("");
        ConfirmPassField.setText("");
        System.out.println("You have been successfully registered");
       
       
                  
        try {
            AdminDao.addAdmin(adminInput);
            //System.out.println("You have been successfully registered");
            this.dispose();
            LoginPage ss = new LoginPage();
            ss.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
        

    }  
        
    }//GEN-LAST:event_RegisterButtonMouseClicked

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressText;
    private javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeText;
    private javax.swing.JLabel CardioText;
    private javax.swing.JPasswordField ConfirmPassField;
    private javax.swing.JLabel ConfirmPassText;
    private javax.swing.JTextField ContactField;
    private javax.swing.JLabel ContactText;
    private javax.swing.JLabel DOBText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel FirstNameText;
    private javax.swing.JLabel GenderText;
    private javax.swing.JLabel HomeOFFitnessField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel UsernameText;
    private javax.swing.JLabel adminRegText;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton femaleButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
