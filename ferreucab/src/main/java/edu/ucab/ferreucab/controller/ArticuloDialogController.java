package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.UbicacionJpaController;
import edu.ucab.ferreucab.model.Ubicacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArticuloDialogController {

    private final UbicacionJpaController ubicacionJpaController;

    public ArticuloDialogController() {
        this.ubicacionJpaController = new UbicacionJpaController();
    }
    
    public String[] getUbicaciones(){
        String[] data = null;
        
        Optional<List<Ubicacion>> opUbicaciones = Optional.ofNullable(ubicacionJpaController.findAll());
        if(opUbicaciones.isPresent()){
            List<Ubicacion> ubicaciones = opUbicaciones.get();
            if(!ubicaciones.isEmpty()){
                data = new String[ubicaciones.size()];
                int i = 0;
                for(Ubicacion ubi : ubicaciones){
                    StringBuilder sb = new StringBuilder();
                    sb.append(ubi.getPasillo());
                    sb.append(ubi.getEstante());
                    sb.append(ubi.getEspacio());
                    sb.append("-").append(ubi.getId());
                    data[i] = sb.toString();
                    i++;
                }
            }
        }
        
        return data;
    }
}
