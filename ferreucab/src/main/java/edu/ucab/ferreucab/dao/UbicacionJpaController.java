package edu.ucab.ferreucab.dao;

import edu.ucab.ferreucab.model.Ubicacion;
import edu.ucab.ferreucab.utilities.JpaUtilities;
import java.io.Serializable;
import javax.persistence.EntityManager;

public class UbicacionJpaController extends AbstractFacade<Ubicacion> implements Serializable {

    public UbicacionJpaController() {
        super(Ubicacion.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JpaUtilities.getEmf().createEntityManager();
    }
    
    public Ubicacion findBYDescripcion(String descripcion){
        Ubicacion ubicacion = null;
        try {
            String idStr = descripcion.substring(descripcion.indexOf("-") + 1);
            Integer id = Integer.parseInt(idStr);
            ubicacion = find(id);
        } catch (Exception e) {
        }
        return ubicacion;
    }
}
