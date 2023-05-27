
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnection;

/**
 *
 * @author MustafaAktas
 */
public class FrmMenu extends javax.swing.JFrame {

    Connection conn = new DBConnection().CreateConnection();
    ResultSet rs = null;
    ResultSet rs2 = null;
    CallableStatement proc = null;
    PreparedStatement pst = null;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        Istatistikler();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonKitapAlisVeris = new javax.swing.JButton();
        jButtonKitapIslemleri = new javax.swing.JButton();
        jButtonUyeIslemleri = new javax.swing.JButton();
        jButtonKategoriIslemleri = new javax.swing.JButton();
        jButtonListe = new javax.swing.JButton();
        jButtonCikis = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelTopKitap = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTopUye = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemKitapAlisVeris = new javax.swing.JMenuItem();
        jMenuItemKitapIslemleri = new javax.swing.JMenuItem();
        jMenuUyeIslmeleri = new javax.swing.JMenu();
        jMenuKategoriIslemleri = new javax.swing.JMenu();
        jMenuListe = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItemDarkMode = new javax.swing.JCheckBoxMenuItem();
        jMenuItemCikis = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Takip Otomasyonu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Kütüphane Takip Programı");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel2.setText("Lütfen İşleminizi Seçiniz!");

        jButtonKitapAlisVeris.setText("Kitap Alış-Veriş");
        jButtonKitapAlisVeris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKitapAlisVerisActionPerformed(evt);
            }
        });

        jButtonKitapIslemleri.setText("Kitap İşlemleri");
        jButtonKitapIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKitapIslemleriActionPerformed(evt);
            }
        });

        jButtonUyeIslemleri.setText("Üye İşlemleri");
        jButtonUyeIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUyeIslemleriActionPerformed(evt);
            }
        });

        jButtonKategoriIslemleri.setText("Kategori İşlemleri");
        jButtonKategoriIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKategoriIslemleriActionPerformed(evt);
            }
        });

        jButtonListe.setText("Listeler");
        jButtonListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListeActionPerformed(evt);
            }
        });

        jButtonCikis.setText("Çıkış Yap");
        jButtonCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCikisActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Toplam Kitap Sayısı:");

        jLabelTopKitap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelTopKitap.setText("0");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Toplam Üye Sayısı:");

        jLabelTopUye.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelTopUye.setText("0");

        jMenu1.setText("Kitap İşlemleri");

        jMenuItemKitapAlisVeris.setText("Kitap Alış-Veriş");
        jMenu1.add(jMenuItemKitapAlisVeris);

        jMenuItemKitapIslemleri.setText("Kitap İşlemleri");
        jMenu1.add(jMenuItemKitapIslemleri);

        jMenuBar1.add(jMenu1);

        jMenuUyeIslmeleri.setText("Üye İşlemleri");
        jMenuBar1.add(jMenuUyeIslmeleri);

        jMenuKategoriIslemleri.setText("Kategori İşlemleri");
        jMenuBar1.add(jMenuKategoriIslemleri);

        jMenuListe.setText("Listeler");
        jMenuBar1.add(jMenuListe);

        jMenuAbout.setText("Hakkımızda");
        jMenuBar1.add(jMenuAbout);

        jMenu5.setText("Ayarlar");

        jCheckBoxMenuItemDarkMode.setText("Karanlık Mod");
        jMenu5.add(jCheckBoxMenuItemDarkMode);

        jMenuItemCikis.setText("Çıkış");
        jMenu5.add(jMenuItemCikis);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonKitapAlisVeris, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonKitapIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonUyeIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonKategoriIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonListe, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTopKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTopUye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonKitapAlisVeris, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKitapIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUyeIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKategoriIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabelTopUye))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel3))
                        .addComponent(jLabelTopKitap)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCikisActionPerformed
        FrmOturum oturum = new FrmOturum();
        oturum.show();
        this.hide();
    }//GEN-LAST:event_jButtonCikisActionPerformed


    private void jButtonKitapAlisVerisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKitapAlisVerisActionPerformed
        FrmKitapOdunc kitapOdunc = new FrmKitapOdunc();
        kitapOdunc.show();
        this.hide();
    }//GEN-LAST:event_jButtonKitapAlisVerisActionPerformed

    private void jButtonKitapIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKitapIslemleriActionPerformed
        FrmKitapIslemleri kitapIslemleri = new FrmKitapIslemleri();
        kitapIslemleri.show();
        this.hide();
    }//GEN-LAST:event_jButtonKitapIslemleriActionPerformed

    private void jButtonUyeIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUyeIslemleriActionPerformed
        FrmUyeIslemleri uyeIslemleri = new FrmUyeIslemleri();
        uyeIslemleri.show();
        this.hide();
    }//GEN-LAST:event_jButtonUyeIslemleriActionPerformed

    private void jButtonKategoriIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKategoriIslemleriActionPerformed
        FrmKategoriIslemleri kategoriIslemleri = new FrmKategoriIslemleri();
        kategoriIslemleri.show();
        this.hide();
    }//GEN-LAST:event_jButtonKategoriIslemleriActionPerformed

    private void jButtonListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListeActionPerformed
        FrmListe liste = new FrmListe();
        liste.show();
        this.hide();
    }//GEN-LAST:event_jButtonListeActionPerformed

    public void Istatistikler() {
        try {
            String sql = "Select count(*) from Kitap";
            String sql2 = "select count(*) from Uye";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            pst = conn.prepareStatement(sql2);
            rs2 = pst.executeQuery();
            if (rs.next()) {
                jLabelTopKitap.setText(String.valueOf(rs.getInt(1)));
            }
            if (rs2.next()) {
                jLabelTopUye.setText(String.valueOf(rs2.getInt(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCikis;
    private javax.swing.JButton jButtonKategoriIslemleri;
    private javax.swing.JButton jButtonKitapAlisVeris;
    private javax.swing.JButton jButtonKitapIslemleri;
    private javax.swing.JButton jButtonListe;
    private javax.swing.JButton jButtonUyeIslemleri;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemDarkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTopKitap;
    private javax.swing.JLabel jLabelTopUye;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCikis;
    private javax.swing.JMenuItem jMenuItemKitapAlisVeris;
    private javax.swing.JMenuItem jMenuItemKitapIslemleri;
    private javax.swing.JMenu jMenuKategoriIslemleri;
    private javax.swing.JMenu jMenuListe;
    private javax.swing.JMenu jMenuUyeIslmeleri;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
