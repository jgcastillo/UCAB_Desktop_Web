package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.model.User;
import edu.ucab.ferreucab.view.MainFrame;
import java.awt.EventQueue;

public class LoginController {

    public void exit() {
        System.exit(0);
    }

    public boolean login(String user, char[] password) {
        boolean answer = false;
        User userCredentials = getCredentials();
        if (!user.isEmpty() && password.length != 0) {
            if (user.equalsIgnoreCase(userCredentials.getUser())) {
                String psw = new String(password);
                if (psw.equals(userCredentials.getPsw())) {
                    showMainFrame();
                    answer = true;
                }
            }
        }
        return answer;
    }
    
    private User getCredentials(){
        return new User.Builder("usuario", "123456").build();
    }
    
    private void showMainFrame(){
        EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
