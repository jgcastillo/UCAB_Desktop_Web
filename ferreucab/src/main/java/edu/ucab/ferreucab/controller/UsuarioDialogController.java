package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.UserJpaController;
import edu.ucab.ferreucab.model.User;

public class UsuarioDialogController {
    
    private final UserJpaController userController;

    public UsuarioDialogController() {
        userController = new UserJpaController();
    }
    
    public void saveUser(String usuario, char[] psw){
        String password = new String(psw);
        User user = new User.Builder(usuario, password)
                            .build();
        userController.create(user);
    }
}
