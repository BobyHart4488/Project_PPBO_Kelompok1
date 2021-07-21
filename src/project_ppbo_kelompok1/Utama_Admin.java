package project_ppbo_kelompok1;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Utama_Admin extends javax.swing.JFrame {

    String gender = null;
    String sem = null;
    
    public Utama_Admin() {
        initComponents();
        Data();
        ComboBox();
    }
    
    private void ComboBox(){
        try{
            String sql3 = "SELECT kelas FROM guru GROUP BY kelas";
            int no = 1;

            Connection conn = (Connection)Config.configDb();
            Statement stm3 = conn.createStatement();
            ResultSet res3 = stm3.executeQuery(sql3);
            while (res3.next()) {
                comboKelas.addItem(res3.getString("kelas"));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void genderGetSelected(){
        if(radioLakilaki.isSelected()) {
            gender="Laki-laki";
        } else if(radioPerempuan.isSelected()) { 
           gender="Perempuan";
        }
    }
    
    private void semGetSelected(){
        if(radioSem1.isSelected()) {
            sem="1";
        } else if(radioSem2.isSelected()) { 
            sem="2";
        }
    }
    
    private void clear(){
        searchSiswa.setText("");
        txtNISN.setText("");
        txtNama.setText("");
        txtTTL.setText("");
        buttonGroup1.clearSelection();
        comboAgama.setSelectedItem("Islam");
        txtAlamat.setText("");
        comboKelas.setSelectedItem("1A");
        buttonGroup2.clearSelection();
    }
    
    private void clearGuru(){
        searchGuru.setText("");
        txtNIP.setText("");
        txtNamaGuru.setText("");
        txtPass.setText("");
        txtKelasGuru.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelSiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTTL = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        radioLakilaki = new javax.swing.JRadioButton();
        radioPerempuan = new javax.swing.JRadioButton();
        comboKelas = new javax.swing.JComboBox<>();
        radioSem1 = new javax.swing.JRadioButton();
        radioSem2 = new javax.swing.JRadioButton();
        comboAgama = new javax.swing.JComboBox<>();
        searchSiswa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanelGuru = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNIP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNamaGuru = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtKelasGuru = new javax.swing.JTextField();
        btnSimpan1 = new javax.swing.JButton();
        btnUbah1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnCetak1 = new javax.swing.JButton();
        btnKeluar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGuru = new javax.swing.JTable();
        txtPass = new javax.swing.JPasswordField();
        searchGuru = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Akademik Siswa SD - Admin");
        setLocation(new java.awt.Point(330, 100));
        setSize(new java.awt.Dimension(1200, 800));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanelSiswa.setBackground(new java.awt.Color(255, 255, 255));

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NISN", "Nama Siswa", "TTL", "Jenis Kelamin", "Agama", "Alamat", "Kelas", "Semester"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSiswa);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Siswa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NISN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("TTL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Agama");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Kelas");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Semester");

        txtNISN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISNActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCetak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioLakilaki);
        radioLakilaki.setText("Laki-laki");
        radioLakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLakilakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioPerempuan);
        radioPerempuan.setText("Perempuan");

        buttonGroup2.add(radioSem1);
        radioSem1.setText("1");

        buttonGroup2.add(radioSem2);
        radioSem2.setText("2");

        comboAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Buddha", "Hindu", "Konghuchu" }));

        searchSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSiswaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cari Siswa");

        javax.swing.GroupLayout jPanelSiswaLayout = new javax.swing.GroupLayout(jPanelSiswa);
        jPanelSiswa.setLayout(jPanelSiswaLayout);
        jPanelSiswaLayout.setHorizontalGroup(
            jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiswaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSiswaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(403, 403, 403)
                        .addComponent(jLabel1))
                    .addComponent(searchSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSiswaLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSiswaLayout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnUbah)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnCetak))
                            .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiswaLayout.createSequentialGroup()
                                    .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAlamat)
                                        .addComponent(comboKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelSiswaLayout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(radioSem1)
                                            .addGap(38, 38, 38)
                                            .addComponent(radioSem2))
                                        .addComponent(comboAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiswaLayout.createSequentialGroup()
                                    .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNISN)
                                        .addComponent(txtNama)
                                        .addComponent(txtTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelSiswaLayout.createSequentialGroup()
                                            .addComponent(radioLakilaki)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radioPerempuan))))))
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelSiswaLayout.setVerticalGroup(
            jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiswaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addComponent(searchSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSiswaLayout.createSequentialGroup()
                        .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioLakilaki)
                    .addComponent(radioPerempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSem1)
                    .addComponent(radioSem2)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak)
                    .addComponent(btnKeluar))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Siswa", jPanelSiswa);

        jPanelGuru.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Data Guru");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("NIP");

        txtNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIPActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Nama");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Kelas");

        btnSimpan1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan1.setText("Simpan");
        btnSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan1ActionPerformed(evt);
            }
        });

        btnUbah1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah1.setText("Ubah");
        btnUbah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah1ActionPerformed(evt);
            }
        });

        btnHapus1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus1.setText("Hapus");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnCetak1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCetak1.setText("Cetak");
        btnCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak1ActionPerformed(evt);
            }
        });

        btnKeluar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar1.setText("Keluar");
        btnKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar1ActionPerformed(evt);
            }
        });

        tableGuru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "NIP", "Nama Guru", "Password", "Kelas"
            }
        ));
        tableGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGuruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableGuru);

        searchGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGuruActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Cari Guru");

        javax.swing.GroupLayout jPanelGuruLayout = new javax.swing.GroupLayout(jPanelGuru);
        jPanelGuru.setLayout(jPanelGuruLayout);
        jPanelGuruLayout.setHorizontalGroup(
            jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuruLayout.createSequentialGroup()
                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuruLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGuruLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(searchGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addComponent(btnSimpan1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGuruLayout.createSequentialGroup()
                                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(29, 29, 29)
                                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNIP)
                                    .addComponent(txtNamaGuru)
                                    .addComponent(txtKelasGuru)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelGuruLayout.createSequentialGroup()
                                .addComponent(btnUbah1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanelGuruLayout.createSequentialGroup()
                                        .addComponent(btnHapus1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCetak1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnKeluar1)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGuruLayout.setVerticalGroup(
            jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuruLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuruLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(15, 15, 15)
                        .addComponent(searchGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGuruLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelGuruLayout.createSequentialGroup()
                                .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addComponent(txtNamaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtKelasGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan1)
                            .addComponent(btnUbah1)
                            .addComponent(btnHapus1)
                            .addComponent(btnClear1)
                            .addComponent(btnCetak1)
                            .addComponent(btnKeluar1))))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Guru", jPanelGuru);

        jPanel1.setBackground(new java.awt.Color(140, 220, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel17.setText("Sistem Akademik Siswa SD");

        jLabel19.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel20.setText("Sistem Akademik Siswa SD");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TWH.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SD.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel18)
                .addGap(113, 113, 113)
                .addComponent(jLabel20)
                .addGap(113, 113, 113)
                .addComponent(jLabel22)
                .addGap(1455, 1455, 1455)
                .addComponent(jLabel17)
                .addGap(86, 86, 86)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNISNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISNActionPerformed

    private void txtNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIPActionPerformed

    private void radioLakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLakilakiActionPerformed

    private void btnKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluar1ActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try{
            genderGetSelected();
            semGetSelected();
            String sql="INSERT INTO siswa VALUES ('"+txtNISN.getText()+"', '"+txtNama.getText()+"',"
                    + "'"+txtTTL.getText()+"', '"+gender+"', '"+comboAgama.getSelectedItem()+"',"
                    + "'"+txtAlamat.getText()+"', '"+comboKelas.getSelectedItem()+"', '"+sem+"');";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan data berhasil");
            Data();
            clear();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
        Data();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try{
            genderGetSelected();
            semGetSelected();
            String sql="UPDATE siswa SET nama='"+txtNama.getText()+"',"
                    + "ttl='"+txtTTL.getText()+"',"
                    + "jenis_kelamin='"+gender+"',"
                    + "agama='"+comboAgama.getSelectedItem()+"',"
                    + "alamat='"+txtAlamat.getText()+"',"
                    + "kelas='"+comboKelas.getSelectedItem()+"',"
                    + "semester='"+sem+"' WHERE nisn='"+txtNISN.getText()+"'";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
            Data();
            clear();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        txtNISN.setEditable(false);
        
        int baris=tableSiswa.rowAtPoint(evt.getPoint());
        String nisn=tableSiswa.getValueAt(baris, 1).toString();
        txtNISN.setText(nisn);
        String nama=tableSiswa.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        String ttl=tableSiswa.getValueAt(baris, 3).toString();
        txtTTL.setText(ttl);
            if(tableSiswa.getValueAt(baris, 4).equals("Laki-laki")){
                radioLakilaki.setSelected(true);
            } else {
                radioPerempuan.setSelected(true);
            }
        String agama=tableSiswa.getValueAt(baris, 5).toString();
        comboAgama.setSelectedItem(agama);
        String alamat=tableSiswa.getValueAt(baris, 6).toString();
        txtAlamat.setText(alamat);
        String kelas=tableSiswa.getValueAt(baris, 7).toString();
        comboKelas.setSelectedItem(kelas);
            if(tableSiswa.getValueAt(baris, 8).equals("1")){
                radioSem1.setSelected(true);
            } else {
                radioSem2.setSelected(true);
            }
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            String sql="DELETE FROM siswa WHERE nisn='"+txtNISN.getText()+"'";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
            Data();
            clear();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try{
            InputStream is=Utama_Admin.class.getResourceAsStream("/jasper_ppbo_kelompok1/Utama_Admin_Siswa.jasper");
            JasperPrint jsPrint=JasperFillManager.fillReport(is, null, Config.configDb());
            JasperViewer.viewReport(jsPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal mencetak laporan karena : "
            + e.getMessage(), "Report Data Siswa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
        try{
            String sql="INSERT INTO guru VALUES ('"+txtNIP.getText()+"', '"+txtNamaGuru.getText()+"',"
                    + "'"+txtPass.getText()+"', '"+txtKelasGuru.getText()+"');";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan data berhasil");
            Data();
            clearGuru();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void btnUbah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbah1ActionPerformed
        try{
            String sql="UPDATE guru SET nama='"+txtNamaGuru.getText()+"',"
                    + "password='"+txtPass.getText()+"',"
                    + "kelas='"+txtKelasGuru.getText()+"' WHERE nip='"+txtNIP.getText()+"'";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
            Data();
            clearGuru();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUbah1ActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        try{
            String sql="DELETE FROM guru WHERE nip='"+txtNIP.getText()+"'";
            
            java.sql.Connection conn=(Connection)Config.configDb();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
            Data();
            clearGuru();
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void tableGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGuruMouseClicked
        txtNIP.setEditable(false);
        
        int baris=tableGuru.rowAtPoint(evt.getPoint());
        String nip=tableGuru.getValueAt(baris, 1).toString();
        txtNIP.setText(nip);
        String nama=tableGuru.getValueAt(baris, 2).toString();
        txtNamaGuru.setText(nama);
        String pass=tableGuru.getValueAt(baris, 3).toString();
        txtPass.setText(pass);
        String kelas=tableGuru.getValueAt(baris, 4).toString();
        txtKelasGuru.setText(kelas);
    }//GEN-LAST:event_tableGuruMouseClicked

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        clearGuru();
        Data();
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetak1ActionPerformed
        try{
            InputStream is=Utama_Admin.class.getResourceAsStream("/jasper_ppbo_kelompok1/Utama_Admin_Guru.jasper");
            JasperPrint jsPrint=JasperFillManager.fillReport(is, null, Config.configDb());
            JasperViewer.viewReport(jsPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal mencetak laporan karena : "
            + e.getMessage(), "Report Data Guru", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCetak1ActionPerformed

    private void searchSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSiswaActionPerformed
        try{
            String sql="SELECT * FROM siswa WHERE nama LIKE '"+searchSiswa.getText()+"%'"
                    + " OR nama LIKE '%"+searchSiswa.getText()+"%';";
            
            String[] kolomSiswa = {"No", "NISN", "Nama Siswa", "TTL", "Jenis Kelamin", "Agama", "Alamat", "Kelas", "Semester"};
            DefaultTableModel model = new DefaultTableModel(null, kolomSiswa);
            tableSiswa.setModel(model);
            
            int no = 1;

            Connection conn = (Connection)Config.configDb();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String nisn = res.getString("nisn");
                String nama = res.getString("nama");
                String ttl = res.getString("ttl");
                String jk = res.getString("jenis_kelamin");
                String agama = res.getString("agama");
                String alamat = res.getString("alamat");
                String kelas = res.getString("kelas");
                String semester = res.getString("semester");
                String[] dataSiswa = {""+no, nisn, nama, ttl, jk, agama, alamat, kelas, semester};
                model.addRow(dataSiswa);
                no++;
            }
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchSiswaActionPerformed

    private void searchGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGuruActionPerformed
        try{
            String sql="SELECT * FROM guru WHERE nama LIKE '"+searchGuru.getText()+"%'"
                    + " OR nama LIKE '%"+searchGuru.getText()+"%';";
            
            String[] kolomGuru = {"No", "NIP", "Nama Guru", "Password", "Kelas"};
            DefaultTableModel model = new DefaultTableModel(null, kolomGuru);
            tableGuru.setModel(model);
            
            int no = 1;

            Connection conn = (Connection)Config.configDb();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String nip = res.getString("nip");
                String nama = res.getString("nama");
                String password = res.getString("password");
                String kelas = res.getString("kelas");
                String[] dataGuru = {""+no, nip, nama, password, kelas};
                model.addRow(dataGuru);
                no++;
            }
        } catch(HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchGuruActionPerformed

    private void Data(){
        txtNIP.setEditable(true);
        txtNISN.setEditable(true);
        
        String[] kolomGuru = {"No", "NIP", "Nama Guru", "Password", "Kelas"};
        DefaultTableModel model1 = new DefaultTableModel(null, kolomGuru);
        tableGuru.setModel(model1);
        String[] kolomSiswa = {"No", "NISN", "Nama Siswa", "TTL", "Jenis Kelamin", "Agama", "Alamat", "Kelas", "Semester"};
        DefaultTableModel model2 = new DefaultTableModel(null, kolomSiswa);
        tableSiswa.setModel(model2);

        String sql = "SELECT * FROM guru";
        String sql2 = "SELECT * FROM siswa";

        try {
            int no = 1;

            Connection conn = (Connection)Config.configDb();
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String nip = res.getString("nip");
                String nama = res.getString("nama");
                String password = res.getString("password");
                String kelas = res.getString("kelas");
                String[] dataGuru = {""+no, nip, nama, password, kelas};
                model1.addRow(dataGuru);
                no++;
            }
            Statement stm2 = conn.createStatement();
            ResultSet res2 = stm2.executeQuery(sql2);
            no = 1;
            while (res2.next()) {
                String nisn = res2.getString("nisn");
                String nama = res2.getString("nama");
                String ttl = res2.getString("ttl");
                String jk = res2.getString("jenis_kelamin");
                String agama = res2.getString("agama");
                String alamat = res2.getString("alamat");
                String kelas = res2.getString("kelas");
                String semester = res2.getString("semester");
                String[] dataSiswa = {""+no, nisn, nama, ttl, jk, agama, alamat, kelas, semester};
                model2.addRow(dataSiswa);
                no++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database gagal "+e.getMessage());
        }
    }
    
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetak1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKeluar1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUbah1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboAgama;
    private javax.swing.JComboBox<String> comboKelas;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGuru;
    private javax.swing.JPanel jPanelSiswa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton radioLakilaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JRadioButton radioSem1;
    private javax.swing.JRadioButton radioSem2;
    private javax.swing.JTextField searchGuru;
    private javax.swing.JTextField searchSiswa;
    private javax.swing.JTable tableGuru;
    private javax.swing.JTable tableSiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKelasGuru;
    private javax.swing.JTextField txtNIP;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaGuru;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTTL;
    // End of variables declaration//GEN-END:variables
}
