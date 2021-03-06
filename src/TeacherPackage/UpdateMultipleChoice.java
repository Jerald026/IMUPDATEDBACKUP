/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherPackage;

import StudentPackage.StudentInformation;
import static connectionPackage.DBconnection.connect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halla
 */
public class UpdateMultipleChoice extends javax.swing.JFrame {

    private String user;
    private String title;

    /**
     * Creates new form Home
     */
    public UpdateMultipleChoice() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        ComboBoxChoices.removeAllItems();
        ComboBoxChoices.addItem("A");
        ComboBoxChoices.addItem("B");
        ComboBoxChoices.addItem("C");
        ComboBoxChoices.addItem("D");
    }

    private int Questions_TA_ID, Questions_QT_ID, Questions_QE_ID;
    private String Questions_QE_Questions, Questions_QE_Condition, AnswersSingle_AN_Answers, AnswersSingle_AN_CorrectAns;
    private String AnswersSingle_AN_A, AnswersSingle_AN_B, AnswersSingle_AN_C, AnswersSingle_AN_D;

    public UpdateMultipleChoice(String user, String title, int Questions_TA_ID, int Questions_QT_ID, int Questions_QE_ID,
            String Questions_QE_Questions, String Questions_QE_Condition, String AnswersSingle_AN_CorrectAns,
            String AnswersSingle_AN_A, String AnswersSingle_AN_B, String AnswersSingle_AN_C, String AnswersSingle_AN_D) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        ERRORLABEl.setVisible(false);
        SUCCESSLABEL.setVisible(false);
        this.title = title;
        this.user = user;
        ComboBoxChoices.removeAllItems();
        ComboBoxChoices.addItem("A");
        ComboBoxChoices.addItem("B");
        ComboBoxChoices.addItem("C");
        ComboBoxChoices.addItem("D");
        this.Questions_TA_ID = Questions_TA_ID;
        this.Questions_QT_ID = Questions_QT_ID;
        this.Questions_QE_ID = Questions_QE_ID;
        this.Questions_QE_Questions = Questions_QE_Questions;
        this.Questions_QE_Condition = Questions_QE_Condition;
        this.AnswersSingle_AN_CorrectAns = AnswersSingle_AN_CorrectAns;
        this.AnswersSingle_AN_A = AnswersSingle_AN_A;
        this.AnswersSingle_AN_B = AnswersSingle_AN_B;
        this.AnswersSingle_AN_C = AnswersSingle_AN_C;
        this.AnswersSingle_AN_D = AnswersSingle_AN_D;
        TEXTAREAQTN.setText(this.Questions_QE_Questions);

        TextFieldA.setText(this.AnswersSingle_AN_A);
        TextFieldB.setText(this.AnswersSingle_AN_B);
        TextFieldC.setText(this.AnswersSingle_AN_C);
        TextFieldD.setText(this.AnswersSingle_AN_D);
        TITLETOP.setText(title);
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREAQTN = new javax.swing.JTextArea();
        ComboBoxChoices = new javax.swing.JComboBox<>();
        MULTIADD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextFieldA = new javax.swing.JTextField();
        TextFieldB = new javax.swing.JTextField();
        TextFieldD = new javax.swing.JTextField();
        TextFieldC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TITLETOP = new javax.swing.JLabel();
        SUCCESSLABEL = new javax.swing.JLabel();
        ERRORLABEl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BACKBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(1965, 1080));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setText("Question:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 180, 190, 50);

        TEXTAREAQTN.setColumns(20);
        TEXTAREAQTN.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TEXTAREAQTN.setRows(5);
        jScrollPane1.setViewportView(TEXTAREAQTN);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 220, 690, 130);

        ComboBoxChoices.setBackground(new java.awt.Color(0, 102, 51));
        ComboBoxChoices.setForeground(new java.awt.Color(255, 255, 255));
        ComboBoxChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboBoxChoices);
        ComboBoxChoices.setBounds(1030, 530, 71, 29);

        MULTIADD.setBackground(new java.awt.Color(0, 102, 51));
        MULTIADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MULTIADD.setForeground(new java.awt.Color(255, 255, 255));
        MULTIADD.setText("ADD");
        MULTIADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIADDActionPerformed(evt);
            }
        });
        jPanel1.add(MULTIADD);
        MULTIADD.setBounds(750, 650, 90, 50);

        jLabel7.setText("CORRECT ANSWER");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1010, 490, 120, 30);

        TextFieldA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(TextFieldA);
        TextFieldA.setBounds(632, 410, 320, 41);

        TextFieldB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(TextFieldB);
        TextFieldB.setBounds(632, 470, 320, 41);

        TextFieldD.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(TextFieldD);
        TextFieldD.setBounds(632, 590, 320, 41);

        TextFieldC.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(TextFieldC);
        TextFieldC.setBounds(632, 530, 320, 41);

        jLabel6.setText("D");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(617, 600, 10, 14);

        jLabel5.setText("C");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(617, 540, 10, 14);

        jLabel4.setText("B");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(616, 480, 10, 14);

        jLabel3.setText("A");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(617, 420, 10, 14);

        TITLETOP.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        TITLETOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TITLETOP);
        TITLETOP.setBounds(340, 30, 690, 70);

        SUCCESSLABEL.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        SUCCESSLABEL.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(SUCCESSLABEL);
        SUCCESSLABEL.setBounds(450, 350, 320, 30);

        ERRORLABEl.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        ERRORLABEl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(ERRORLABEl);
        ERRORLABEl.setBounds(450, 350, 320, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NU School Files\\5th Term\\UpdateIM-master\\src\\IM PICS\\Multiple BG.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1965, 768);

        BACKBTN.setText("jButton1");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBTN);
        BACKBTN.setBounds(20, 3, 73, 50);

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
public int getIDQuizTitle(String title) throws SQLException {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT QT_ID FROM QuizesTitle WHERE QT_Title = ? ");
            pst.setString(1, title);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getIDQuestions(String question) throws SQLException {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT QE_ID FROM Questions WHERE QE_Questions = ? ");
            pst.setString(1, question);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void setToEmpty() {
        TEXTAREAQTN.setText("");
        TextFieldA.setText("");
        TextFieldB.setText("");
        TextFieldC.setText("");
        TextFieldD.setText("");
    }

    public int getUserID(String user) throws SQLException {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT TA_ID FROM Teacher_Account WHERE TA_Username = ? ");
            pst.setString(1, user);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void MULTIADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIADDActionPerformed
        try {
            String QTN = TEXTAREAQTN.getText();
            String a = TextFieldA.getText();
            String b = TextFieldB.getText();
            String c = TextFieldC.getText();
            String d = TextFieldD.getText();
            String correctAnsw = ComboBoxChoices.getSelectedItem().toString();
            Connection con = connect();
            String SQL = "UPDATE Questions \n"
                    + "SET QE_Questions = '"+QTN+"', QE_Condition = 'MULTIPLE'\n"
                    + "WHERE TA_ID = '"+Questions_TA_ID+"' AND QT_ID = '"+Questions_QT_ID+"'";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.execute();
            pst.close();
                     String SQL2 = "UPDATE AnswersSingle \n"
                    + "SET AN_A = '"+a+"', AN_B = '"+b+"', AN_C = '"+c+"', AN_D = '"+d+"', AN_CorrectAns = '"+correctAnsw+"' \n"
                    + "WHERE QE_ID = '"+Questions_QE_ID+"' AND QT_ID = '"+Questions_QT_ID+"'";
            pst = con.prepareStatement(SQL2);
            pst.execute();
            pst.close();
            SUCCESSLABEL.setVisible(true);
            SUCCESSLABEL.setText("UPDATED");
            
            setToEmpty();
        } catch (SQLException ex) {
//            Logger.getLogger(UpdateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UpdateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MULTIADDActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
        Choices choice = new Choices(user, title);
        choice.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(UpdateMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMultipleChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMultipleChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JComboBox<String> ComboBoxChoices;
    private javax.swing.JLabel ERRORLABEl;
    private javax.swing.JButton MULTIADD;
    private javax.swing.JLabel SUCCESSLABEL;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JLabel TITLETOP;
    private javax.swing.JTextField TextFieldA;
    private javax.swing.JTextField TextFieldB;
    private javax.swing.JTextField TextFieldC;
    private javax.swing.JTextField TextFieldD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
