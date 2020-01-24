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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author halla
 */
public class Login extends javax.swing.JFrame {
   private HashMap<String, String> accounts = new HashMap<>();
    /**
     * Creates new form Login
     */
    public Login() throws SQLException {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        gettingAccountData();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        ERRORTV.setText("");
    }
 private void gettingAccountData() throws SQLException {
        try {
            String query = "SELECT * FROM Teacher_Account";
            Connection conn = DBconnection.connect();
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String username = (rs.getString("TA_Username"));
                String password = (rs.getString("TA_Password"));
                accounts.put(username, password);
            }

        } catch (Exception e) {
            System.out.println("GettingAcountDataError");
            System.out.println(e);
        } 
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
        LoginUserTextField = new javax.swing.JTextField();
        LoginPassTextField = new javax.swing.JPasswordField();
        ERRORTV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RegisterBTN = new javax.swing.JButton();
        EnterBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setLayout(null);

        LoginUserTextField.setBorder(null);
        jPanel1.add(LoginUserTextField);
        LoginUserTextField.setBounds(850, 290, 390, 50);

        LoginPassTextField.setBorder(null);
        jPanel1.add(LoginPassTextField);
        LoginPassTextField.setBounds(850, 410, 390, 50);

        ERRORTV.setText("jLabel2");
        jPanel1.add(ERRORTV);
        ERRORTV.setBounds(850, 540, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NU School Files\\5th Term\\UpdateIM-master\\src\\BG\\Login.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1965, 768);

        RegisterBTN.setText("jButton1");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterBTN);
        RegisterBTN.setBounds(1120, 480, 70, 30);

        EnterBTN.setText("jButton1");
        EnterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBTNActionPerformed(evt);
            }
        });
        jPanel1.add(EnterBTN);
        EnterBTN.setBounds(1110, 533, 140, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterBTNActionPerformed

    private void EnterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBTNActionPerformed
    try{
            if (LoginUserTextField.getText().equals("") || LoginPassTextField.getPassword().length==0) {
                ERRORTV.setText("Fill up all fields");
                return;
            }
             if (accounts.containsKey(LoginUserTextField.getText())){
                    String pass = accounts.get(LoginUserTextField.getText());
                 if (pass.equals(Arrays.toString(LoginPassTextField.getPassword()))) {
                   TeacherQuizzes home = new TeacherQuizzes(LoginUserTextField.getText());
                   home.setVisible(true);
                   this.dispose();
                }else{
                       ERRORTV.setText("Wrong password");
                 }
             }else{
                 ERRORTV.setText("User doesnt exist");
             }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_EnterBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ERRORTV;
    private javax.swing.JButton EnterBTN;
    private javax.swing.JPasswordField LoginPassTextField;
    private javax.swing.JTextField LoginUserTextField;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
