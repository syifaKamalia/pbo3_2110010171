/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import database.koneksi;
import javax.swing.JOptionPane;
//prepare statement
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class frameKategori extends javax.swing.JFrame {
    
    
    koneksi obj;  
    
    public DefaultTableModel modelTabelKategori;

    /**
     * Creates new form frameKategori
     */
    public frameKategori() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        obj = new koneksi();
        modelTabelKategori = new DefaultTableModel();
        tabelKategori.setModel(modelTabelKategori);
        modelTabelKategori.addColumn("KODE KATEGORI");
        modelTabelKategori.addColumn("KATEGORI");
        tampilDataKategori();
    }
    
    
    public void tampilDataKategori() {
        try {
            modelTabelKategori.getDataVector().removeAllElements();
            modelTabelKategori.fireTableDataChanged();
            
            PreparedStatement query = obj.konek.prepareStatement("SELECT * FROM kategori");
            ResultSet data = query.executeQuery();
            while (data.next()) {                
                Object[] line = new Object[5];
                line[0] = data.getString("kd_kategori");
                line[1] = data.getString("kategori");
                modelTabelKategori.addRow(line);   
            }
            query.close();
            data.close();
        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtKdKategori = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKategori = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kode Kategori");

        jLabel2.setText("Kategori");

        jButton1.setText("Simpan Statement");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKategoriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKategori);

        jButton2.setText("Simpan Prepare Statement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubah Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        try {
           if (txtKdKategori.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Kode Kategori belum di isi");
               txtKdKategori.requestFocus();
           } else if (txtKategori.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Kategori belum diisi");
               txtKategori.requestFocus();
           } else {
               String sql = "insert into kategori value('"+txtKdKategori.getText()+"','"+txtKategori.getText()+"')";
               obj.konek.createStatement().execute(sql);
               JOptionPane.showMessageDialog(this, "data berhasil disimpan");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
            if (
                    (txtKdKategori.getText().isEmpty()) &&
                    (txtKategori.getText().isEmpty()) 
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "UPDATE kategori SET kategori=?  WHERE kd_kategori=?";
                PreparedStatement ubah = obj.konek.prepareStatement(sql);
                ubah.setString(1, txtKategori.getText());
                ubah.setString(2, txtKdKategori.getText());
                ubah.executeUpdate();
                tampilDataKategori();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
           if (txtKdKategori.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Kode Kategori belum di isi");
               txtKdKategori.requestFocus();
           } else if (txtKategori.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Kode penyakit belum diisi");
               txtKategori.requestFocus();
           } else {
               String sqlCari = "SELECT * FROM kategori WHERE kd_kategori ='"+txtKdKategori.getText()+"'";
               ResultSet cari = obj.konek.createStatement().executeQuery(sqlCari);
               if (cari.next()){
                    JOptionPane.showMessageDialog(this, "Kode Kategori Sudah Terdaftar");
                         txtKategori.setText(cari.getString(2));
               } else {
                    String sql = "INSERT INTO kategori VALUE(?, ?)";
                    PreparedStatement simpan = obj.konek.prepareStatement(sql);
                    simpan.setString(1, txtKdKategori.getText());
                    simpan.setString(2, txtKategori.getText());
                    simpan.executeUpdate();
                    tampilDataKategori();
                    
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
               }
         
               
               
               JOptionPane.showMessageDialog(this, "data berhasil disimpan");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKategoriMouseClicked
        // TODO add your handling code here:
        int baris = tabelKategori.getSelectedRow();
        String kd_kategori = tabelKategori.getValueAt(baris, 0).toString();
        String kategori = tabelKategori.getValueAt(baris, 1).toString();
        txtKdKategori.setText(kd_kategori);
        txtKategori.setText(kategori);
    }//GEN-LAST:event_tabelKategoriMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         try {
            if (
                    (txtKdKategori.getText().isEmpty()) &&
                    (txtKategori.getText().isEmpty()) 
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "DELETE FROM kategori WHERE kd_kategori=?";
                PreparedStatement hapus = obj.konek.prepareStatement(sql);
                hapus.setString(1, txtKdKategori.getText());
                hapus.executeUpdate();
                tampilDataKategori();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frameKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelKategori;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtKdKategori;
    // End of variables declaration//GEN-END:variables
}
