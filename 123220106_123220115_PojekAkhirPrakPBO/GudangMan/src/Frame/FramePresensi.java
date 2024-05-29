package Frame;

import Controller.PresensiController;
import java.awt.Color;
import Notify.*;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FramePresensi extends javax.swing.JFrame {

    PresensiController control;
    int id;

    public FramePresensi() {
        initComponents();
        this.setLocationRelativeTo(null);
        control = new PresensiController(this);
        control.fillCmbMinggu();
        control.filCmbTukang();
        control.fillTable();
        hitungTotal();
    }

    private void hitungTotal() {
        int total = 0;
        int jumlah = table.getRowCount();
        for (int i = 0; i < jumlah; i++) {
            total = total + Integer.parseInt(table.getValueAt(i, 10).toString());
        }
        outputTotal.setText(" " + String.valueOf(total));
    }
    
    private void resetForm(){
        id = 0;
        cbSenin.setSelected(false);
        cbSelasa.setSelected(false);
        cbRabu.setSelected(false);
        cbKamis.setSelected(false);
        cbJumat.setSelected(false);
        cbSabtu.setSelected(false);
        cbMinggu.setSelected(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonInventor = new javax.swing.JLabel();
        buttonGaji = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        buttonTukang = new javax.swing.JLabel();
        btExit = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputGaji = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btPerbarui = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btMinggu = new javax.swing.JButton();
        cbSenin = new javax.swing.JCheckBox();
        cbSelasa = new javax.swing.JCheckBox();
        cbRabu = new javax.swing.JCheckBox();
        cbKamis = new javax.swing.JCheckBox();
        cbJumat = new javax.swing.JCheckBox();
        cbSabtu = new javax.swing.JCheckBox();
        cbMinggu = new javax.swing.JCheckBox();
        cmbTukang = new javax.swing.JComboBox<>();
        outputTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbMinggu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        textTanggalAkhir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));

        buttonInventor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonInventor.setText("- Inventoris");
        buttonInventor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonInventorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonInventorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonInventorMouseExited(evt);
            }
        });

        buttonGaji.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonGaji.setForeground(new java.awt.Color(102, 102, 102));
        buttonGaji.setText("- Presensi");

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 1, 24)); // NOI18N
        jLabel3.setText("Menu");

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("- Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });

        buttonTukang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTukang.setText("- Tukang");
        buttonTukang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTukangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonTukangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonTukangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInventor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buttonTukang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInventor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGaji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTukang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 0, 51));
        btExit.setText("x");
        btExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExitMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama Tukang", "Gaji Perdatang", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(3).setPreferredWidth(45);
            table.getColumnModel().getColumn(4).setPreferredWidth(45);
            table.getColumnModel().getColumn(5).setPreferredWidth(45);
            table.getColumnModel().getColumn(6).setPreferredWidth(45);
            table.getColumnModel().getColumn(7).setPreferredWidth(45);
            table.getColumnModel().getColumn(8).setPreferredWidth(45);
            table.getColumnModel().getColumn(9).setPreferredWidth(45);
        }

        jLabel5.setText("Nama");

        jLabel8.setText("Gaji Perdatang");

        inputGaji.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        inputGaji.setEnabled(false);

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btPerbarui.setText("Perbarui");
        btPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerbaruiActionPerformed(evt);
            }
        });

        btBatal.setText("Clear");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        jLabel12.setText("Total gaji ");

        btMinggu.setText("Minggu baru");
        btMinggu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMingguActionPerformed(evt);
            }
        });

        cbSenin.setText("Senin");

        cbSelasa.setText("Selasa");

        cbRabu.setText("Rabu");

        cbKamis.setText("Kamis");

        cbJumat.setText("Jumat");

        cbSabtu.setText("Sabtu");

        cbMinggu.setText("Minggu");

        cmbTukang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTukangItemStateChanged(evt);
            }
        });

        outputTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        outputTotal.setEnabled(false);

        jLabel6.setText("Kehadiran");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTukang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSenin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbSelasa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbRabu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbKamis, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbJumat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbSabtu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btMinggu)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(inputGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTukang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSenin)
                    .addComponent(cbSelasa)
                    .addComponent(cbRabu)
                    .addComponent(cbKamis)
                    .addComponent(cbJumat)
                    .addComponent(cbSabtu)
                    .addComponent(cbMinggu)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambah)
                    .addComponent(btPerbarui)
                    .addComponent(btBatal)
                    .addComponent(btHapus)
                    .addComponent(btMinggu))
                .addContainerGap())
        );

        inputSearch.setText("Cari disini..");
        inputSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inputSearchMouseExited(evt);
            }
        });
        inputSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputSearchKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Search");

        cmbMinggu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMingguItemStateChanged(evt);
            }
        });

        jLabel1.setText("Tanggal : ");

        textTanggalAkhir.setText("- sampai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExit)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTanggalAkhir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btExitMouseClicked

    private void buttonInventorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventorMouseClicked
        this.dispose();
        FrameInv panelBaru = new FrameInv();
        panelBaru.setVisible(true);
    }//GEN-LAST:event_buttonInventorMouseClicked

    private void buttonInventorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventorMouseEntered
        buttonInventor.setForeground(Color.red);
    }//GEN-LAST:event_buttonInventorMouseEntered

    private void buttonInventorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventorMouseExited
        buttonInventor.setForeground(Color.black);
    }//GEN-LAST:event_buttonInventorMouseExited

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        resetForm();
        int row = table.getSelectedRow();
        id = Integer.parseInt(table.getValueAt(row, 0).toString());
        String nama = table.getValueAt(row, 1).toString();
        String gaji = table.getValueAt(row, 2).toString();
        String senin = table.getValueAt(row, 3).toString();
        String selasa = table.getValueAt(row, 4).toString();
        String rabu = table.getValueAt(row, 5).toString();
        String kamis = table.getValueAt(row, 6).toString();
        String jumat = table.getValueAt(row, 7).toString();
        String sabtu = table.getValueAt(row, 8).toString();
        String minggu = table.getValueAt(row, 9).toString();
        
        if (senin.equals("✓")) {
            cbSenin.setSelected(true);
        }
        if (selasa.equals("✓")) {
            cbSelasa.setSelected(true);
        }
        if (rabu.equals("✓")) {
            cbRabu.setSelected(true);
        }
        if (kamis.equals("✓")) {
            cbKamis.setSelected(true);
        }
        if (jumat.equals("✓")) {
            cbJumat.setSelected(true);
        }
        if (sabtu.equals("✓")) {
            cbSabtu.setSelected(true);
        }
        if (minggu.equals("✓")) {
            cbMinggu.setSelected(true);
        }

        for (int i = 0; i < cmbTukang.getItemCount(); i++) {
            String item = cmbTukang.getItemAt(i);
            if (item.equals(nama)) {
                cmbTukang.setSelectedIndex(i);
                control.cmbTukangCS();
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void inputSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputSearchMouseEntered
        inputSearch.setText("");
    }//GEN-LAST:event_inputSearchMouseEntered

    private void inputSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputSearchMouseExited
        inputSearch.setText("Cari disini..");
        control.fillTable();
        hitungTotal();
    }//GEN-LAST:event_inputSearchMouseExited

    private void inputSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSearchKeyTyped
        control.search();
        hitungTotal();
    }//GEN-LAST:event_inputSearchKeyTyped

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setForeground(Color.red);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setForeground(Color.black);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        FrameLogin panelBaru = new FrameLogin();
        panelBaru.setVisible(true);
        Notify notify = new Notify("Logout Berhasil");
        notify.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void cmbTukangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTukangItemStateChanged
        control.cmbTukangCS();
    }//GEN-LAST:event_cmbTukangItemStateChanged

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        control.insert();
        control.fillTable();
        hitungTotal();
        resetForm();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerbaruiActionPerformed
        control.update();
        control.fillTable();
        hitungTotal();
        resetForm();
    }//GEN-LAST:event_btPerbaruiActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        control.delete();
        control.fillTable();
        hitungTotal();
        resetForm();
    }//GEN-LAST:event_btHapusActionPerformed

    private void buttonTukangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTukangMouseClicked
        this.dispose();
        FrameTukang panelBaru = new FrameTukang();
        panelBaru.setVisible(true);
    }//GEN-LAST:event_buttonTukangMouseClicked

    private void buttonTukangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTukangMouseEntered
        buttonTukang.setForeground(Color.red);
    }//GEN-LAST:event_buttonTukangMouseEntered

    private void buttonTukangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTukangMouseExited
        buttonTukang.setForeground(Color.black);
    }//GEN-LAST:event_buttonTukangMouseExited

    private void cmbMingguItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMingguItemStateChanged
        control.cmbMingguCS();
        control.fillTable();
        hitungTotal();
    }//GEN-LAST:event_cmbMingguItemStateChanged

    private void btMingguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMingguActionPerformed
        NotifyAddForm panelBaru = new NotifyAddForm();
        panelBaru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMingguActionPerformed

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        resetForm();
    }//GEN-LAST:event_btBatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePresensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePresensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePresensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePresensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePresensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JLabel btExit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btMinggu;
    private javax.swing.JButton btPerbarui;
    private javax.swing.JButton btTambah;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel buttonGaji;
    private javax.swing.JLabel buttonInventor;
    private javax.swing.JLabel buttonTukang;
    private javax.swing.JCheckBox cbJumat;
    private javax.swing.JCheckBox cbKamis;
    private javax.swing.JCheckBox cbMinggu;
    private javax.swing.JCheckBox cbRabu;
    private javax.swing.JCheckBox cbSabtu;
    private javax.swing.JCheckBox cbSelasa;
    private javax.swing.JCheckBox cbSenin;
    private javax.swing.JComboBox<String> cmbMinggu;
    private javax.swing.JComboBox<String> cmbTukang;
    private javax.swing.JTextField inputGaji;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField outputTotal;
    private javax.swing.JTable table;
    private javax.swing.JLabel textTanggalAkhir;
    // End of variables declaration//GEN-END:variables

    public JTextField getOutputTotal() {
        return outputTotal;
    }

    public void setOutputTotal(JTextField OutputTotal) {
        this.outputTotal = OutputTotal;
    }

    public JCheckBox getCbJumat() {
        return cbJumat;
    }

    public void setCbJumat(JCheckBox cbJumat) {
        this.cbJumat = cbJumat;
    }

    public JCheckBox getCbKamis() {
        return cbKamis;
    }

    public void setCbKamis(JCheckBox cbKamis) {
        this.cbKamis = cbKamis;
    }

    public JCheckBox getCbMinggu() {
        return cbMinggu;
    }

    public void setCbMinggu(JCheckBox cbMinggu) {
        this.cbMinggu = cbMinggu;
    }

    public JCheckBox getCbRabu() {
        return cbRabu;
    }

    public void setCbRabu(JCheckBox cbRabu) {
        this.cbRabu = cbRabu;
    }

    public JCheckBox getCbSabtu() {
        return cbSabtu;
    }

    public void setCbSabtu(JCheckBox cbSabtu) {
        this.cbSabtu = cbSabtu;
    }

    public JCheckBox getCbSelasa() {
        return cbSelasa;
    }

    public void setCbSelasa(JCheckBox cbSelasa) {
        this.cbSelasa = cbSelasa;
    }

    public JCheckBox getCbSenin() {
        return cbSenin;
    }

    public void setCbSenin(JCheckBox cbSenin) {
        this.cbSenin = cbSenin;
    }

    public JComboBox<String> getCmbMinggu() {
        return cmbMinggu;
    }

    public void setCmbMinggu(JComboBox<String> cmbMinggu) {
        this.cmbMinggu = cmbMinggu;
    }

    public JComboBox<String> getCmbTukang() {
        return cmbTukang;
    }

    public void setCmbTukang(JComboBox<String> cmbTukang) {
        this.cmbTukang = cmbTukang;
    }

    public JTextField getInputGaji() {
        return inputGaji;
    }

    public void setInputGaji(JTextField inputGaji) {
        this.inputGaji = inputGaji;
    }

    public JTextField getInputSearch() {
        return inputSearch;
    }

    public void setInputSearch(JTextField inputSearch) {
        this.inputSearch = inputSearch;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JLabel getTextTanggalAkhir() {
        return textTanggalAkhir;
    }

    public void setTextTanggalAkhir(JLabel textTanggalAkhir) {
        this.textTanggalAkhir = textTanggalAkhir;
    }
}
