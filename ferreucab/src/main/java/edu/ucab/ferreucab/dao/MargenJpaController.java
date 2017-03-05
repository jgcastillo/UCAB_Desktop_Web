package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Margen;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class MargenJpaController extends AbstractFacade<Margen> implements Serializable{

    public MargenJpaController() {
        super(Margen.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
}
