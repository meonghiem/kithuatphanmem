    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package gui;
import model.baoCao;
import controller.DAO;
import java.awt.Color;
    import java.awt.Dimension;
import java.awt.HeadlessException;
    import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
    import java.text.DateFormat;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.logging.Level;
    import java.util.logging.Logger;
import javax.swing.JFrame;
    import javax.swing.JOptionPane;
    import javax.swing.JTable;
    import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
    import model.hokhau;
    import model.nhankhau;

    /**
     *
     * @author PC
     */
    public class mainForm extends javax.swing.JFrame {

        /**
         * Creates new form mainForm
         */
        static public String choosingid = "NULL";
        static public ArrayList<hokhau> listHK = new ArrayList<hokhau>();
        static private ArrayList<baoCao> listBaoCao= new ArrayList<baoCao>();
        static private DefaultTableModel tblModel1;
        static private DefaultTableModel tblModelHK = new DefaultTableModel();
        static private DefaultTableModel tblModelNK = new DefaultTableModel();
        
        public void initTableHK(){
            list = new DAO().getListNK();
            listHK = new DAO().getListHK();
            listBaoCao = new DAO().get_don();
            String[] columns = new String[]{"Ma HK", "Ten Chu ho", "Ma Chu ho", "Dia Chi"};
            tblModelHK.setColumnIdentifiers(columns);
            SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
//            try {
//                listHK.add(new hokhau("01", "12", "Thai BInh", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//                listHK.add(new hokhau("02", "13", "Thai BInh", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//                listHK.add(new hokhau("03", "14", "Nam Dinh", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//                listHK.add(new hokhau("04", "15", "Ha Noi", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//                listHK.add(new hokhau("05", "16", "Thai BInh", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//                listHK.add(new hokhau("06", "17", "Thai BInh", sdf.parse("10/11/2020"), "Nguyen Tuan Thuy", "1234", "nam", "null"));
//
//            } catch (ParseException ex) {
//                Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
//            }
            tblHokhau.setRowSelectionAllowed(true);
            tblHokhau.setModel(tblModelHK);
        }
        
        public void initTableNK(){
            String[] columns = new String[]{"Ma NK", "Ten nhan khau", "ID", "Quan he chu ho"};
            tblModelNK.setColumnIdentifiers(columns);
            tblThongtinNK.setRowSelectionAllowed(true);
            tblThongtinNK.setModel(tblModelNK);
        }
        
        static public void fillTableNK(String maHK){
            tblModelNK.setRowCount(0);
            for(nhankhau nk: list){
                if(nk.getMaHK().equals(maHK)){
                    tblModelNK.addRow(new String[]{nk.getMaNK(), nk.getName(), nk.getCMT(), nk.getQheChuHo()});
                }
            }
            tblModelNK.fireTableDataChanged();
        }
        
        static public void fillTableHK(){
            tblModelHK.setRowCount(0);
            
            for(hokhau hk: listHK){
                tblModelHK.addRow(new String[]{hk.getMaHK(), hk.getHoTenChu(), hk.getMaNKChuHo(), hk.getAddress()});
            }
            
            tblModelHK.fireTableDataChanged();
        }
        
        
        static public ArrayList<nhankhau> list= new ArrayList<nhankhau>();
        static public DefaultTableModel tblModel;
        public nhankhauManagementPanel mNhanKhauPanel;
        public mainForm() {
            initComponents();
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            initTable();
            initData();
            initTableHK();
            fillTableHK();
            initTableNK();
        }
        static public void fillTable(){
            tblModel.setRowCount(0);

            for(nhankhau nk: list){
                tblModel.addRow(new String[]{nk.getMaHK(),nk.getMaNK(),nk.getName(),nk.getCMT()});
            }
            tblModel.fireTableDataChanged();
        }

        private void fillTable1(){
    
            tblModel.setRowCount(0);
            if(txtFind.getText().length()==0){
                fillTable();
            }else{
                    for(nhankhau nk: list){
                    if(nk.getMaNK().equals(txtFind.getText()))
                    {
                        tblModel.addRow(new String[]{nk.getMaHK(),nk.getMaNK(),nk.getName(),nk.getCMT()});
                    }
                }
            }
            tblModel.fireTableDataChanged();
        }
        public void initData(){
            try{
                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
//                list.add(new nhankhau("1", "nghiem", "alo", "String CMT", sdf.parse("20/06/2001"), "04", "String gioiTinh", "String noiSinh", "String danToc", "String quocTich", "String queQuan", "String qheChuHo", "String state", "String tonGiao"));
//                list.add(new nhankhau("2", "thanh", "alo", "String CMT", sdf.parse("20/06/2001"), "04", "String gioiTinh", "String noiSinh", "String danToc", "String quocTich", "String queQuan", "String qheChuHo", "String state", "String tonGiao"));
//                list.add(new nhankhau("3", "thuy", "alo", "String CMT", sdf.parse("20/06/2001"), "03", "String gioiTinh", "String noiSinh", "String danToc", "String quocTich", "String queQuan", "String qheChuHo", "String state", "String tonGiao"));
//                list.add(new nhankhau("4", "trung", "alo", "String CMT", sdf.parse("20/06/2001"), "02", "String gioiTinh", "String noiSinh", "String danToc", "String quocTich", "String queQuan", "String qheChuHo", "String state", "String tonGiao"));
//                list.add(new nhankhau("5", "duong", "alo", "String CMT", sdf.parse("20/06/2001"), "01", "String gioiTinh", "String noiSinh", "String danToc", "String quocTich", "String queQuan", "String qheChuHo", "String state", "String tonGiao"));

            }catch(Exception e){

            }


        }

        public void initTable(){
            tblModel= new DefaultTableModel();
            String[] colums= new String[]{"MaHK","MaNK","Name","CMND"
        };
                    tblModel.setColumnIdentifiers(colums);
                    tblThongTin.setModel(tblModel);
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
        jButton5 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        Home = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnNam = new javax.swing.JRadioButton();
        btnNu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoiSinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        txtQheChuHo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        btnFind = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        show_validation_here = new javax.swing.JLabel();
        show_validation = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIDhokhau = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtChuName = new javax.swing.JTextField();
        txtChuID = new javax.swing.JTextField();
        txtChuCMND = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtChuState = new javax.swing.JTextField();
        btnChuNam = new javax.swing.JRadioButton();
        btnChuNu = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNgaylam = new javax.swing.JTextField();
        btnThemhokhau = new javax.swing.JToggleButton();
        btnTachhokhau = new javax.swing.JToggleButton();
        btnChuyenhokhau = new javax.swing.JButton();
        btnThaydoithongtin = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        btnFindHokhau = new javax.swing.JButton();
        btnResetHK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongtinNK = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHokhau = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Trang Chu");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1363, Short.MAX_VALUE)
        );

        Home.addTab("Thống kê", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1363, Short.MAX_VALUE)
        );

        Home.addTab("HeThong", jPanel1);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Quan Ly Nhan Khau");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbName.setText("Ho Va Ten");

        jLabel2.setText("Gioi Tinh");

        genderGroup.add(btnNam);
        btnNam.setText("Nam");

        genderGroup.add(btnNu);
        btnNu.setText("Nu");

        jLabel3.setText("Ngay Sinh");

        jLabel4.setText("Quoc Tich");

        jLabel5.setText("Noi Sinh");

        jLabel6.setText("Dia Chi");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel7.setText("Dan Toc");

        jLabel8.setText("Ton Giao");

        jLabel9.setText("CMND");

        jLabel10.setText("MaHK");

        jLabel11.setText("MaNK");

        jLabel12.setText("QheChuHo");

        jLabel13.setText("Que Quan");

        jLabel14.setText("State");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETTE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSua.setText("CHANGE");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
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
        tblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThongTin);

        btnFind.setText("find with ID");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        show_validation.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbName)
                        .addGap(40, 40, 40)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQueQuan)
                                            .addComponent(txtAddress)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtMaHK, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(show_validation_here, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(show_validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(txtMaNK, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtQheChuHo))))))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(73, 73, 73)
                                                        .addComponent(jLabel17))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addComponent(jLabel4)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel8)
                                                .addGap(36, 36, 36)
                                                .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(53, 53, 53)
                                                .addComponent(txtCMT, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnNam)
                    .addComponent(btnNu))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMaNK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtQheChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(show_validation_here)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_validation)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSua)
                    .addComponent(btnReset)
                    .addComponent(btnFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(855, Short.MAX_VALUE))
        );

        Home.addTab("Quản lí nhân khẩu", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quan Ly Ho Khau");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setText("ID ho khau");

        txtIDhokhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDhokhauActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel6.setToolTipText("thong tin chu ho");

        jLabel18.setText("Ho va ten");

        jLabel19.setText("ma NK");

        jLabel20.setText("So CMND");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField2.setText("           Thong tin chu ho");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel21.setText("Gioi tinh");

        genderGroup.add(btnChuNam);
        btnChuNam.setText("nam");
        btnChuNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuNamActionPerformed(evt);
            }
        });

        genderGroup.add(btnChuNu);
        btnChuNu.setText("nu");
        btnChuNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuNuActionPerformed(evt);
            }
        });

        jLabel22.setText("State");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtChuID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtChuName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtChuCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtChuState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChuNu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuNam)
                    .addComponent(btnChuNu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtChuState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel23.setText("Dia chi");

        jLabel24.setText("Ngay lam");

        btnThemhokhau.setText("Them ho khau");
        btnThemhokhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemhokhauActionPerformed(evt);
            }
        });

        btnTachhokhau.setText("Tach Ho Khau");
        btnTachhokhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachhokhauActionPerformed(evt);
            }
        });

        btnChuyenhokhau.setText("Chuyen ho khau");
        btnChuyenhokhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenhokhauActionPerformed(evt);
            }
        });

        btnThaydoithongtin.setText("Cap nhat");
        btnThaydoithongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThaydoithongtinActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField9.setText("     Thong tin cac nhan khau");
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        btnFindHokhau.setText("Tim kiem");
        btnFindHokhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindHokhauActionPerformed(evt);
            }
        });

        btnResetHK.setText("Reset");
        btnResetHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetHKActionPerformed(evt);
            }
        });

        tblThongtinNK.setModel(new javax.swing.table.DefaultTableModel(
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
        tblThongtinNK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongtinNKMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongtinNK);

        tblHokhau.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHokhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHokhauMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHokhau);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDiachi))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNgaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 62, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemhokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnChuyenhokhau)
                        .addGap(151, 151, 151))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIDhokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindHokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(401, 401, 401))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTachhokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnThaydoithongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnResetHK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDhokhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindHokhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChuyenhokhau)
                            .addComponent(btnThemhokhau))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTachhokhau)
                            .addComponent(btnThaydoithongtin)
                            .addComponent(btnResetHK))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(854, 854, 854))
        );

        Home.addTab("Quản lí hộ khẩu", jPanel2);

        jLabel25.setText("Mã người đệ đơn");

        jLabel26.setText("Ngày đệ đơn");

        jLabel27.setText("ID Đơn");

        jLabel28.setText("Phân loại");

        jLabel29.setText("Nội dung");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jButton1.setText("Thêm đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa đơn");

        jButton3.setText("Reset");

        jButton4.setText("Tìm theo ID đơn");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã người đệ đơn", "Ngày đệ đơn", "ID đơn", "Phân loại", "Tình trạng"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jButton6.setText("Tìm theo trạng thái");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton2)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3)
                                .addGap(37, 37, 37)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home.addTab("Đơn Kiến Nghị", jPanel7);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("LogOut");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


        private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    //        if(btnFind.isSelected()){
    //            fillTable1();
    //        }
            fillTable();
        }//GEN-LAST:event_formWindowOpened

    private void tblHokhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHokhauMouseClicked
        int selectedrow = tblHokhau.getSelectedRow();
        if(selectedrow >= 0){
            String hokhauId = (String) tblHokhau.getValueAt(selectedrow, 0);
            for (hokhau hk: listHK){
                if(hokhauId.equals(hk.getMaHK())){
                    txtChuName.setText(hk.getHoTenChu());
                    txtIDhokhau.setText(hk.getMaHK());
                    txtChuID.setText(hk.getMaNKChuHo());
                    txtChuCMND.setText(hk.getCMNDChu());
                    txtChuState.setText(hk.getStateChu());
                    txtDiachi.setText(hk.getAddress());
                    DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
                    txtNgaylam.setText(dateFormat.format(hk.getNgayLap()));
                    if(hk.getGioiTinhChu().equals("nam")){
                        btnChuNam.setSelected(true);
                    }else{
                        btnChuNu.setSelected(true);
                    }
                    fillTableNK(hk.getMaHK());
                    break;
                }

            }
        }
    }//GEN-LAST:event_tblHokhauMouseClicked

    private void tblThongtinNKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongtinNKMouseClicked
        int selectedrow = tblThongtinNK.getSelectedRow();
        if(selectedrow >= 0){
            choosingid = (String) tblThongtinNK.getValueAt(selectedrow, 0);
        }
    }//GEN-LAST:event_tblThongtinNKMouseClicked

    private void btnResetHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetHKActionPerformed
        resetHK();
    }//GEN-LAST:event_btnResetHKActionPerformed

    private void btnFindHokhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindHokhauActionPerformed
        fillTableHK1();
    }//GEN-LAST:event_btnFindHokhauActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnThaydoithongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThaydoithongtinActionPerformed
        capnhapbuttonclick();
    }//GEN-LAST:event_btnThaydoithongtinActionPerformed

    private void btnChuyenhokhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenhokhauActionPerformed
        if(choosingid.equals("NULL")){
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn chuyển hộ khẩu cho nhân khẩu " + choosingid + "?\n", "Chú ý!", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        //       hokhau hk = new hokhau();
        for(nhankhau nk:list){
            if(nk.getMaNK().equals(choosingid)){

                chuyenhokhau secondbox = new chuyenhokhau();
                secondbox.setVisible(true);
                secondbox.pack();
                secondbox.setLocationRelativeTo(null);

                secondbox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                break;

            }
        }
        resetHK();
    }//GEN-LAST:event_btnChuyenhokhauActionPerformed

    private void btnTachhokhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachhokhauActionPerformed
        if(choosingid.equals("NULL")){
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn tách nhân khẩu " + choosingid + "?\n", "Chú ý!", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        //       hokhau hk = new hokhau();
        for(nhankhau nk:list){
            if(nk.getMaNK().equals(choosingid)){

                tachhokhau secondbox = new tachhokhau();
                secondbox.setVisible(true);
                secondbox.pack();
                secondbox.setLocationRelativeTo(null);
                //                  JOptionPane.showMessageDialog(null, "success!!!");
                secondbox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;

            }
        }
        resetHK();
    }//GEN-LAST:event_btnTachhokhauActionPerformed

    private void btnThemhokhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemhokhauActionPerformed
        btnThemHoKhauclick();
        resetHK();
    }//GEN-LAST:event_btnThemhokhauActionPerformed

    private void btnChuNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChuNuActionPerformed

    private void btnChuNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChuNamActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtIDhokhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDhokhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDhokhauActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        fillTable1();
    }//GEN-LAST:event_btnFindActionPerformed

    private void tblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinMouseClicked
        int selected= tblThongTin.getSelectedRow(); // trả về hàng thứ bao nhiêu
        System.out.println(selected);
        if(selected>=0){
            String MaNK= (String) tblModel.getValueAt(selected,1);
            for(nhankhau nk: list){
                if(nk.getMaNK().equals(MaNK)){
                    txtName.setText(nk.getName());
                    txtAddress.setText(nk.getAddress());
                    txtCMT.setText(nk.getCMT());
                    txtDanToc.setText(nk.getDanToc());
                    if(nk.getGioiTinh().equals("Nam")){
                        btnNam.setSelected(true);
                    }else{
                        btnNu.setSelected(true);
                    }
                    txtMaHK.setText(nk.getMaHK());
                    txtMaNK.setText(nk.getMaNK());
                    txtNoiSinh.setText(nk.getNoiSinh());
                    DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
                    txtNgaySinh.setText(dateFormat.format(nk.getDOB()));
                    txtQheChuHo.setText(nk.getQheChuHo());
                    txtQuocTich.setText(nk.getQuocTich());
                    txtTonGiao.setText(nk.getTonGiao());
                    txtState.setText(nk.getState());
                    txtQueQuan.setText(nk.getQueQuan());
                    return;
                }
            }
        }
    }//GEN-LAST:event_tblThongTinMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btnResetClick();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selected= tblThongTin.getSelectedRow();
        if(selected>=0){
            for(nhankhau nk: list){
                if(nk.getMaNK().equals(txtMaNK.getText())){
                    int choice=JOptionPane.showConfirmDialog(null, "Ban co chac chan muon update","warning",JOptionPane.YES_NO_OPTION);
                    if(choice == JOptionPane.YES_OPTION){
                        if( txtName.getText().length()!=0 &&
                            txtAddress.getText().length()!=0 &&
                            txtCMT.getText().length()!=0 &&
                            txtDanToc.getText().length()!=0 &&
                            txtMaNK.getText().length()!=0 &&
                            txtNgaySinh.getText().length()!=0 &&
                            txtNoiSinh.getText().length()!=0 &&
                            txtQueQuan.getText().length()!=0 &&
                            txtState.getText().length()!=0 &&
                            txtTonGiao.getText().length()!=0 &&
                            txtQuocTich.getText().length()!=0 &&
                            txtMaHK.getText().length()!=0 &&
                            txtQheChuHo.getText().length()!=0
                        ){
                            if(btnNam.isSelected())
                            {
                                nk.setGioiTinh(btnNam.getText());
                            }else if(btnNu.isSelected())
                            {
                                nk.setGioiTinh(btnNu.getText());
                            }else{
                                JOptionPane.showMessageDialog(null, "Nhap day du thong tin");
                                return;
                            }
                            new DAO().delete_NK(nk);
                            nk.setName(txtName.getText());
                            nk.setAddress(txtAddress.getText());
                            nk.setDanToc(txtDanToc.getText());
                            nk.setCMT(txtCMT.getText());
                            SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                            try {
                                nk.setDOB(sdf.parse(txtNgaySinh.getText()));
                            } catch (ParseException ex) {
                                Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            nk.setMaHK(txtMaHK.getText());
                            nk.setMaNK(txtMaNK.getText());
                            nk.setNoiSinh(txtNoiSinh.getText());
                            nk.setQueQuan(txtQueQuan.getText());
                            nk.setQheChuHo(txtQheChuHo.getText());
                            nk.setQuocTich(txtQuocTich.getText());
                            nk.setTonGiao(txtTonGiao.getText());
                            nk.setState(txtState.getText());
                            new DAO().add_NK(nk);
                            fillTable();
                            JOptionPane.showMessageDialog(null, "success");
                            btnResetClick();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnDeleteClick();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        btnAddClick();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
   
        private void btnDeleteClick(){
            int selected= tblThongTin.getSelectedRow(); // trả về hàng thứ bao nhiêu
            if(selected>=0){
                for(nhankhau nk : list){
                    if(nk.getMaNK().equals(txtMaNK.getText())){
                        int choice=JOptionPane.showConfirmDialog(null, "Ban co chac chan muon xoa","warning",JOptionPane.YES_NO_OPTION);
                        if(choice==JOptionPane.YES_OPTION){
                            new DAO().delete_NK(nk);
                            list.remove(nk);
                            fillTable();
                            JOptionPane.showMessageDialog(null, "deleted!!!");
                        }
                        btnResetClick();
                        return;
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "ban chua chon");
            }
        }        private void btnResetClick(){
            txtName.setText("");
            txtAddress.setText("");
            txtCMT.setText("");
            txtDanToc.setText("");
            btnNam.setSelected(false);
            btnNu.setSelected(false);
            txtNgaySinh.setText("");
            txtNoiSinh.setText("");
            txtQueQuan.setText("");
            txtTonGiao.setText("");
            txtMaNK.setText("");
            txtMaHK.setText("");
            txtState.setText("");
            txtQuocTich.setText("");
            txtQheChuHo.setText("");
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
                java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                new mainForm().setVisible(true);
            });
        }
        
    //Ho Khau
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Home;
    private javax.swing.JButton btnAdd;
    private javax.swing.JRadioButton btnChuNam;
    private javax.swing.JRadioButton btnChuNu;
    private javax.swing.JButton btnChuyenhokhau;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindHokhau;
    private javax.swing.JRadioButton btnNam;
    private javax.swing.JRadioButton btnNu;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetHK;
    private javax.swing.JButton btnSua;
    private javax.swing.JToggleButton btnTachhokhau;
    private javax.swing.JButton btnThaydoithongtin;
    private javax.swing.JToggleButton btnThemhokhau;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel show_validation;
    private javax.swing.JLabel show_validation_here;
    private static javax.swing.JTable tblHokhau;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTable tblThongtinNK;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCMT;
    private javax.swing.JTextField txtChuCMND;
    private javax.swing.JTextField txtChuID;
    private javax.swing.JTextField txtChuName;
    private javax.swing.JTextField txtChuState;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtIDhokhau;
    private javax.swing.JTextField txtMaHK;
    private javax.swing.JTextField txtMaNK;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaylam;
    private javax.swing.JTextField txtNoiSinh;
    private javax.swing.JTextField txtQheChuHo;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTonGiao;
    // End of variables declaration//GEN-END:variables

        private void btnAddClick() {
            nhankhau s = new nhankhau();
            try {
                show_validation.setText("");
                for(nhankhau nk: list){
                    if(nk.getMaNK().equals(txtMaNK.getText())){
                        show_validation.setText("Trung Ma NK");
                        return;
                    }
                }
                if(txtName.getText().length()!=0 ||
                        txtAddress.getText().length()!=0 ||
                        txtCMT.getText().length()!=0 &&
                        txtDanToc.getText().length()!=0 &&
                        txtMaNK.getText().length()!=0 &&
                        txtNgaySinh.getText().length()!=0 &&
                        txtNoiSinh.getText().length()!=0 &&
                        txtQueQuan.getText().length()!=0 &&
                        txtState.getText().length()!=0 &&
                        txtTonGiao.getText().length()!=0 &&
                        txtQuocTich.getText().length()!=0 &&
                        txtMaHK.getText().length()!=0 &&
                        txtQheChuHo.getText().length()!=0
                            ){
                        if(btnNam.isSelected())
                        {
                            s.setGioiTinh(btnNam.getText());
                        }else if(btnNu.isSelected())
                        {
                            s.setGioiTinh(btnNu.getText());
                        }else{
                            JOptionPane.showMessageDialog(null, "Nhap day du thong tin");
                            return;
                        }
                        System.out.println(txtState.getText());
                        s.setName(txtName.getText());
                        s.setAddress(txtAddress.getText());
                        s.setDanToc(txtDanToc.getText());
                        s.setCMT(txtCMT.getText());
                        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                        s.setDOB(sdf.parse(txtNgaySinh.getText()));
                        s.setMaHK(txtMaHK.getText());
                        s.setMaNK(txtMaNK.getText());
                        s.setNoiSinh(txtNoiSinh.getText());
                        s.setQueQuan(txtQueQuan.getText());
                        s.setQheChuHo(txtQheChuHo.getText());
                        s.setQuocTich(txtQuocTich.getText());
                        s.setTonGiao(txtTonGiao.getText());
                        s.setState(txtState.getText());
                        list.add(s);
                        new DAO().add_NK(s);
                        fillTable();
                        JOptionPane.showMessageDialog(null, "success");
                        btnResetClick();
                }
    //            tblThongTin.setModel(tblModel);
    //            tblModel.setRowCount(0); // xoá những dữ liệu cũ
    //            Vector<String> vec= new Vector<String>();
    //            vec.add(s.getMaHK());
    //            vec.add(s.getMaNK());
    //            vec.add(s.getName());
    //            vec.add(s.getCMT());
    ////            new
    ////            tblModel.addRow(""+s.getMaHK());
    ////            tblModel.addRow(s.getMaNK());
    ////            tblModel.addRow(s.getName());
    ////            tblModel.addRow(s.getCMT());
    //            tblModel.addRow(vec);
    //            tblModel.fireTableDataChanged();

            } catch (HeadlessException | ParseException e) {
            }
        }
        
        private void btnThemHoKhauclick(){
            
            themHK secondbox = new themHK();
            secondbox.setVisible(true);
            secondbox.pack();
            secondbox.setLocationRelativeTo(null);
            secondbox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            s = (nhankhau)secondbox.guiDulieunk();
//            list.add(s);
//            fillTable();
//            JOptionPane.showMessageDialog(null, "success");
        }
        
        void fillTableHK1(){
            for(hokhau hk : listHK){
                if(hk.getMaHK().equals(txtIDhokhau.getText())){
                    txtChuName.setText(hk.getHoTenChu());
                txtIDhokhau.setText(hk.getMaHK());
                txtChuID.setText(hk.getMaNKChuHo());
                txtChuCMND.setText(hk.getCMNDChu());
                txtChuState.setText(hk.getStateChu());
                txtDiachi.setText(hk.getAddress());
                DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
                txtNgaylam.setText(dateFormat.format(hk.getNgayLap()));
                if(hk.getGioiTinhChu().equals("nam")){
                    btnChuNam.setSelected(true);
                }else{
                    btnChuNu.setSelected(true);
                }
                fillTableNK(hk.getMaHK());
                break;
                }
            }
        }
        public void close(){
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }
        public static void takein4tach(String id, String s1, String s2, String s3) throws ParseException{
            for(hokhau hk : listHK){
                if(hk.getMaHK().equals(s1)){
                    JOptionPane.showMessageDialog(null, "Mã hộ khẩu đã tồn tại!!!");
                    return;
                }
            }
            for(nhankhau nk : list){
//            hokhau hk = new hokhau();
            if(nk.getMaNK().equals(id)){
            SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                   listHK.add(new hokhau(s1, nk.getMaNK(), s2, sdf.parse(s3),nk.getName(), nk.getCMT(), nk.getGioiTinh(), "Chu ho"));
                                      nk.setMaHK(s1);
//                    nk.setMaHK(s1);
                                    JOptionPane.showMessageDialog(null, "success!!!");
           
            }
                
//                fillTableNK(s1);
                break;
            
            }
            fillTable();
            fillTableHK();
        }
        
        public static void takein4chuyen(String id, String s1){
            int check = 0;
            for(hokhau hk : listHK){
                if(hk.getMaHK().equals(s1)){
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                JOptionPane.showMessageDialog(null, "Hộ khẩu không tồn tại!!!");
                return;
            }
            for(nhankhau nk : list){
                if(nk.getMaNK().equals(id)){
                    new DAO().delete_NK(nk);
                    nk.setMaHK(s1);
                    new DAO().add_NK(nk);
                    JOptionPane.showMessageDialog(null, "success!!!");
                    break;
                }
                                
                
                
            }
            fillTable();
            fillTableHK();
        }

        public static void takein4them(nhankhau nk, hokhau hk){
            for(nhankhau a : list){
                if(a.getMaNK().equals(nk.getMaNK())){
                    JOptionPane.showMessageDialog(null, "Mã nhân khẩu đã tồn tại!!!");
                    return;
                }
                
            }
            new DAO().add_HK(hk);
            for(hokhau b : listHK){
                if(b.getMaHK().equals(hk.getMaHK())){
                    JOptionPane.showMessageDialog(null, "Mã hộ khẩu đã tồn tại!!!");
                    return;
                }
            }
//             JOptionPane.showMessageDialog(null, nk.getMaNK() + "  " + hk.getMaHK());
            new DAO().add_NK(nk);
            
            list.add(nk);
            listHK.add(hk);
            
                            JOptionPane.showMessageDialog(null, "success!!!");
            fillTable();
            fillTableHK();
        }
        
        public void resetHK(){
            txtChuCMND.setText("");
            txtIDhokhau.setText("");
            txtChuID.setText("");
            txtChuState.setText("");
            txtChuName.setText("");
            txtDiachi.setText("");
            txtNgaylam.setText("");
            tblModelNK.setRowCount(0);
            fillTableNK("null");
            btnChuNam.setSelected(false);
            btnChuNu.setSelected(false);
      
        }

    private void capnhapbuttonclick() {
        if(choosingid.equals("NULL")){
            String id = txtIDhokhau.getText();
            if (id.length()==0){
                JOptionPane.showMessageDialog(null, "no information!!!");
                return;
            }
            boolean check = false;
            for(hokhau hk : listHK){
                if(hk.getMaHK().equals(id)){
                    DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
                txtNgaylam.setText(dateFormat.format(hk.getNgayLap()));
                    if((hk.getAddress().equals(txtAddress.getText()))){
                        check = true;
                    }
                    if((hk.getNgayLap().equals(txtNgaylam.getText()))){
                        
                        check = true;
                    }
                    if(check == false){
                                        hk.setAddress(txtAddress.getText());
                                        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            //                        s.setDOB(sdf.parse(txtNgaySinh.getText()));
                            hk.setNgayLap(sdf.parse(txtNgaylam.getText()));
                        } catch (ParseException ex) {
                            Logger.getLogger(mainForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                        JOptionPane.showMessageDialog(null, "success!!!");
                    }
                    
                    break;
                }
            }
        }
    }
    }
