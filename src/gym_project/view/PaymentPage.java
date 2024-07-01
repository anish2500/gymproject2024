/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_project.view;

/**
 *
 * @author user
 */
public class PaymentPage extends javax.swing.JFrame {

    /**
     * Creates new form PaymentPage
     */
    public PaymentPage() {
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

        jPanel1 = new javax.swing.JPanel();
        PaymentText = new javax.swing.JLabel();
        MemberIDText = new javax.swing.JLabel();
        DateText = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        PhoneNumberText = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        AmountText = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        ExtiButton = new javax.swing.JButton();
        MemberIDField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        PHFIeld = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        AmountField = new javax.swing.JTextField();
        Datefield = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(4, 101, 130));

        PaymentText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PaymentText.setForeground(new java.awt.Color(255, 255, 255));
        PaymentText.setText("PAYMENT");

        MemberIDText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MemberIDText.setForeground(new java.awt.Color(255, 255, 255));
        MemberIDText.setText("Member ID:");

        DateText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DateText.setForeground(new java.awt.Color(255, 255, 255));
        DateText.setText("Date:");

        NameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NameText.setForeground(new java.awt.Color(255, 255, 255));
        NameText.setText("Name:");

        PhoneNumberText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PhoneNumberText.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberText.setText("Phone Number:");

        EmailText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        EmailText.setForeground(new java.awt.Color(255, 255, 255));
        EmailText.setText("Email:");

        AmountText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AmountText.setForeground(new java.awt.Color(255, 255, 255));
        AmountText.setText("Amount:");

        SubmitButton.setBackground(new java.awt.Color(57, 20, 162));
        SubmitButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");

        ExtiButton.setBackground(new java.awt.Color(57, 20, 162));
        ExtiButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ExtiButton.setForeground(new java.awt.Color(255, 255, 255));
        ExtiButton.setText("Exit");
        ExtiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExtiButtonMouseClicked(evt);
            }
        });

        MemberIDField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PHFIeld.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        AmountField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MemberIDText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MemberIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DateText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Datefield, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PhoneNumberText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PHFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AmountText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(SubmitButton)
                                .addGap(66, 66, 66)
                                .addComponent(ExtiButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(PaymentText)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(PaymentText)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberIDText)
                    .addComponent(MemberIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateText)
                    .addComponent(Datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberText)
                    .addComponent(PHFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailText)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountText)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(ExtiButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExtiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtiButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExtiButtonMouseClicked

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
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountField;
    private javax.swing.JLabel AmountText;
    private javax.swing.JLabel DateText;
    private com.toedter.calendar.JDateChooser Datefield;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailText;
    private javax.swing.JButton ExtiButton;
    private javax.swing.JTextField MemberIDField;
    private javax.swing.JLabel MemberIDText;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameText;
    private javax.swing.JTextField PHFIeld;
    private javax.swing.JLabel PaymentText;
    private javax.swing.JLabel PhoneNumberText;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
