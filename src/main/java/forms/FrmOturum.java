/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import javax.swing.*;
import utils.DBConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import java.awt.EventQueue;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author MustafaAktas
 */
public class FrmOturum extends javax.swing.JFrame {

    Connection conn = new DBConnection().CreateConnection();
    ResultSet rs = null;
    CallableStatement proc = null;
    PreparedStatement pst = null;
    MessageDigest md;

    /**
     * Creates new form FrmOturum
     */
    ////////////////////////Form Load/////////////////////////////////
    public FrmOturum() {
        initComponents();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
                jCheckBoxMenuItemDarkMode.setSelected(false);
            }
        });
    }
/////////////////////Form Load/////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKullaniciAdi = new javax.swing.JTextField();
        jPasswordFieldSifre = new javax.swing.JPasswordField();
        jButtonGiris = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxPassShowHide = new javax.swing.JCheckBox();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAbout = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItemDarkMode = new javax.swing.JCheckBoxMenuItem();
        jMenuItemCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Takip Otomasyonu");
        setBackground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setText("Kütüphane Takip Otomasyonu");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Lütfen Giriş Yapınız!!!");

        jTextFieldKullaniciAdi.setName(""); // NOI18N

        jPasswordFieldSifre.setEchoChar('*');

        jButtonGiris.setText("Giriş Yap");
        jButtonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Kullanıcı Adı");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Şifre");

        jCheckBoxPassShowHide.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\icon\\sifre_gizle.png"));
        jCheckBoxPassShowHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPassShowHideActionPerformed(evt);
            }
        });

        jMenuAbout.setText("Hakkımızda");
        jMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutMouseClicked(evt);
            }
        });
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuBar.add(jMenuAbout);

        jMenu1.setText("Ayarlar");

        jCheckBoxMenuItemDarkMode.setText("Karanlık Mod");
        jCheckBoxMenuItemDarkMode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxMenuItemDarkModeİtemStateChanged(evt);
            }
        });
        jCheckBoxMenuItemDarkMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItemDarkModeStateChanged(evt);
            }
        });
        jCheckBoxMenuItemDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemDarkModeActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItemDarkMode);

        jMenuItemCikis.setText("Çıkış");
        jMenuItemCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCikisActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCikis);

        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBoxPassShowHide))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPassShowHide, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////Giriş Butonu /////////////////////////////////////////////////////
    private void jButtonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisActionPerformed
        try {
            ///////////////////////////////// Şifre Kriptolama (MD5) ///////////////////////////////////////
            String md5Metin = null;
            try {

                md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(jPasswordFieldSifre.getText().getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : messageDigest) {
                    sb.append(String.format("%02x", b));
                }
                md5Metin = sb.toString();

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(FrmOturum.class.getName()).log(Level.SEVERE, null, ex);
            }
            ///////////////////////////////// Şifre Kriptolama (MD5) ///////////////////////////////////////

            String sql = "Select * from Kullanici Where KullaniciAdi=? and Sifre=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextFieldKullaniciAdi.getText().trim());
            pst.setString(2, md5Metin);
            rs = pst.executeQuery();
            if (rs.next()) {

                String darkmode = rs.getString("DarkMode");
               
                if (darkmode.equals("1")) {
                    jCheckBoxMenuItemDarkMode.setSelected(true);
                   
                } else if (darkmode.equals("0")) {
                    jCheckBoxMenuItemDarkMode.setSelected(false);
                    
                }

                String rol = rs.getString("Rol");
                if (rol.equals("Admin")) {
                    int cevap = JOptionPane.showConfirmDialog(null, "Admin Paneline Girmek İstiyormusunuz?\nHayır'a Tıklarsanız Program Açılacaktır.", "Giriş Başarılı!", JOptionPane.YES_NO_OPTION, 1);
                    if (cevap == JOptionPane.YES_OPTION) {
                        FrmAdmin admin = new FrmAdmin();
                        admin.show();
                        this.hide();
                    } else {
                        FrmMenu menu = new FrmMenu();
                        menu.show();
                        this.hide();
                    }
                } else if (rol.equals("User")) {
                    JOptionPane.showMessageDialog(null, "Hoşgeldiniz", "Giriş Başarılı!", 1);
                    FrmMenu menu = new FrmMenu();
                    menu.show();
                    this.hide();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı Ve Şifrenizi Kontrol Ediniz!", "Hata!!!", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmOturum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGirisActionPerformed
//////////////////////////////////Giriş Butonu /////////////////////////////////////////////////////

/////////////////////////////////Şifre Göster/Gizle //////////////////////////////////////////////////    
    private void jCheckBoxPassShowHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPassShowHideActionPerformed
        if (jCheckBoxPassShowHide.isSelected()) {
            jPasswordFieldSifre.setEchoChar((char) 0); // şifreleri göster
            jCheckBoxPassShowHide.setIcon(new ImageIcon(".\\src\\main\\java\\icon\\sifre_goster.png"));
        } else {
            jPasswordFieldSifre.setEchoChar('*'); // şifreleri gizle
            jCheckBoxPassShowHide.setIcon(new ImageIcon(".\\src\\main\\java\\icon\\sifre_gizle.png"));
        }
    }//GEN-LAST:event_jCheckBoxPassShowHideActionPerformed
/////////////////////////////////Şifre Göster/Gizle //////////////////////////////////////////////////

//////////////////////////////////Hakkımızda Penceresi ////////////////////////////////////////////////
    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
        JOptionPane.showMessageDialog(null, "Mustafa Aktaş\n21380101030\nGazi Üniversitesi Tusaş-Kazan Meslek Yüksekokulu\nBilgisayar Programcılığı\nGörsel Programlama III\nKütüphane Takip Otomasyonu Projesi", "Hakkımızda", 1);
    }//GEN-LAST:event_jMenuAboutMouseClicked
//////////////////////////////////Hakkımızda Penceresi ////////////////////////////////////////////////

//////////////////////////////////Çıkış Butonu ////////////////////////////////////////////////////////
    private void jMenuItemCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCikisActionPerformed
        int cevap = JOptionPane.showConfirmDialog(null, "Çıkmak İstediğinizden Emin Misiniz?", "Çıkış Yap!", JOptionPane.YES_NO_OPTION, 2);

        if (cevap == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            // Uygulama kapatılmaz ve kullanıcı ana pencerede kalır.
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jMenuItemCikisActionPerformed
//////////////////////////////////Çıkış Butonu ////////////////////////////////////////////////////////

    private void jCheckBoxMenuItemDarkModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemDarkModeStateChanged

    }//GEN-LAST:event_jCheckBoxMenuItemDarkModeStateChanged

    private void jCheckBoxMenuItemDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemDarkModeActionPerformed

    }//GEN-LAST:event_jCheckBoxMenuItemDarkModeActionPerformed

    private void jCheckBoxMenuItemDarkModeİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemDarkModeİtemStateChanged
        if (jCheckBoxMenuItemDarkMode.isSelected()) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatDarkLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    jCheckBoxMenuItemDarkMode.setText("Açık Mod");
                    jCheckBoxMenuItemDarkMode.setSelected(true);
                }
            });
        } else {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatIntelliJLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                    jCheckBoxMenuItemDarkMode.setText("Karanlık Mod");
                    jCheckBoxMenuItemDarkMode.setSelected(false);
                }
            });
        }
    }//GEN-LAST:event_jCheckBoxMenuItemDarkModeİtemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int cevap = JOptionPane.showConfirmDialog(null, "Çıkmak İstediğinizden Emin Misiniz?", "Çıkış Yap!", JOptionPane.YES_NO_OPTION, 2);

        if (cevap == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAboutActionPerformed

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(FrmOturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOturum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonGiris;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemDarkMode;
    public javax.swing.JCheckBox jCheckBoxPassShowHide;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemCikis;
    public javax.swing.JPasswordField jPasswordFieldSifre;
    public javax.swing.JTextField jTextFieldKullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
