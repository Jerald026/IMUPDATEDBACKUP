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
public class StudentAnswerText extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public StudentAnswerText() {
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
        NEXTBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextFieldAnswer = new javax.swing.JTextField();
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
        jLabel2.setText("Answer: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 410, 110, 50);

        NEXTBTN.setText("NEXT");
        jPanel1.add(NEXTBTN);
        NEXTBTN.setBounds(1240, 710, 80, 30);

        BACKBTN.setText("BACK");
        jPanel1.add(BACKBTN);
        BACKBTN.setBounds(1129, 710, 80, 30);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setText("Question:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 170, 130, 50);
        jPanel1.add(TextFieldAnswer);
        TextFieldAnswer.setBounds(430, 410, 290, 80);

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
            java.util.logging.Logger.getLogger(StudentAnswerText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAnswerText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentAnswerText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton NEXTBTN;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JLabel TITLETOP;
    private javax.swing.JTextField TextFieldAnswer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
