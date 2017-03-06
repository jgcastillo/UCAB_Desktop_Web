package edu.ucab.ferreucab.view;

import edu.ucab.ferreucab.controller.MainFrameController;
import edu.ucab.ferreucab.view.dialogs.MargenDialog;
import edu.ucab.ferreucab.view.dialogs.UbicacionDialog;
import edu.ucab.ferreucab.view.dialogs.UsuarioDialog;

public class MainFrame extends javax.swing.JFrame {

    private final MainFrameController controller;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        controller = new MainFrameController();
        initGUI();
    }
    
    private void initGUI(){
        this.setTitle("Ferre-UCAB");
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

        backPanel = new javax.swing.JPanel();
        busquedaPanel = new javax.swing.JPanel();
        listaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salirMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ingresoMenuItem = new javax.swing.JMenuItem();
        egresoMenuItem = new javax.swing.JMenuItem();
        ubicacionMenuItem = new javax.swing.JMenuItem();
        margenMenuItem = new javax.swing.JMenuItem();
        usuarioMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout busquedaPanelLayout = new javax.swing.GroupLayout(busquedaPanel);
        busquedaPanel.setLayout(busquedaPanelLayout);
        busquedaPanelLayout.setHorizontalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        busquedaPanelLayout.setVerticalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout listaPanelLayout = new javax.swing.GroupLayout(listaPanel);
        listaPanel.setLayout(listaPanelLayout);
        listaPanelLayout.setHorizontalGroup(
            listaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );
        listaPanelLayout.setVerticalGroup(
            listaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(busquedaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(busquedaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(salirMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");

        ingresoMenuItem.setText("Ingreso");
        ingresoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ingresoMenuItem);

        egresoMenuItem.setText("Egreso");
        egresoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egresoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(egresoMenuItem);

        ubicacionMenuItem.setText("Ubicaciones");
        ubicacionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ubicacionMenuItem);

        margenMenuItem.setText("Margen");
        margenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margenMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(margenMenuItem);

        usuarioMenuItem.setText("Usuario");
        usuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(usuarioMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void ingresoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoMenuItemActionPerformed

    private void egresoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egresoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_egresoMenuItemActionPerformed

    private void margenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margenMenuItemActionPerformed
        MargenDialog dialog = new MargenDialog(this, true);
        controller.showDialog(dialog);
    }//GEN-LAST:event_margenMenuItemActionPerformed

    private void usuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioMenuItemActionPerformed
        UsuarioDialog dialog = new UsuarioDialog(this, true);
        controller.showDialog(dialog);
    }//GEN-LAST:event_usuarioMenuItemActionPerformed

    private void ubicacionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionMenuItemActionPerformed
        UbicacionDialog dialog = new UbicacionDialog(this, true);
        controller.showDialog(dialog);
    }//GEN-LAST:event_ubicacionMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel busquedaPanel;
    private javax.swing.JMenuItem egresoMenuItem;
    private javax.swing.JMenuItem ingresoMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listaPanel;
    private javax.swing.JMenuItem margenMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JMenuItem ubicacionMenuItem;
    private javax.swing.JMenuItem usuarioMenuItem;
    // End of variables declaration//GEN-END:variables
}
