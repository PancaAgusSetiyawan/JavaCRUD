/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * framKaryawan.java
 *
 * Created on Dec 31, 2013, 7:48:35 PM
 */
package lat1;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


/**
 *
 * @author asus
 */
public class framKaryawan extends javax.swing.JFrame {

    public Connection conn;
    public Statement stat;
    
    public void koneksi(){
        try{
//             Class.forName("com.mysql.jdbc.Driver");
//        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javapespus","root","");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java","root","");
            stat = conn.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
            System.out.println(e.getMessage());
        }   
    }
    
    public void kosong(){
        txtKd_kary.setText("");
        txtNm_kary.setText("");
        txtBagian.setText("");
    }
    
    public void aktif (){
        txtKd_kary.setEnabled(true);
        txtNm_kary.setEnabled(true);
        txtBagian.setEnabled(true);
    }
    
    public void nonAktif(){
        txtKd_kary.setEnabled(false);
        txtNm_kary.setEnabled(false);
        txtBagian.setEnabled(false);
    }
    
    public void tampil_data(){
        DefaultTableModel tabelnya =  new DefaultTableModel();
        tabelnya.addColumn("Kode Karyawan");
        tabelnya.addColumn("Nama Karyawan");
        tabelnya.addColumn("Bagian");
        
        try{
            koneksi();
            String sql = "SELECT * FROM tb_karyawan";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                tabelnya.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
            });
            } 
            jTable1.setModel(tabelnya);                            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ada Kesalahan dalam Menampilkan data");
        }
        
    }
    /** Creates new form framKaryawan */
    public framKaryawan() {
        initComponents();
        setLocationRelativeTo(null);
        tampil_data();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKd_kary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNm_kary = new javax.swing.JTextField();
        txtBagian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Karyawan");

        jLabel2.setText("Nama Karyawan");

        jLabel3.setText("Bagian");

        jButton1.setText("Add");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Close");

        jButton6.setText("Cancel");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBagian, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNm_kary, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKd_kary, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKd_kary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNm_kary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBagian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            
            try{
               koneksi();
               String sql = "Update tb_karyawan SET nm_kary = '" + txtNm_kary.getText() +"','" + txtBagian.getText() +"' Where kd_kary = '" + txtKd_kary.getText() + "'";
               stat.executeUpdate(sql);
               conn.close();
               tampil_data();
               kosong();
               JOptionPane.showMessageDialog(null, "Update Sukses");
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Update Gagal");
        }
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if ((txtKd_kary.getText().equals(""))||(txtNm_kary.getText().equals(""))||(txtBagian.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Data Harus Lengkap");
        }else{
            try{
                koneksi();
                String sql = "Select kd_kary FROM tb_karyawan WHERE kd_kary = '" + txtKd_kary.getText() + "'";
                ResultSet rs = stat.executeQuery(sql);
                
                if (rs.next()){
                    JOptionPane.showMessageDialog(null,"Kode " + txtKd_kary.getText() + "karyawan sudah ada");
                }else{
                    String sqlSave = "Insert Into Tb_karyawan (kd_kary, nm_kary, Bagian) VALUES ('" + txtKd_kary.getText() + "', '" + txtNm_kary.getText() + "', '" + txtBagian.getText() + "')";
                    stat.executeUpdate(sqlSave);
                    conn.close();
                    tampil_data();
                    kosong();
                    JOptionPane.showMessageDialog(null,"Data Tersimpan");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal Disimpan");
            }
        }
                                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int pesan = JOptionPane.showConfirmDialog(null,"Data Akan dihapus?","Info",JOptionPane.YES_NO_OPTION);
        if (pesan == 0){
            if (txtKd_kary.getText().equals("")|| (txtNm_kary.getText().equals(""))|| (txtBagian.getText().equals(""))){
               JOptionPane.showMessageDialog(null,"Data Harus Lengkap");
            }else{
                try{
                    koneksi();
                    String sql = "DELETE FROM tb_karyawan WHERE kd_kary = '" + txtKd_kary.getText()+ "'";
                    stat.executeUpdate(sql);
                    conn.close();
                    JOptionPane.showMessageDialog(null,"Data Telah Dihapus");
                    kosong();
                    tampil_data();
                }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Gagal Menghapus data");                 
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int notabel = jTable1.getSelectedRow();
        txtKd_kary.setText(jTable1.getValueAt(notabel, 0).toString());
        txtNm_kary.setText(jTable1.getValueAt(notabel, 1).toString());
        txtBagian.setText(jTable1.getValueAt(notabel, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new framKaryawan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBagian;
    private javax.swing.JTextField txtKd_kary;
    private javax.swing.JTextField txtNm_kary;
    // End of variables declaration//GEN-END:variables
}
