/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import TeacherPackage.Choices;
import static connectionPackage.DBconnection.connect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halla
 */
public class LastTryCopy extends javax.swing.JFrame {
    private int counting=0;
    private int correctuser=0;
    private int numberofproblems=0;
    private int TAID, QTID;
    String wew = "";
    int temp = 0;
    /**
     * Creates new form Home
     */
    ResultSet questionRs;
    ArrayList<String> questionsList, conditionList;
    ArrayList<Integer> questionsIDList;
    ArrayList<String> answers = new ArrayList<>();
    String[][] choices;
    int count = 0;
    int QEID;
    int SAID;
    private int id;

    public LastTryCopy() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        enterAnswerLbl.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    public LastTryCopy(int id, int TAID, int QTID, String title, String condition) throws SQLException {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        this.id = id;
        System.out.println(id);
        createPopulate(TAID, QTID);
        DONE.setVisible(false);
//        if (questionRs.next()) {
//            TEXTAREAQTN.setText(questionRs.getString(4));
//            if (questionRs.getString(5).equals("MULTIPLE")) {
//                txt_Identification.setVisible(false);
//                txtA.setText(questionRs.getString(8));
//                txtB.setText(questionRs.getString(9));
//                txtC.setText(questionRs.getString(10));
//                txtD.setText(questionRs.getString(11));
//            } else if (questionRs.getString(5).equals("TEXT")) {
//                txt_Identification.setVisible(true);
//                 txtA.setVisible(false);
//                 txt_Multiple.setVisible(false);
//                    txtB.setVisible(false);
//                    txtC.setVisible(false);
//                    txtD.setVisible(false);
//                    
//            }
//
//        }
        enterAnswerLbl.setVisible(false);
        JLabelA.setVisible(false);
        JLabelB.setVisible(false);
        JLabelC.setVisible(false);
        JLabelD.setVisible(false);
        txtA.setVisible(false);
        txtB.setVisible(false);
        txtC.setVisible(false);
        txtD.setVisible(false);
        txt_Identification.setVisible(false);
        txt_Multiple.setVisible(false);
        test.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        this.TAID = TAID;
        this.QTID = QTID;

        TITLETOP.setText(title);
        if (condition.equals("TEXT")) {
            txt_Identification.setVisible(true);
            JLabelA.setVisible(false);
            JLabelB.setVisible(false);
            JLabelC.setVisible(false);
            JLabelD.setVisible(false);
            txtA.setVisible(false);
            txtB.setVisible(false);
            txtC.setVisible(false);
            txtD.setVisible(false);

        } else if (condition.equals("MULTIPLE")) {
            JLabelA.setVisible(true);
            JLabelB.setVisible(true);
            JLabelC.setVisible(true);
            JLabelD.setVisible(true);
            txtA.setVisible(true);
            txtB.setVisible(true);
            txtC.setVisible(true);
            txtD.setVisible(true);
            txt_Identification.setVisible(false);
            txt_Multiple.setVisible(true);
        }
        TEXTAREAQTN.setEditable(false);

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
        TITLETOP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREAQTN = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        JLabelA = new javax.swing.JLabel();
        JLabelB = new javax.swing.JLabel();
        JLabelC = new javax.swing.JLabel();
        JLabelD = new javax.swing.JLabel();
        txtA = new javax.swing.JLabel();
        txtB = new javax.swing.JLabel();
        txtC = new javax.swing.JLabel();
        txtD = new javax.swing.JLabel();
        NEXTBTN = new javax.swing.JButton();
        txt_Identification = new javax.swing.JTextField();
        jLblIden = new javax.swing.JLabel();
        DONE = new javax.swing.JButton();
        enterAnswerLbl = new javax.swing.JLabel();
        jLblMultiple = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        txt_Multiple = new javax.swing.JTextField();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(1965, 1080));
        jPanel1.setLayout(null);

        TITLETOP.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        TITLETOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TITLETOP);
        TITLETOP.setBounds(340, 50, 690, 50);

        TEXTAREAQTN.setColumns(20);
        TEXTAREAQTN.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TEXTAREAQTN.setRows(5);
        jScrollPane1.setViewportView(TEXTAREAQTN);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 220, 970, 140);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setText("Question:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 170, 130, 50);

        JLabelA.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JLabelA.setText("A.");
        jPanel1.add(JLabelA);
        JLabelA.setBounds(370, 460, 30, 17);

        JLabelB.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JLabelB.setText("B.");
        jPanel1.add(JLabelB);
        JLabelB.setBounds(370, 520, 30, 17);

        JLabelC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JLabelC.setText("C.");
        jPanel1.add(JLabelC);
        JLabelC.setBounds(370, 580, 30, 17);

        JLabelD.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        JLabelD.setText("D.");
        jPanel1.add(JLabelD);
        JLabelD.setBounds(370, 640, 30, 17);

        txtA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txtA);
        txtA.setBounds(390, 450, 250, 40);

        txtB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txtB);
        txtB.setBounds(390, 510, 250, 40);

        txtC.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txtC);
        txtC.setBounds(390, 570, 250, 40);

        txtD.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txtD);
        txtD.setBounds(390, 630, 250, 40);

        NEXTBTN.setBackground(new java.awt.Color(0, 102, 51));
        NEXTBTN.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        NEXTBTN.setForeground(new java.awt.Color(255, 255, 255));
        NEXTBTN.setText("NEXT");
        NEXTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTBTNActionPerformed(evt);
            }
        });
        jPanel1.add(NEXTBTN);
        NEXTBTN.setBounds(1190, 220, 80, 30);

        txt_Identification.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txt_Identification);
        txt_Identification.setBounds(430, 410, 290, 80);

        jLblIden.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLblIden.setText("Answer: ");
        jPanel1.add(jLblIden);
        jLblIden.setBounds(320, 410, 110, 50);

        DONE.setBackground(new java.awt.Color(0, 102, 51));
        DONE.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DONE.setForeground(new java.awt.Color(255, 255, 255));
        DONE.setText("SUBMIT ANSWERS");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        jPanel1.add(DONE);
        DONE.setBounds(1150, 710, 180, 30);

        enterAnswerLbl.setText("Enter Answer First!");
        jPanel1.add(enterAnswerLbl);
        enterAnswerLbl.setBounds(800, 380, 110, 30);

        jLblMultiple.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLblMultiple.setText("ANSWER:");
        jPanel1.add(jLblMultiple);
        jLblMultiple.setBounds(440, 700, 80, 30);

        test.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(test);
        test.setBounds(940, 520, 260, 30);

        txt_Multiple.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(txt_Multiple);
        txt_Multiple.setBounds(520, 700, 100, 30);

        BACKGROUND.setIcon(new javax.swing.ImageIcon("D:\\NU School Files\\5th Term\\UpdateIM-master\\src\\IM PICS\\Answering BG.png")); // NOI18N
        BACKGROUND.setText("jLabel1");
        jPanel1.add(BACKGROUND);
        BACKGROUND.setBounds(0, 0, 1965, 768);

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

    public void createPopulate(int userID, int QuizTitle) throws SQLException {
        try {
            String sql = "SELECT Questions.TA_ID AS Teacher_ID, Questions.QT_ID AS TitleID ,Questions.QE_ID AS Question_ID ,Questions.QE_Questions AS Question,Questions.QE_Condition AS Condition,AnswersSingle.AN_Answers AS Answer_Identification,AnswersSingle.AN_CorrectAns AS Answer_Mutiple,"
                    + "AnswersSingle.AN_A AS Answer_A,AnswersSingle.AN_B AS Answer_B,AnswersSingle.AN_C AS Answer_C,AnswersSingle.AN_D AS Answer_D\n"
                    + "FROM Questions FULL JOIN AnswersSingle \n"
                    + "ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = '" + userID + "' AND Questions.QT_ID = '" + QuizTitle + "'";
            Connection conn = connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            questionRs = pst.executeQuery();
            
            
            String sql2 = "SELECT Questions.TA_ID AS Teacher_ID, Questions.QT_ID AS TitleID ,Questions.QE_ID AS Question_ID ,Questions.QE_Questions AS Question,Questions.QE_Condition AS Condition,AnswersSingle.AN_Answers AS Answer_Identification,AnswersSingle.AN_CorrectAns AS Answer_Mutiple,"
                    + "AnswersSingle.AN_A AS Answer_A,AnswersSingle.AN_B AS Answer_B,AnswersSingle.AN_C AS Answer_C,AnswersSingle.AN_D AS Answer_D\n"
                    + "FROM Questions FULL JOIN AnswersSingle \n"
                    + "ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = '" + userID + "' AND Questions.QT_ID = '" + QuizTitle + "'";
            Connection conn2 = connect();
            PreparedStatement pst2 = conn2.prepareStatement(sql2);
         ResultSet    setquestionRs = pst2.executeQuery();
        while(setquestionRs.next()){
            counting++;
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LastTryCopy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void NEXTBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTBTNActionPerformed

        try {
             
            if (temp > 0) {
                if (questionRs.next()) {
                    TEXTAREAQTN.setText(questionRs.getString(4));
                    if (questionRs.getString(5).equals("MULTIPLE")) {
                            txt_Multiple.setVisible(true);
                        txtA.setVisible(true);
                        txtB.setVisible(true);
                        txtC.setVisible(true);
                        txtD.setVisible(true);
                        JLabelA.setVisible(true);
                        JLabelB.setVisible(true);
                        JLabelC.setVisible(true);
                        JLabelD.setVisible(true);
                        txt_Identification.setVisible(false);
                        txtA.setText(questionRs.getString(8));
                        txtB.setText(questionRs.getString(9));
                        txtC.setText(questionRs.getString(10));
                        txtD.setText(questionRs.getString(11));

                        Connection con = connect();
                        PreparedStatement pst = con.prepareStatement("INSERT INTO Answer_Student(SA_ID,QE_ID,Answer,Correct) VALUES(?,?,?,?)");
                        pst.setInt(1, id);
                        pst.setInt(2, questionRs.getInt(3));

                        pst.setString(3, txt_Multiple.getText());
                        if (txt_Multiple.getText().equals(questionRs.getString(7))) {
                            correctuser++;
                            pst.setInt(4, 1);
                        } else {
                            pst.setInt(4, 0);
                        }
                        pst.execute();
                                numberofproblems++;
                    } else if (questionRs.getString(5).equals("TEXT")) {
                        txt_Identification.setVisible(true);
                       txt_Multiple.setVisible(false);
                        txtA.setVisible(false);
                        txtB.setVisible(false);
                        txtC.setVisible(false);
                        txtD.setVisible(false);
                        JLabelA.setVisible(false);
                        JLabelB.setVisible(false);
                        JLabelC.setVisible(false);
                        JLabelD.setVisible(false);
                        Connection con = connect();
                        PreparedStatement pst = con.prepareStatement("INSERT INTO Answer_Student(SA_ID,QE_ID,Answer,Correct) VALUES(?,?,?,?)");
                        pst.setInt(1, id);
                        pst.setInt(2, questionRs.getInt(3));
                        pst.setString(3, txt_Identification.getText());
                        if (txt_Identification.getText().equals(questionRs.getString(7))) {
                            correctuser++;
                            pst.setInt(4, 1);
                        } else {
                            pst.setInt(4, 0);
                        }
                        pst.execute();
                        numberofproblems++;
                    }       
                }
                
            }
            temp++;
         if(counting-1==temp){
              DONE.setVisible(true);
         }
        } catch (Exception e) {
            System.out.println(e);
           
        }
    }//GEN-LAST:event_NEXTBTNActionPerformed

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        try {
            Result r = new Result(correctuser,numberofproblems,id);
            r.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LastTryCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DONEActionPerformed

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
            java.util.logging.Logger.getLogger(LastTryCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LastTryCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LastTryCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LastTryCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LastTryCopy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton DONE;
    private javax.swing.JLabel JLabelA;
    private javax.swing.JLabel JLabelB;
    private javax.swing.JLabel JLabelC;
    private javax.swing.JLabel JLabelD;
    private javax.swing.JButton NEXTBTN;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JLabel TITLETOP;
    private javax.swing.JLabel enterAnswerLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblIden;
    private javax.swing.JLabel jLblMultiple;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel test;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtD;
    private javax.swing.JTextField txt_Identification;
    private javax.swing.JTextField txt_Multiple;
    // End of variables declaration//GEN-END:variables
}
