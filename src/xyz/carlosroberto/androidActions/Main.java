package xyz.carlosroberto.androidActions;

//@author carlos
public class Main extends javax.swing.JFrame {

    AndroidActions acao = new AndroidActions();

    public Main() {

        initComponents();

        acao.comando("adb start-server", false);
        statusDevice();

    }

    public final void statusDevice() {

        acao.comando("adb get-state");
        deviceStatus.setText(acao.getResposta());

        acao.limparBuffer();
        
        sistema.setText(System.getProperty("os.name"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTerminal = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        adbDevices = new javax.swing.JButton();
        reboot = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        deviceStatus = new javax.swing.JLabel();
        sistema = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        buscaDevice = new javax.swing.JMenuItem();
        wifiCon = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Android Actions");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setToolTipText("");

        txtTerminal.setColumns(20);
        txtTerminal.setRows(5);
        jScrollPane1.setViewportView(txtTerminal);

        adbDevices.setText("ADB Devices");
        adbDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbDevicesActionPerformed(evt);
            }
        });

        reboot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reboot", "Recovery", "BootLoader" }));
        reboot.setToolTipText("");
        reboot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rebootItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Status do Dispositivo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adbDevices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reboot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sistema))
                    .addComponent(jLabel1)
                    .addComponent(deviceStatus))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adbDevices)
                    .addComponent(reboot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistema))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deviceStatus)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADB", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("FastBoot", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Ferramentas");

        buscaDevice.setText("Buscar Dispositivo");
        buscaDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaDeviceActionPerformed(evt);
            }
        });
        jMenu1.add(buscaDevice);

        wifiCon.setText("Conectar por WiFi");
        wifiCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wifiConActionPerformed(evt);
            }
        });
        jMenu1.add(wifiCon);

        jMenuItem1.setText("Editar variaveis");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void adbDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbDevicesActionPerformed

        acao.comando("adb devices"); //Executa um comando do sistema
        txtTerminal.setText(acao.getResposta()); //Obtém a resposta, e seta no jTextArea1

    }//GEN-LAST:event_adbDevicesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        //Faz as ações necessárias para fechar o programa
        acao.comando("adb kill-server", false);

    }//GEN-LAST:event_formWindowClosing

    private void rebootItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rebootItemStateChanged

        String comando = null;

        if (reboot.getSelectedIndex() == 0) {
            comando = "reboot";
        } else if (reboot.getSelectedIndex() == 1) {
            comando = "reboot recovery";
        } else if (reboot.getSelectedIndex() == 2) {
            comando = "reboot-bootloader";
        }

        acao.comando("adb " + comando, false); //Executa um comando do sistema
        txtTerminal.setText(acao.getResposta()); //Obtém a resposta, e seta no jTextArea1

    }//GEN-LAST:event_rebootItemStateChanged

    private void buscaDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaDeviceActionPerformed

        new WaitDevice().setVisible(true);
        
    }//GEN-LAST:event_buscaDeviceActionPerformed

    private void wifiConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wifiConActionPerformed

        new AdbConnect().setVisible(true);
        
    }//GEN-LAST:event_wifiConActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adbDevices;
    private javax.swing.JMenuItem buscaDevice;
    private javax.swing.JLabel deviceStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox reboot;
    private javax.swing.JLabel sistema;
    private javax.swing.JTextArea txtTerminal;
    private javax.swing.JMenuItem wifiCon;
    // End of variables declaration//GEN-END:variables
}
