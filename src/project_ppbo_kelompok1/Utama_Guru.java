package project_ppbo_kelompok1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utama_Guru extends javax.swing.JFrame {

    public Utama_Guru() {
        initComponents();
        Data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiswaKelas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnKeluar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelNilaiSiswa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNilai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNISN2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIPA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIPS = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNilaiSiswaKelas = new javax.swing.JTable();
        txtBing = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSenbud = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPJOK = new javax.swing.JTextField();
        txtMTK = new javax.swing.JTextField();
        txtBind = new javax.swing.JTextField();
        txtPKN = new javax.swing.JTextField();
        txtAgama = new javax.swing.JTextField();
        jPanelPresensi = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNISN1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNISN3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSakit = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIzin = new javax.swing.JTextField();
        btnSimpan1 = new javax.swing.JButton();
        btnUbah1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnCetak1 = new javax.swing.JButton();
        btnKeluar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePresensiSiswaKelas = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtAlfa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Akademik Siswa SD - Guru");
        setSize(new java.awt.Dimension(1200, 800));

        jPanelSiswa.setBackground(new java.awt.Color(255, 255, 255));

        tableSiswaKelas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableSiswaKelas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Data Siswa yang Diampu");

        btnKeluar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar2.setText("Keluar");

        javax.swing.GroupLayout jPanelSiswaLayout = new javax.swing.GroupLayout(jPanelSiswa);
        jPanelSiswa.setLayout(jPanelSiswaLayout);
        jPanelSiswaLayout.setHorizontalGroup(
            jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiswaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiswaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiswaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(417, 417, 417))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiswaLayout.createSequentialGroup()
                        .addComponent(btnKeluar2)
                        .addGap(475, 475, 475))))
        );
        jPanelSiswaLayout.setVerticalGroup(
            jPanelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiswaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnKeluar2)
                .addGap(204, 204, 204))
        );

        jTabbedPane1.addTab("Data Siswa", jPanelSiswa);

        jPanelNilaiSiswa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Data Nilai Siswa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ID Nilai");

        txtNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilaiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NISN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("PKN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("B.Indonesia");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("MTK");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("IPA");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("IPS");

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan.setText("Simpan");

        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah.setText("Ubah");

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("Clear");

        btnCetak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCetak.setText("Cetak");

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");

        tableNilaiSiswaKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Nilai", "NISN", "Nama Siswa", "Agama", "PKN", "B Indo", "MTK", "IPA", "IPS", "B Ing", "Senbud", "PJOK"
            }
        ));
        jScrollPane2.setViewportView(tableNilaiSiswaKelas);

        txtBing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBingActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("B.Inggris");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Senbud");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("PJOK");

        txtMTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMTKActionPerformed(evt);
            }
        });

        txtBind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNilaiSiswaLayout = new javax.swing.GroupLayout(jPanelNilaiSiswa);
        jPanelNilaiSiswa.setLayout(jPanelNilaiSiswaLayout);
        jPanelNilaiSiswaLayout.setHorizontalGroup(
            jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBind, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPKN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAgama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(146, 146, 146)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(txtBing, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNilaiSiswaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPJOK, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtSenbud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIPS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIPA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNilai)
                                .addComponent(txtNISN2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelNilaiSiswaLayout.setVerticalGroup(
            jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNilaiSiswaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtNISN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel6))
                            .addGroup(jPanelNilaiSiswaLayout.createSequentialGroup()
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(txtPKN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNilaiSiswaLayout.createSequentialGroup()
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSenbud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPJOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanelNilaiSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak)
                    .addComponent(btnKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNilaiSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNilaiSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nilai Siswa", jPanel3);

        jPanelPresensi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Data Presensi Siswa");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("ID Presensi");

        txtNISN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISN1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("NISN");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Sakit");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Izin");

        btnSimpan1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan1.setText("Simpan");

        btnUbah1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah1.setText("Ubah");

        btnHapus1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus1.setText("Hapus");

        btnClear1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear1.setText("Clear");

        btnCetak1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCetak1.setText("Cetak");

        btnKeluar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar1.setText("Keluar");

        tablePresensiSiswaKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Presensi", "NISN", "Nama Siswa", "Sakit", "Izin", "Alfa"
            }
        ));
        jScrollPane3.setViewportView(tablePresensiSiswaKelas);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Alfa");

        javax.swing.GroupLayout jPanelPresensiLayout = new javax.swing.GroupLayout(jPanelPresensi);
        jPanelPresensi.setLayout(jPanelPresensiLayout);
        jPanelPresensiLayout.setHorizontalGroup(
            jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresensiLayout.createSequentialGroup()
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresensiLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnSimpan1)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah1)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus1)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak1)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar1))
                    .addGroup(jPanelPresensiLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPresensiLayout.createSequentialGroup()
                                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(29, 29, 29))
                            .addGroup(jPanelPresensiLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAlfa)
                            .addComponent(txtNISN1)
                            .addComponent(txtNISN3)
                            .addComponent(txtSakit)
                            .addComponent(txtIzin, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPresensiLayout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel14))
                    .addGroup(jPanelPresensiLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelPresensiLayout.setVerticalGroup(
            jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresensiLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPresensiLayout.createSequentialGroup()
                        .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(txtNISN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addComponent(txtNISN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIzin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan1)
                    .addComponent(btnUbah1)
                    .addComponent(btnHapus1)
                    .addComponent(btnClear1)
                    .addComponent(btnCetak1)
                    .addComponent(btnKeluar1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Presensi Siswa", jPanelPresensi);

        jPanel1.setBackground(new java.awt.Color(140, 220, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilaiActionPerformed

    private void txtBingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBingActionPerformed

    private void txtNISN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISN1ActionPerformed

    private void txtBindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBindActionPerformed

    private void txtMTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMTKActionPerformed

    private void Data(){
        txtNISN2.setEditable(false);
        txtNISN3.setEditable(false);
        String[] kolomSiswa = {"No", "NISN", "Nama Siswa", "TTL", "Jenis Kelamin", "Agama", "Alamat", "Kelas", "Semester"};
        DefaultTableModel model1 = new DefaultTableModel(null, kolomSiswa);
        tableSiswaKelas.setModel(model1);
        String[] kolomNilai = {"No", "ID Nilai", "NISN", "Nama Siswa", "Agama", 
            "PKN", "B Indo", "MTK", "IPA", "IPS", "B Ing", "Senbud", "PJOK"};
        DefaultTableModel model2 = new DefaultTableModel(null, kolomNilai);
        tableNilaiSiswaKelas.setModel(model2);
        String[] kolomPresensi = {"No", "ID Presensi", "NISN", "Nama Siswa", "Sakit", "Izin", "Alfa"};
        DefaultTableModel model3 = new DefaultTableModel(null, kolomPresensi);
        tableNilaiSiswaKelas.setModel(model3);

        String sql1 = "SELECT * FROM siswa WHERE kelas = '1A'";
        String sql2 = "SELECT id_nilai, ln.nisn, nama, ln.agama, pkn, b_indo,"
                + " mtk, ipa, ips, b_ing, senbud, pjok FROM laporan_nilai ln, siswa s "
                + "WHERE ln.nisn = s.nisn AND kelas = '1A'";
        String sql3 = "SELECT * FROM presensi_siswa ps, siswa s "
                + "WHERE ps.nisn = s.nisn AND kelas = '1A'";

        try {
            int no = 1;

            Connection conn = (Connection)Config.configDb();
            Statement stm1 = conn.createStatement();
            ResultSet res1= stm1.executeQuery(sql1);
            while (res1.next()) {
                String nisn = res1.getString("nisn");
                String nama = res1.getString("nama");
                String ttl = res1.getString("ttl");
                String jk = res1.getString("jenis_kelamin");
                String agama = res1.getString("agama");
                String alamat = res1.getString("alamat");
                String kelas = res1.getString("kelas");
                String semester = res1.getString("semester");
                String[] dataSiswa = {""+no, nisn, nama, ttl, jk, agama, alamat, kelas, semester};
                model1.addRow(dataSiswa);
                no++;
            }
            Statement stm2 = conn.createStatement();
            ResultSet res2 = stm2.executeQuery(sql2);
            no = 1;
            while (res2.next()) {
                String idNilai = res2.getString("id_nilai");
                String nisn = res2.getString("nisn");
                String nama = res2.getString("nama");
                String agama = res2.getString("agama");
                String pkn = res2.getString("pkn");
                String bIndo = res2.getString("b_indo");
                String mtk = res2.getString("mtk");
                String ipa = res2.getString("ipa");
                String ips = res2.getString("ips");
                String bIng = res2.getString("b_ing");
                String senbud = res2.getString("senbud");
                String pjok = res2.getString("pjok");
                String[] dataNilai = {""+no, idNilai, nisn, nama, agama,
                pkn, bIndo, mtk, ipa, ips, bIng, senbud, pjok};
                model2.addRow(dataNilai);
                no++;
            }
            Statement stm3 = conn.createStatement();
            ResultSet res3 = stm3.executeQuery(sql3);
            no = 1;
            while (res3.next()) {
                String idPresensi = res3.getString("id_nilai");
                String nisn = res3.getString("nisn");
                String nama = res3.getString("nama");
                String sakit = res3.getString("sakit");
                String izin = res3.getString("izin");
                String alfa = res3.getString("alfa");
                String[] dataPresensi = {""+no, idPresensi, nisn, nama, sakit, izin, alfa};
                model3.addRow(dataPresensi);
                no++;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database gagal "+e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama_Guru().setVisible(true);
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
    private javax.swing.JButton btnKeluar2;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUbah1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelNilaiSiswa;
    private javax.swing.JPanel jPanelPresensi;
    private javax.swing.JPanel jPanelSiswa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableNilaiSiswaKelas;
    private javax.swing.JTable tablePresensiSiswaKelas;
    private javax.swing.JTable tableSiswaKelas;
    private javax.swing.JTextField txtAgama;
    private javax.swing.JTextField txtAlfa;
    private javax.swing.JTextField txtBind;
    private javax.swing.JTextField txtBing;
    private javax.swing.JTextField txtIPA;
    private javax.swing.JTextField txtIPS;
    private javax.swing.JTextField txtIzin;
    private javax.swing.JTextField txtMTK;
    private javax.swing.JTextField txtNISN1;
    private javax.swing.JTextField txtNISN2;
    private javax.swing.JTextField txtNISN3;
    private javax.swing.JTextField txtNilai;
    private javax.swing.JTextField txtPJOK;
    private javax.swing.JTextField txtPKN;
    private javax.swing.JTextField txtSakit;
    private javax.swing.JTextField txtSenbud;
    // End of variables declaration//GEN-END:variables
}
