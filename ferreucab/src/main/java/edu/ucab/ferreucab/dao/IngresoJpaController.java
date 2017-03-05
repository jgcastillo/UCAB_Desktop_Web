package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Ingreso;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class IngresoJpaController extends AbstractFacade<Ingreso> implements Serializable {

    public IngresoJpaController() {
        super(Ingreso.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
}
