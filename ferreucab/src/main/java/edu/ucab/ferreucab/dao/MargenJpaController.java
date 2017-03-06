package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Margen;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class MargenJpaController extends AbstractFacade<Margen> implements Serializable{

    public MargenJpaController() {
        super(Margen.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
    public Margen findByStatus(int status){
        Margen margen = null;
        try {
            String query = "FROM Margen m WHERE m.status = :status";
            TypedQuery<Margen> q = getEntityManager().createQuery(query, Margen.class);
            q.setParameter("status", status);
            margen = q.getSingleResult();
        } catch (NoResultException e) {
        }
        return margen;
    }
}
