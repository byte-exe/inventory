/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorysoftware.LogIn;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Yaseen Ameer
 */
public class menu extends javax.swing.JFrame {
    JasperReport jasperReport;
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    
    Map<String, Object> param = new HashMap<String, Object>();


    /**
     * Creates new form NewSignin
     */
    public menu() {
        initComponents();
        koneksi_database();
        this.setLocationRelativeTo(null);
      
         try {
          
              UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        
        }
        
        catch (Exception ex) {
            System.err.println(ex);
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button4 = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        jLabel_inven4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_inven5 = new javax.swing.JLabel();
        button5 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        jLabel_inven6 = new javax.swing.JLabel();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button10 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel_inven3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jPanel3.setBackground(new java.awt.Color(31, 36, 42));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 0, 620));

        jPanel4.setBackground(new java.awt.Color(102, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setBackground(new java.awt.Color(153, 204, 0));
        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setLabel("Input Data Customer");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel4.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 460, 70));

        button4.setBackground(new java.awt.Color(153, 204, 0));
        button4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button4.setLabel("Input Data Suplier");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel4.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 470, 70));

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_inven4.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_inven4.setText("Input Data");
        jPanel5.add(jLabel_inven4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 210, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, 50));

        jPanel6.setBackground(new java.awt.Color(204, 204, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_inven5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_inven5.setText("Laporan");
        jPanel6.add(jLabel_inven5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 210, 50));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 960, 50));

        button5.setBackground(new java.awt.Color(153, 204, 0));
        button5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button5.setLabel("Proses Barang Masuk");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel4.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 470, 70));

        button2.setBackground(new java.awt.Color(153, 204, 0));
        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setLabel("Persediaan Barang");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel4.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 940, 70));

        button3.setBackground(new java.awt.Color(153, 204, 0));
        button3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button3.setLabel("Proses Barang Keluar");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel4.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 460, 70));

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_inven6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_inven6.setText("Transaksi");
        jPanel7.add(jLabel_inven6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 210, 50));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 960, 50));

        button6.setBackground(new java.awt.Color(153, 204, 0));
        button6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button6.setLabel("Barang Keluar");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel4.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 460, 70));

        button7.setBackground(new java.awt.Color(153, 204, 0));
        button7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button7.setLabel("Barang Masuk");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel4.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 470, 70));

        button8.setBackground(new java.awt.Color(153, 204, 0));
        button8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button8.setLabel("Supplier");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel4.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 470, 70));

        button10.setBackground(new java.awt.Color(153, 204, 0));
        button10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button10.setLabel("Customer");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        jPanel4.add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 460, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 670));

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_inven3.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_inven3.setText("MENU");
        jPanel2.add(jLabel_inven3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        try{
            File file = new File("src/inventorysoftware/LogIn/laporan_barang_masuk.jrxml");

            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, con);
            JasperViewer.viewReport(jasperPrint, false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        try{
            File file = new File("src/inventorysoftware/LogIn/laporan_barang_keluar.jrxml");

            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, con);
            JasperViewer.viewReport(jasperPrint, false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        barang_keluar fa = new barang_keluar();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        persediaan fa = new persediaan();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        barang_masuk fa = new barang_masuk();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        data_suplier fa = new data_suplier();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        data_customer fa = new data_customer();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
         try{
            File file = new File("src/inventorysoftware/LogIn/supplier.jrxml");

            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, con);
            JasperViewer.viewReport(jasperPrint, false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
         try{
            File file = new File("src/inventorysoftware/LogIn/customer.jrxml");

            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, con);
            JasperViewer.viewReport(jasperPrint, false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_button10ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private javax.swing.JLabel jLabel_inven3;
    private javax.swing.JLabel jLabel_inven4;
    private javax.swing.JLabel jLabel_inven5;
    private javax.swing.JLabel jLabel_inven6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

private Connection con;
private Statement stat;
private ResultSet rs;
private String sql;

private void koneksi_database(){
try {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Ditemukan...");
    try {
        String url = "jdbc:mysql://localhost:3306/inventory?user=root&password=";
        con = DriverManager.getConnection(url);
        System.out.println("Terkoneksi...");
    } catch (SQLException e){
        System.err.println("Tidak Terkoneksi...");
    }
} catch (ClassNotFoundException e) {
    System.err.println("Driver Tidak Ada...");
}
}


}