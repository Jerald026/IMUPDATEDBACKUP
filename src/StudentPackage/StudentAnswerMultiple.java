/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import TeacherPackage.*;
import StudentPackage.StudentInformation;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halla
 */
public class StudentAnswerMultiple extends javax.swing.JFrame {
        private int TAID, QTID;
    /**
     * Creates new form Home
     */
    public StudentAnswerMultiple() {
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
    public StudentAnswerMultiple(int TAID,int QTID,String title) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        this.TAID=TAID;
        this.QTID=QTID;
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
        TITLETOP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREAQTN = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RadioBTNB = new javax.swing.JRadioButton();
        RadioBTNC = new javax.swing.JRadioButton();
        RadioBTND = new javax.swing.JRadioButton();
        RadioBTNA = new javax.swing.JRadioButton();
        NEXTBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();
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
        TEXTAREAQTN.setRows(5);
        jScrollPane1.setViewportView(TEXTAREAQTN);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 220, 970, 140);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setText("Question:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 170, 130, 50);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setText("A");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 460, 30, 17);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("B");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 520, 30, 17);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("C");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 580, 30, 17);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("D");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 640, 30, 17);

        RadioBTNB.setBackground(new java.awt.Color(255, 255, 255));
        RadioBTNB.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel1.add(RadioBTNB);
        RadioBTNB.setBounds(390, 510, 290, 40);

        RadioBTNC.setBackground(new java.awt.Color(255, 255, 255));
        RadioBTNC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel1.add(RadioBTNC);
        RadioBTNC.setBounds(390, 570, 290, 40);

        RadioBTND.setBackground(new java.awt.Color(255, 255, 255));
        RadioBTND.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel1.add(RadioBTND);
        RadioBTND.setBounds(390, 630, 290, 40);

        RadioBTNA.setBackground(new java.awt.Color(255, 255, 255));
        RadioBTNA.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel1.add(RadioBTNA);
        RadioBTNA.setBounds(390, 450, 290, 40);

        NEXTBTN.setText("NEXT");
        NEXTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTBTNActionPerformed(evt);
            }
        });
        jPanel1.add(NEXTBTN);
        NEXTBTN.setBounds(1240, 710, 80, 30);

        BACKBTN.setText("BACK");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBTN);
        BACKBTN.setBounds(1143, 710, 80, 30);

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

    private void NEXTBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEXTBTNActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StudentAnswerMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAnswerMultiple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton NEXTBTN;
    private javax.swing.JRadioButton RadioBTNA;
    private javax.swing.JRadioButton RadioBTNB;
    private javax.swing.JRadioButton RadioBTNC;
    private javax.swing.JRadioButton RadioBTND;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JLabel TITLETOP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
