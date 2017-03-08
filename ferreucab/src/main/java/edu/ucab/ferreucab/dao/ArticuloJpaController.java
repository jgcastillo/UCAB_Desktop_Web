package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ArticuloJpaController extends AbstractFacade<Articulo> implements Serializable{

    public ArticuloJpaController() {
        super(Articulo.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
    public List<Articulo> findByNombre(String nombre){
        List<Articulo> lista = null;
        try {
            String query = "SELECT a FROM Articulo a WHERE a.nombre LIKE '%" + nombre+ "%'";
            TypedQuery<Articulo> q = getEntityManager().createQuery(query, Articulo.class);
//            q.setParameter("nombre", nombre);
            lista = q.getResultList();
        } catch (Exception e) {
            System.err.println("error: " + e);
        }
        return lista;
    }
}
