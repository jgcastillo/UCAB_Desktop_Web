package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.UserJpaController;
import edu.ucab.ferreucab.model.User;
import edu.ucab.ferreucab.view.MainFrame;
import java.awt.EventQueue;
import java.util.Optional;

public class LoginController {

    UserJpaController userJpa = new UserJpaController();

    public void exit() {
        System.exit(0);
    }

    public boolean login(String user, char[] password) {
        boolean answer = false;
        Optional<User> optUserCredentials = Optional.ofNullable(getCredentials(user));
        if (!user.isEmpty() && password.length != 0) {
            if (optUserCredentials.isPresent()) {
                User userCredentials = optUserCredentials.get();
                if (user.equalsIgnoreCase(userCredentials.getUser())) {
                    String psw = new String(password);
                    if (psw.equals(userCredentials.getPsw())) {
                        showMainFrame();
                        answer = true;
                    }
                }
            }
        }
        return answer;
    }

    private User getCredentials(String username) {
        //return new User.Builder("usuario", "123456").build();
        return userJpa.findByUsername(username);
    }

    private void showMainFrame() {
        EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
