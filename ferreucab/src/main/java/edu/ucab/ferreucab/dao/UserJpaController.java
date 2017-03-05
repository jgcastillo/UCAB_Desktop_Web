/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.User;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author jgcastillo
 */
public class UserJpaController extends AbstractFacade<User> implements Serializable {

    public UserJpaController() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }

    public User findByUsername(String username){
        EntityManager em = getEntityManager();
        User user = null;
        try {
            String query = "FROM User u WHERE u.user = :username";
            TypedQuery<User> q = em.createQuery(query, User.class);
            q.setParameter("username", username);
            user = q.getSingleResult();
        } catch (NoResultException e) {
            Logger.getLogger(UserJpaController.class.getName()).log(Level.WARNING, e.getMessage());
        } finally {
            em.close();
        }
        return user;
    }
    
}
