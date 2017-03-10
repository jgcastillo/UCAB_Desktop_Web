package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.model.Inventario;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class InventarioJpaController extends AbstractFacade<Inventario> implements Serializable {

    public InventarioJpaController() {
        super(Inventario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
    public Inventario findByArticulo(Articulo articulo){
        Inventario inventario = null;
        try {
            String query = "FROM Inventario i WHERE i.articuloId = :articulo";
            TypedQuery<Inventario> q = getEntityManager().createQuery(query, Inventario.class);
            q.setParameter("articulo", articulo);
            inventario = q.getSingleResult();
        } catch (NoResultException e) {
        }
        
        return inventario;
    }
}
