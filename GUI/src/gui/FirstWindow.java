/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Markus_Mayr
 */
public class FirstWindow extends javax.swing.JFrame {

    /**
     * Creates new form FirstWindow
     */
    public FirstWindow() {
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

        tf_passwort = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        lbl_ausgabe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_passwort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwortActionPerformed(evt);
            }
        });

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        lbl_ausgabe.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ausgabe, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(tf_passwort))
                .addGap(66, 66, 66)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_passwort, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ausgabe, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_passwortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passwortActionPerformed

    private boolean isPass = false;

    public boolean isIsPass() {
        return isPass;
    }

    public void setIsPass(boolean isPass) {
        this.isPass = isPass;
    }
    
    
    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
        String txt = tf_passwort.getText().trim();
        if (txt.equals("Kennwort0")) {
            lbl_ausgabe.setText("Passwort korrekt");
            lbl_ausgabe.setForeground(Color.green);
            setIsPass(true);
        }else if(txt.equals("")){
            
        }else{
            lbl_ausgabe.setText("Passwort nicht korrekt");
            lbl_ausgabe.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_btn_okActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FirstWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_ausgabe;
    private javax.swing.JTextField tf_passwort;
    // End of variables declaration//GEN-END:variables
}
