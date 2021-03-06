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
public class SingleTextFrame extends javax.swing.JFrame {

    private String user;
    private String title;

    /**
     * Creates new form Home
     */
    public SingleTextFrame() {
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

    public SingleTextFrame(String user, String title) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        this.user = user;
        this.title = title;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        TITLETOP.setText(title);
        ERRORLABEl.setVisible(false);
        SUCCESSLABEL.setVisible(false);
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
        TextFieldAnswerText = new javax.swing.JTextField();
        SINGLEADD = new javax.swing.JButton();
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
        jLabel2.setText("ANSWER:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(790, 350, 100, 50);

        TEXTAREAQTN.setColumns(20);
        TEXTAREAQTN.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TEXTAREAQTN.setRows(5);
        jScrollPane1.setViewportView(TEXTAREAQTN);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 230, 750, 100);

        TextFieldAnswerText.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(TextFieldAnswerText);
        TextFieldAnswerText.setBounds(600, 410, 500, 51);

        SINGLEADD.setBackground(new java.awt.Color(0, 102, 51));
        SINGLEADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SINGLEADD.setForeground(new java.awt.Color(255, 255, 255));
        SINGLEADD.setText("ADD");
        SINGLEADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINGLEADDActionPerformed(evt);
            }
        });
        jPanel1.add(SINGLEADD);
        SINGLEADD.setBounds(780, 510, 120, 60);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setText("Question:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 190, 190, 50);

        TITLETOP.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        TITLETOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TITLETOP);
        TITLETOP.setBounds(340, 60, 690, 60);

        SUCCESSLABEL.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        SUCCESSLABEL.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(SUCCESSLABEL);
        SUCCESSLABEL.setBounds(450, 330, 320, 30);

        ERRORLABEl.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        ERRORLABEl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(ERRORLABEl);
        ERRORLABEl.setBounds(450, 330, 320, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NU School Files\\5th Term\\UpdateIM-master\\src\\IM PICS\\Identification BG.png")); // NOI18N
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
        BACKBTN.setBounds(20, 20, 73, 60);

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
        TextFieldAnswerText.setText("");
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


    private void SINGLEADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINGLEADDActionPerformed
        try {
            if(TextFieldAnswerText.getText().length()==0 || TEXTAREAQTN.getText().length()==0){
                ERRORLABEl.setVisible(true);
                SUCCESSLABEL.setVisible(false);
                ERRORLABEl.setText("The answer is empty");
                return;
            }
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Questions WHERE QE_Questions = ? AND TA_ID =? AND QT_ID = ?");
            pst.setString(1, TEXTAREAQTN.getText());
            pst.setInt(2, getUserID(user));
            pst.setInt(3, getIDQuizTitle(title));
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ERRORLABEl.setVisible(true);
                SUCCESSLABEL.setVisible(false);
                ERRORLABEl.setText("The question is already in the list");
                return;
            } else {
                String QTN = TEXTAREAQTN.getText();
                String answer = TextFieldAnswerText.getText();
                int QuizTitleID = getIDQuizTitle(title);
                pst.close();
                rs.close();
                pst = con.prepareStatement("INSERT INTO Questions(TA_ID,QT_ID,QE_Questions,QE_Condition) VALUES(?,?,?,?)");
                pst.setInt(1, getUserID(user));
                pst.setInt(2, QuizTitleID);
                pst.setString(3, QTN);
                pst.setString(4, "TEXT");
                pst.execute();
                pst.close();

                System.out.println(getIDQuestions(QTN));
                pst = con.prepareStatement("INSERT INTO AnswersSingle(QE_ID,QT_ID,AN_Answers) VALUES(?,?,?)");
                pst.setInt(1, getIDQuestions(QTN));
                pst.setInt(2, QuizTitleID);
                pst.setString(3, answer);
                pst.execute();
                pst.close();
            }
            ERRORLABEl.setVisible(false);
            SUCCESSLABEL.setVisible(true);
            SUCCESSLABEL.setText("SUCCESSFULLY ADDED");
            setToEmpty();
        } catch (SQLException ex) {
//            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingleTextFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SINGLEADDActionPerformed

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
            java.util.logging.Logger.getLogger(SingleTextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleTextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleTextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleTextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingleTextFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JLabel ERRORLABEl;
    private javax.swing.JButton SINGLEADD;
    private javax.swing.JLabel SUCCESSLABEL;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JLabel TITLETOP;
    private javax.swing.JTextField TextFieldAnswerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
