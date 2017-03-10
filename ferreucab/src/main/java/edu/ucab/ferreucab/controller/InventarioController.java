package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.InventarioJpaController;
import edu.ucab.ferreucab.model.Articulo;
import edu.ucab.ferreucab.model.Inventario;
import java.util.Optional;

/**
 *
 * @author jgcastillo
 */
public class InventarioController {
    
    private final InventarioJpaController inventarioJpaController;

    public InventarioController() {
        this.inventarioJpaController = new InventarioJpaController();
    }
    
    public void updateInventario(Articulo articulo, int cantidad, boolean egreso) {
        Optional<Inventario> optInventario = 
                Optional.ofNullable(inventarioJpaController.findByArticulo(articulo));
        
        Inventario inventario;
        if(optInventario.isPresent()){  // el articullo existe en el inventario
            inventario = optInventario.get();
            int cantExistente = inventario.getCantidad();
            if(!egreso){ // es un ingreso, se agrega producto
                inventario.setCantidad(cantExistente + cantidad);
            } else {  // es un egreso, se descuenta cantidad de producto
                inventario.setCantidad(cantExistente - cantidad);
            }
            inventarioJpaController.edit(inventario);
        } else { // el articulo no existe en el inventario
            if(!egreso){ // es un ingreso y se crea el inventario del producto
                inventario = new Inventario();
                inventario.setArticuloId(articulo);
                inventario.setCantidad(cantidad);
                
                inventarioJpaController.create(inventario);
            } 
        }
        
        // crear un Builder para agregar el costo
    }
}
