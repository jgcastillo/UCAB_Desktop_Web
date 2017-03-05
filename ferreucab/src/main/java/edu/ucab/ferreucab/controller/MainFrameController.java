package edu.ucab.ferreucab.controller;

import javax.swing.JDialog;

public class MainFrameController {

    public void showDialog(JDialog dialog){
        java.awt.EventQueue.invokeLater(() -> {
            //UsuarioDialog dialog = new UsuarioDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    dialog.dispose();
                }
            });
            dialog.setVisible(true);
        });
    }
}
