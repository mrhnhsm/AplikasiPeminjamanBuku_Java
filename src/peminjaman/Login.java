/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
package peminjaman;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

class masukkan{

    private Component rootPane;

    masukkan(String id, String password1) {
        try {
            Connection kon = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
            ResultSet as = kon.createStatement().executeQuery("select * from anggota where id_anggota='"+id+"' and password='"+password1+"'");
            while(as.next()){
                id=as.getString("id_anggota");
            }
            as.last();
            if(as.getRow()==1){
                Register.setid(id);
                JOptionPane.showMessageDialog(rootPane, "Anda Berhasil Login");
                peminjamanbuku ha = new peminjamanbuku();
                ha.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Username,Id,Atau Password Salah");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Username,Id,Atau Password Salah");
        }
    }


}

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        btndaftar = new javax.swing.JButton();
        masuk = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        id_anggota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndaftar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndaftar.setText("DAFTAR");
        btndaftar.setBorder(null);
        btndaftar.setContentAreaFilled(false);
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 850, 210, 40));

        masuk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        masuk.setForeground(new java.awt.Color(255, 255, 255));
        masuk.setText("LOGIN");
        masuk.setBorder(null);
        masuk.setContentAreaFilled(false);
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        getContentPane().add(masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 220, 80));

        password.setBackground(new java.awt.Color(236, 236, 236));
        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 590, 70));

        id_anggota.setBackground(new java.awt.Color(236, 236, 236));
        id_anggota.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id_anggota.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(id_anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 580, 80));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("NB : USERNAME DIISI ID ANGGOTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 850, 270, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/login.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed

                   new Daftar().show(); 
                   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btndaftarActionPerformed

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        // TODO add your handling code here:
        String id = id_anggota.getText();
        String password1 = password.getText();
        masukkan masukkan1=new masukkan(id,password1);
        this.dispose();
       
    }//GEN-LAST:event_masukActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndaftar;
    private javax.swing.JTextField id_anggota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton masuk;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}