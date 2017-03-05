package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class ArticuloJpaController extends AbstractFacade<Articulo> implements Serializable{

    public ArticuloJpaController() {
        super(Articulo.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
}
