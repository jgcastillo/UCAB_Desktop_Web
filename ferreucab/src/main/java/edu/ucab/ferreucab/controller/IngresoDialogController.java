package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.ArticuloJpaController;
import edu.ucab.ferreucab.dao.IngresoJpaController;
import edu.ucab.ferreucab.dao.InventarioJpaController;
import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.model.Ingreso;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class IngresoDialogController {

    private final ArticuloJpaController articuloJpaController;
    private final IngresoJpaController ingresoJpaController;
    private final InventarioController inventarioController;
    
    public IngresoDialogController() {
        this.articuloJpaController = new ArticuloJpaController();
        this.ingresoJpaController = new IngresoJpaController();
        this.inventarioController = new InventarioController();
    }
    
    public Optional<List<Articulo>> findAllArticulo(String nombre) {
        return Optional.ofNullable(articuloJpaController.findByNombre(nombre));
    }

    public Articulo getArticuloById(Integer id){
        return articuloJpaController.find(id);
    }
    
    public void saveIngreso(Articulo articulo, double costo, int cantidad, Date fecha ){
        Ingreso ingreso = new Ingreso();
        
        ingreso.setArticuloId(articulo);
        ingreso.setCantidad(cantidad);
        ingreso.setCosto(costo);
        ingreso.setFecha(fecha);
        
        ingresoJpaController.create(ingreso);
        
        // ingreso = false, egreso = true
        inventarioController.updateInventario(articulo, cantidad, false);
    }
    
}
