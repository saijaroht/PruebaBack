package com.solidus.profile.services;

import com.solidus.profile.domain.PaisDTO;

import java.util.List;

public interface PaisesService {

    /**
     * Obtiene todos los paises
     *
     * @return Colleccion de paises
     * */
    List<PaisDTO> getPaises();

}
