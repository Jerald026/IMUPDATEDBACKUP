/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TeacherPackage;

import connectionPackage.DBconnection;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author halla
 */
public class Register extends javax.swing.JFrame {

    /** Creates new form Register */
    public Register() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegisterFirstNTextField = new javax.swing.JTextField();
        RegisterLTextField = new javax.swing.JTextField();
        RegisterUserNTextField = new javax.swing.JTextField();
        RegisterPassTextField = new javax.swing.JPasswordField();
        RegisterConfirmPTextField = new javax.swing.JPasswordField();
        ERRORTV = new javax.swing.JLabel();
        blank = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setLayout(null);

        RegisterFirstNTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel1.add(RegisterFirstNTextField);
        RegisterFirstNTextField.setBounds(90, 240, 240, 40);

        RegisterLTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel1.add(RegisterLTextField);
        RegisterLTextField.setBounds(360, 240, 240, 40);

        RegisterUserNTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel1.add(RegisterUserNTextField);
        RegisterUserNTextField.setBounds(90, 340, 510, 40);

        RegisterPassTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(RegisterPassTextField);
        RegisterPassTextField.setBounds(90, 430, 510, 50);

        RegisterConfirmPTextField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(RegisterConfirmPTextField);
        RegisterConfirmPTextField.setBounds(90, 530, 510, 50);

        ERRORTV.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        ERRORTV.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(ERRORTV);
        ERRORTV.setBounds(90, 600, 380, 20);

        blank.setIcon(new javax.swing.ImageIcon("D:\\NU School Files\\5th Term\\UpdateIM-master\\src\\IM PICS\\Register BG.png")); // NOI18N
        blank.setText("jLabel1");
        jPanel1.add(blank);
        blank.setBounds(0, 0, 1965, 768);

        btnRegister.setText("jButton1");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(470, 620, 140, 70);

        BACKBTN.setText("jButton2");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBTN);
        BACKBTN.setBounds(23, 20, 80, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
          try {
            if (RegisterFirstNTextField.getText().equals("") || RegisterLTextField.getText().equals("") || RegisterUserNTextField.getText().equals("") || RegisterPassTextField.getPassword().length==0|| RegisterConfirmPTextField.getPassword().length==0) {
                 ERRORTV.setText("Fill Up all the Fields");
                return;
            }
                        System.out.println(RegisterPassTextField.getPassword());
            System.out.println(RegisterConfirmPTextField.getPassword());
            if (!Arrays.equals(RegisterPassTextField.getPassword(),RegisterConfirmPTextField.getPassword())) {
                 ERRORTV.setText("Password is not match");
                return;
            }

            try (Connection con = DBconnection.connect()) {
                PreparedStatement pst = con.prepareStatement("SELECT * FROM Teacher_Account WHERE TA_Username = ?");
                pst.setString(1, RegisterUserNTextField.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    ERRORTV.setText("User already registered");
                    return;
                } else {
                    pst.close();
                    rs.close();
                    pst = con.prepareStatement("INSERT INTO Teacher_Account(TA_Fname,TA_Lname,TA_Username,TA_Password) VALUES(?,?,?,?)");
                    pst.setString(1, RegisterFirstNTextField.getText());
                    pst.setString(2, RegisterLTextField.getText());
                    pst.setString(3, RegisterUserNTextField.getText());
                    pst.setString(4, Arrays.toString(RegisterPassTextField.getPassword()));
                    pst.execute();
                    Login login = new Login();
                     login.setVisible(true);
                     this.dispose();
                }
                pst.close();
                con.close();
                 
                  
                 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }                                        

      private void ewanko(java.awt.event.ActionEvent evt) {                                     
       
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
       try {
            Login teacherlogin = new Login();
            teacherlogin.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BACKBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JLabel ERRORTV;
    private javax.swing.JPasswordField RegisterConfirmPTextField;
    private javax.swing.JTextField RegisterFirstNTextField;
    private javax.swing.JTextField RegisterLTextField;
    private javax.swing.JPasswordField RegisterPassTextField;
    private javax.swing.JTextField RegisterUserNTextField;
    private javax.swing.JLabel blank;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
