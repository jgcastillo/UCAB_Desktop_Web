package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Egreso;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class EgresoJpaController extends AbstractFacade<Egreso> implements Serializable{

    public EgresoJpaController() {
        super(Egreso.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
}
