package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Inventario;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class InventarioJpaController extends AbstractFacade<Inventario> implements Serializable {

    public InventarioJpaController() {
        super(Inventario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
}
