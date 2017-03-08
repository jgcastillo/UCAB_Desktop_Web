package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.ArticuloJpaController;
import edu.ucab.ferreucab.dao.UbicacionJpaController;
import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.model.Ubicacion;
import java.util.List;
import java.util.Optional;

public class ArticuloDialogController {

    private final ArticuloJpaController articuloJpaController;
    private final UbicacionJpaController ubicacionJpaController;

    public ArticuloDialogController() {
        this.articuloJpaController = new ArticuloJpaController();
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
    
    public void saveArticulo(String nombre, String codigo, String ubi){
        
        Optional<Ubicacion> optUbicacion = Optional
                        .ofNullable(ubicacionJpaController
                                        .findBYDescripcion(ubi));
        
        if(optUbicacion.isPresent()){
            Ubicacion ubicacion = optUbicacion.get();
            
            Articulo articulo = new Articulo();
            articulo.setNombre(nombre);
            articulo.setCodigo(codigo);
            articulo.setUbicacionId(ubicacion);
            
            articuloJpaController.create(articulo);
        }
    }
    
}
