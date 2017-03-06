package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.UbicacionJpaController;
import edu.ucab.ferreucab.model.Ubicacion;
import java.util.List;

public class UbicacionDialogController {
    
    private final UbicacionJpaController jpaController;

    public UbicacionDialogController() {
        jpaController = new UbicacionJpaController();
    }
    
    public List<Ubicacion> getUbicaciones(){
        return jpaController.findAll();
    }
    
    public String[] getUbicacionByIndex(Integer index) {
        Ubicacion ubicacion = jpaController.find(index);
        String[] data = {ubicacion.getPasillo(), ubicacion.getEstante(), ubicacion.getEstante()};
        return data;
    }
    
    public void createUbicacion(String pasillo, String estante, String espacio){
        Ubicacion ubicacion = new Ubicacion.Builder()
                                    .pasillo(pasillo)
                                    .estante(estante)
                                    .espacio(espacio)
                                    .build();
        jpaController.create(ubicacion);
    }
    
    public void deleteUbicacion(Integer index){
        Ubicacion ubicacion = jpaController.find(index);
        jpaController.remove(ubicacion);
    }
    
    public void updateUbicacion(Integer index, String pasillo, String estante, String espacio){
        Ubicacion ubicacion = jpaController.find(index);
        if(!ubicacion.getPasillo().equals(pasillo)){
            ubicacion.setPasillo(pasillo);
        }
        
        if (!ubicacion.getEstante().equals(estante)) {
            ubicacion.setPasillo(estante);
        }
        
        if (!ubicacion.getEspacio().equals(espacio)) {
            ubicacion.setPasillo(espacio);
        }
        
        jpaController.edit(ubicacion);
    }
}
