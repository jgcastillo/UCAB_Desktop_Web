package edu.ucab.ferreucab.controller;

import edu.ucab.ferreucab.dao.MargenJpaController;
import edu.ucab.ferreucab.model.Margen;
import edu.ucab.ferreucab.utilities.Constantes;
import java.util.Date;
import java.util.Optional;

/**
 *
 * @author jgcastillo
 */
public class MargenDialogController {

    private final MargenJpaController jpaController;

    public MargenDialogController() {
        jpaController = new MargenJpaController();
    }

    public void saveMargen(Date fecha, Double value) {
        Optional<Margen> opMargen = Optional.ofNullable(jpaController
                                    .findByStatus(Constantes.MARGEN_ACTIVO));

        if (opMargen.isPresent()) {
            Margen margenOld = opMargen.get();
            margenOld.setStatus(Constantes.MARGEN_INACTIVO);
            jpaController.edit(margenOld);
        }
        
        Margen margen = new Margen();
        margen.setFecha(fecha);
        margen.setStatus(Constantes.MARGEN_ACTIVO);
        margen.setValor(value);

        jpaController.create(margen);
    }
}
