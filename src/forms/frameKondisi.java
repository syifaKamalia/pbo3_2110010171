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
public class frameKondisi extends javax.swing.JFrame {
    
    koneksi obj;
    
    public DefaultTableModel modelTabelKondisi;
    /**
     * Creates new form frameKondisi
     */
    public frameKondisi() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        obj = new koneksi();
        modelTabelKondisi = new DefaultTableModel();
        tabelKondisi.setModel(modelTabelKondisi);
        modelTabelKondisi.addColumn("ID KONDISI");
        modelTabelKondisi.addColumn("KONDISI");
        tampilDataKondisi();
        
    }
    
    
    public void tampilDataKondisi() {
        try {
            modelTabelKondisi.getDataVector().removeAllElements();
            modelTabelKondisi.fireTableDataChanged();
            
            PreparedStatement query = obj.konek.prepareStatement("SELECT * FROM kondisi");
            ResultSet data = query.executeQuery();
            while (data.next()) {                
                Object[] line = new Object[5];
                line[0] = data.getString("id_kondisi");
                line[1] = data.getString("kondisi");
                modelTabelKondisi.addRow(line);   
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

        jLabel1 = new javax.swing.JLabel();
        txtIdKondisi = new javax.swing.JTextField();
        txtKondisi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKondisi = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id Kondisi");

        jLabel2.setText("Kondisi");

        jButton1.setText("Simpan Statment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelKondisi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKondisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKondisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKondisi);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        try {
           if (txtIdKondisi.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Pengetahuan belum di isi");
               txtIdKondisi.requestFocus();
           } else if (txtKondisi.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Penyakit belum diisi");
               txtKondisi.requestFocus();
           } else {
               String sql = "insert into kondisi value('"+txtIdKondisi.getText()+"','"+txtKondisi.getText()+"')";
               obj.konek.createStatement().execute(sql);
               JOptionPane.showMessageDialog(this, "data berhasil disimpan");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
           if (txtIdKondisi.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "ID Kondisi belum di isi");
               txtIdKondisi.requestFocus();
           } else if (txtKondisi.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Kondisi belum diisi");
               txtKondisi.requestFocus();
           } else {
               String sqlCari = "SELECT * FROM kondisi WHERE id_kondisi ='"+txtIdKondisi.getText()+"'";
               ResultSet cari = obj.konek.createStatement().executeQuery(sqlCari);
               if (cari.next()){
                    JOptionPane.showMessageDialog(this, "ID Kondisi Sudah Terdaftar");
                         txtKondisi.setText(cari.getString(2));
               } else {
                    String sql = "INSERT INTO kondisi VALUE(?, ?)";
                    PreparedStatement simpan = obj.konek.prepareStatement(sql);
                    simpan.setString(1, txtIdKondisi.getText());
                    simpan.setString(2, txtKondisi.getText());
                    simpan.executeUpdate();
                    tampilDataKondisi();
                    
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
               }
         
               
               
               JOptionPane.showMessageDialog(this, "data berhasil disimpan");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelKondisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKondisiMouseClicked
        // TODO add your handling code here:
        int baris = tabelKondisi.getSelectedRow();
        String id_kondisi = tabelKondisi.getValueAt(baris, 0).toString();
        String kondisi = tabelKondisi.getValueAt(baris, 1).toString();
        txtIdKondisi.setText(id_kondisi);
        txtKondisi.setText(kondisi);
    }//GEN-LAST:event_tabelKondisiMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:        
        try {
            if (
                    (txtIdKondisi.getText().isEmpty()) &&
                    (txtKondisi.getText().isEmpty()) 
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "UPDATE kondisi SET kondisi=?  WHERE id_kondisi=?";
                PreparedStatement ubah = obj.konek.prepareStatement(sql);
                ubah.setString(1, txtKondisi.getText());
                ubah.setString(2, txtIdKondisi.getText());
                ubah.executeUpdate();
                tampilDataKondisi();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         try {
            if (
                    (txtIdKondisi.getText().isEmpty()) &&
                    (txtKondisi.getText().isEmpty())  
               ) {
                JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
            } else {
                String sql= "DELETE FROM kondisi WHERE id_kondisi=?";
                PreparedStatement hapus = obj.konek.prepareStatement(sql);
                hapus.setString(1, txtIdKondisi.getText());
                hapus.executeUpdate();
                tampilDataKondisi();
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
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKondisi().setVisible(true);
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
    private javax.swing.JTable tabelKondisi;
    private javax.swing.JTextField txtIdKondisi;
    private javax.swing.JTextField txtKondisi;
    // End of variables declaration//GEN-END:variables
}
