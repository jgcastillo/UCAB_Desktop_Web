package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.ArticuloJpaController;
import edu.ucab.ferreucab.model.Articulo;
import java.util.List;
import java.util.Optional;

public class IngresoDialogController {

    private final ArticuloJpaController articuloJpaController;

    public IngresoDialogController() {
        this.articuloJpaController = new ArticuloJpaController();
    }
    
    public Optional<List<Articulo>> findAllArticulo(String nombre) {
        return Optional.ofNullable(articuloJpaController.findByNombre(nombre));
    }

    
}
