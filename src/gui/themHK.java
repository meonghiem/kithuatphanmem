/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.hokhau;
import model.nhankhau;

/**
 *
 * @author Admin
 */
public class themHK extends javax.swing.JFrame {

    /**
     * Creates new form themHK
     */
        private nhankhau s = new nhankhau();
        private hokhau s1 = new hokhau();
    public themHK() {
        initComponents();
    }
    public void close(){
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        txtDanToc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTonGiao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCMT = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMaHK = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMaNK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNam = new javax.swing.JRadioButton();
        btnNu = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoiSinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNgaylam = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Ton Giao");

        jLabel9.setText("CMND");

        jLabel10.setText("MaHK");

        jLabel11.setText("MaNK");

        jLabel2.setText("Gioi Tinh");

        genderGroup.add(btnNam);
        btnNam.setText("Nam");

        genderGroup.add(btnNu);
        btnNu.setText("Nu");

        jLabel13.setText("Que Quan");

        jLabel3.setText("Ngay Sinh");

        jLabel4.setText("Quoc Tich");

        jLabel5.setText("Noi Sinh");

        jLabel6.setText("Dia Chi");

        lbName.setText("Ho Va Ten");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel7.setText("Dan Toc");

        jLabel1.setText("Ngay lam");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("           Thong tin chu ho");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText("           Thong tin ho khau");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaHK, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgaylam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnNam)
                            .addComponent(btnNu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
            if(txtMaHK.getText().equals("")){
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
                txtMaHK.setBackground(Color.pink);
            }else{
                txtMaHK.setBackground(Color.white);
            }
            
            if(txtAddress.getText().equals("")){
                txtAddress.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtAddress.setBackground(Color.white);
            }
            
            if(txtCMT.getText().equals("")){
                txtCMT.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtCMT.setBackground(Color.white);
            }
            
            if(txtDanToc.getText().equals("")){
                txtDanToc.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtDanToc.setBackground(Color.white);
            }
            
            if(txtTonGiao.getText().equals("")){
                txtTonGiao.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtTonGiao.setBackground(Color.white);
            }
            
            if(txtMaNK.getText().equals("")){
                txtMaNK.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtMaNK.setBackground(Color.white);
            }
            
            if(txtName.getText().equals("")){
                txtName.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtName.setBackground(Color.white);
            }
            
            if(txtNoiSinh.getText().equals("")){
                txtNoiSinh.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtNoiSinh.setBackground(Color.white);
            }
            
           
            
            if(txtQueQuan.getText().equals("")){
                txtQueQuan.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtQueQuan.setBackground(Color.white);
            }
            
            if(txtQuocTich.getText().equals("")){
                txtQuocTich.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtQuocTich.setBackground(Color.white);
            }
            
            if(txtNgaySinh.getText().equals("")){
                txtNgaySinh.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtNgaySinh.setBackground(Color.white);
            }
            
            if(txtNgaylam.getText().equals("")){
                txtNgaylam.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }else{
                txtNgaylam.setBackground(Color.white);
            }
            
            if(!btnNam.isSelected()&&!btnNu.isSelected()){
                btnNam.setBackground(Color.pink);
                btnNu.setBackground(Color.pink);
                sb.append("Id h??? kh???u kh??ng ???????c ????? tr???ng!\n");
            }
                       
            
           if(sb.length()>0){
               JOptionPane.showMessageDialog(this, "??i???n v??o c??c th??ng tin c???n thi???t! \n", "ERROR!", JOptionPane.ERROR_MESSAGE);
           }
           else{
            try {
                s.setMaNK(txtMaNK.getText());
                s.setName(txtName.getText());
                s.setDanToc(txtDanToc.getText());
                s.setAddress(txtAddress.getText());
//                s.setDanToc(txtDanToc.getText());
                s.setCMT(txtCMT.getText());
                s.setQheChuHo("chu ho");
                
                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                try {
                    s.setDOB(sdf.parse(txtNgaySinh.getText()));
                } catch (ParseException ex) {
                    Logger.getLogger(themHK.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(btnNam.isSelected())
                                        {
                                            s.setGioiTinh(btnNam.getText());
                                        }else{s.setGioiTinh(btnNu.getText());}  
                s.setMaHK(txtMaHK.getText());
//                s.setMaNK(txtMaNK.getText());
                s.setNoiSinh(txtNoiSinh.getText());
                s.setQueQuan(txtQueQuan.getText());
//                s.setQheChuHo(txtQheChuHo.getText());
                s.setQuocTich(txtQuocTich.getText());
                s.setTonGiao(txtTonGiao.getText());
                s.setState("null");
                s1.setMaHK(txtMaHK.getText());
                s1.setMaNKChuHo(txtMaNK.getText());
                s1.setCMNDChu(txtCMT.getText());
                s1.setAddress(txtAddress.getText());
                s1.setHoTenChu(txtName.getText());
                s1.setNgayLap(sdf.parse(txtNgaylam.getText()));
                if(btnNam.isSelected())
                                        {
                                            s1.setGioiTinhChu(btnNam.getText());
                                        }else{s1.setGioiTinhChu(btnNu.getText());}                
                
                
            } catch (ParseException ex) {
                Logger.getLogger(themHK.class.getName()).log(Level.SEVERE, null, ex);
            }
               mainForm.takein4them(s, s1);
               
                        close();
                        
           }
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtAddress.setText("");
        txtCMT.setText("");
        txtDanToc.setText("");
        txtMaHK.setText("");
        txtMaNK.setText("");
        txtName.setText("");
        txtNgaySinh.setText("");
        txtNgaylam.setText("");
        txtNoiSinh.setText("");
        txtTonGiao.setText("");
        
        txtQueQuan.setText("");
        txtQuocTich.setText("");
        btnNam.setSelected(false);
                btnNu.setSelected(false);

                
    }//GEN-LAST:event_jButton2ActionPerformed

    public nhankhau getS() {
        return s;
    }

    public hokhau getS1() {
        return s1;
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
            java.util.logging.Logger.getLogger(themHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themHK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new themHK().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnNam;
    private javax.swing.JRadioButton btnNu;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCMT;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtMaHK;
    private javax.swing.JTextField txtMaNK;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaylam;
    private javax.swing.JTextField txtNoiSinh;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtTonGiao;
    // End of variables declaration//GEN-END:variables
}
