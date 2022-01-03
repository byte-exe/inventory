/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorysoftware.LogIn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yaseen Ameer
 */
public class barang_masuk extends javax.swing.JFrame {
 
    private String tgl;

    /**
     * Creates new form NewSignin
     */
    public barang_masuk() {
        
        initComponents();
        koneksi_database();
        kosongkan_text();
        AutoNumber();
        tampil_combo_supplier();
        tampil_data();
        view_barang("SELECT * FROM barang_masuk");
        this.setLocationRelativeTo(null);
 
         
        
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
        jLabel_inven5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        btn_exit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        cmb_cari = new javax.swing.JComboBox<>();
        btn_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        nama_barang = new javax.swing.JTextField();
        kode_barang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menu1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        kode_supplier = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 150, 0));

        jLabel_inven5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven5.setForeground(new java.awt.Color(153, 204, 0));
        jLabel_inven5.setText("Input Data Barang Masuk");
        jPanel1.add(jLabel_inven5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 490, 50));

        jScrollPane1.setForeground(new java.awt.Color(103, 170, 22));

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_barang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1130, 260));

        txtcari.setForeground(new java.awt.Color(153, 204, 0));
        txtcari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcariCaretUpdate(evt);
            }
        });
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 310, 30));

        btn_exit.setForeground(new java.awt.Color(153, 204, 0));
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 100, 30));

        btn_delete.setForeground(new java.awt.Color(153, 204, 0));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 100, 30));

        btn_update.setForeground(new java.awt.Color(153, 204, 0));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, 30));

        cmb_cari.setForeground(new java.awt.Color(153, 204, 0));
        cmb_cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Barang", "Nama Barang" }));
        cmb_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cariActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 200, 30));

        btn_cancel.setForeground(new java.awt.Color(153, 204, 0));
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setText("Cari Berdasarkan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, 30));

        btn_save.setForeground(new java.awt.Color(153, 204, 0));
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        nama_barang.setForeground(new java.awt.Color(153, 204, 0));
        nama_barang.setText("Nama Barang");
        jPanel1.add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 310, 30));

        kode_barang.setForeground(new java.awt.Color(153, 204, 0));
        kode_barang.setText("Kode barang");
        kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_barangActionPerformed(evt);
            }
        });
        kode_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kode_barangKeyPressed(evt);
            }
        });
        jPanel1.add(kode_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("Kode Barang");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 204, 0));
        jLabel4.setText("Nama Barang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 30));

        menu1.setBackground(new java.awt.Color(153, 0, 0));
        menu1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        menu1.setForeground(new java.awt.Color(21, 25, 28));
        menu1.setText("Menu");
        menu1.setBorder(null);
        menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.setFocusPainted(false);
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 60, 30));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jButton11.setToolTipText("Close");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setRequestFocusEnabled(false);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jButton11.setVerifyInputWhenFocusTarget(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 40, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 0));
        jLabel6.setText("Jumlah Masuk");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, 30));

        jumlah.setForeground(new java.awt.Color(153, 204, 0));
        jumlah.setText("jumlah");
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        jPanel1.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 350, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 0));
        jLabel7.setText("Tanggal Masuk");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 204, 0));
        jLabel8.setText("Kode Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 30));

        supplier.setForeground(new java.awt.Color(153, 204, 0));
        supplier.setText("Supplier");
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        jPanel1.add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 260, 30));

        kode_supplier.setForeground(new java.awt.Color(153, 204, 0));
        kode_supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Pilih Kode Supplier==" }));
        kode_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_supplierActionPerformed(evt);
            }
        });
        jPanel1.add(kode_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 170, 30));

        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcariCaretUpdate
        String kategori = cmb_cari.getSelectedItem().toString();
        String vkategori;
        if(kategori=="Kode Barang"){
            vkategori ="kode_barang";
        }else if(kategori=="Nama Barang"){
            vkategori ="nama_barang";
        }else{
            vkategori ="kode_barang";
        }
        view_barang ("SELECT * FROM barang_masuk WHERE "+vkategori+" LIKE '%"+txtcari.getText()+"%' ");
    }//GEN-LAST:event_txtcariCaretUpdate

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            sql = "DELETE FROM barang_masuk WHERE kode_barang='"+kode_barang.getText()+"' ";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Terhapus...!");
            kosongkan_text();
            AutoNumber();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal...!"+e);
        }

        if(kode_barang.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Maaf, Kode Barang Tolong Di Isi !",
                "Informasi Penting",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                sql = "delete FROM barang_masuk where kode_barang='"+kode_barang.getText()+"'";
                stat=con.createStatement();
                stat.execute(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Sudah Dihapus !");
                stat.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal !"+e);
            }
            kosongkan_text();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            sql = "UPDATE barang_masuk SET jumlah='"+jumlah.getText()+
            "' WHERE kode_barang='" + kode_barang.getText()+"'";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Sukses...!");
            kosongkan_text();
            AutoNumber();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal...!"+e);
        }
        view_barang("SELECT * FROM barang_masuk");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void cmb_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_cariActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        kosongkan_text();
        AutoNumber();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            sql = "INSERT INTO barang_masuk VALUES ('"+kode_barang.getText()+
            "','"+supplier.getText()+
            "','"+nama_barang.getText()+
            "','"+tgl+
            "','"+jumlah.getText()+
           
            "')";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Tersimpan...");
            kosongkan_text();
            AutoNumber();
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal..."+e);
        }

        if(kode_barang.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Maaf, Kode Barang Tolong Di Isi !",
                "Informasi Penting",JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                sql = "update barang_masuk set nama_barang='"+nama_barang.getText()+
                "' where kode_barang='"+kode_barang.getText()+"'";
                stat=con.createStatement();
                stat.execute(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Sudah Diupdate !");
                stat.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal Diupdate !"+e);
            }
            kosongkan_text();
        }
     view_barang("SELECT * FROM barang_masuk");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void kode_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_barangActionPerformed
     
    }//GEN-LAST:event_kode_barangActionPerformed

    private void kode_barangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_barangKeyPressed
       
    }//GEN-LAST:event_kode_barangKeyPressed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        menu fa = new menu();
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierActionPerformed

    private void kode_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_supplierActionPerformed
        tampil_data_supplier();
    }//GEN-LAST:event_kode_supplierActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        if(tanggal.getDate()!=null){
            SimpleDateFormat format_tanggal = new  SimpleDateFormat("yyyy-MM-dd");
            tgl = format_tanggal.format(tanggal.getDate());
      }
    }//GEN-LAST:event_tanggalPropertyChange

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
            java.util.logging.Logger.getLogger(barang_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang_masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new barang_masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_cari;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_inven5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kode_barang;
    private javax.swing.JComboBox<String> kode_supplier;
    private javax.swing.JButton menu1;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JTextField supplier;
    private javax.swing.JTable tabel_barang;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtcari;
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

private void kosongkan_text() {  
nama_barang.setText("");
jumlah.setText("");
supplier.setText("");
kode_barang.requestFocus();
}

private void AutoNumber(){
try {
sql  = "SELECT MAX(RIGHT(kode_barang,4)) AS no_auto FROM barang_masuk";
stat = con.createStatement();
rs   = stat.executeQuery(sql);
if(rs.next()){
String no_auto, nol_plus;
int p;
no_auto = Integer.toString(rs.getInt(1)+1);
p = no_auto.length();
nol_plus = "";
for(int i=1;i<=4-p;i++){
nol_plus = nol_plus + "0";    
}
kode_barang.setText("BM"+nol_plus+no_auto);
}
} catch (Exception e) {
    kode_barang.setText("BM0001");    
}          
}

private void tampil_data(){
try {
    sql  = "SELECT * FROM barang_masuk WHERE kode_barang='"+kode_barang.getText()+"'";
    stat = con.createStatement();
    rs   = stat.executeQuery(sql);
    if(rs.next()){
    nama_barang.setText(rs.getString("nama_barang"));
    
    btn_update.setEnabled(true);
    btn_delete.setEnabled(true);
    btn_save.setEnabled(false);
    } else{
    kosongkan_text();
    }
    rs.close();
    stat.close();
    }
catch (Exception e) {
}
}


private void view_barang (String sql){
Object[] header = {"Kode Barang"," Supplier", "Nama Barang", "Tanggal Masuk","Jumlah"};
DefaultTableModel tabel = new DefaultTableModel(null, header);
tabel_barang.setModel(tabel);
try {
  stat = con.createStatement();
  rs = stat.executeQuery(sql);
 
  while (rs.next()){
  String[] Data = {
      
      rs.getString("kode_barang"),
      rs.getString("supplier"),
      rs.getString("nama_barang"),
      rs.getString("tgl_masuk"),
      rs.getString("jumlah"),

  };  
  tabel.addRow(Data);
 
  }
 
  tabel_barang.getColumnModel().getColumn(0).setPreferredWidth(50);
  tabel_barang.getColumnModel().getColumn(1).setPreferredWidth(200);
  tabel_barang.getColumnModel().getColumn(2).setPreferredWidth(200);
  tabel_barang.getColumnModel().getColumn(3).setPreferredWidth(200);
} catch (Exception e) {
  System.err.println (e);
}
}

private void tampil_combo_supplier(){
    try {
        Statement stat = con.createStatement();
        String sql = "select kode_supplier from supplier order by kode_supplier asc";
        ResultSet res = stat.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
            
            kode_supplier.addItem((String) ob[0]);
        }
        res.close();
        stat.close();
    } catch (Exception e) {
    }
}

private void tampil_data_supplier(){
    try {
        Statement stat = con.createStatement();
        String sql = "select nama_supplier from supplier where kode_supplier='"+kode_supplier.getSelectedItem()+"'";
        ResultSet res = stat.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
           
            supplier.setText((String) ob[0]);
            
            
        }
        res.close();
        stat.close();
    } catch (Exception e) {
    }
}
}
