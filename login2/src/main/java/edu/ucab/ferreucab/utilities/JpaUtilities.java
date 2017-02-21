package edu.ucab.ferreucab.utilities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtilities {

    private final static String PERSISTENCE_UNIT = "login2_1.0-SNAPSHOTPU"; 
    
    public static EntityManagerFactory getEmf(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        return emf;
    }
}
