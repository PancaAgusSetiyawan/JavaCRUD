/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fram1.java
 *
 * Created on Dec 31, 2013, 6:48:53 PM
 */
package lat1;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author asus
 */
public class fram1 extends javax.swing.JInternalFrame {

    public Connection conn;
    public Statement stat;
    
    public void konek(){
        try{
            Class.forName("com.jdbc.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost","root","");
            stat = conn.createStatement();                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
            
    }
    
    
    /** Creates new form fram1 */
    public fram1() {
        initComponents();
        konek();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
