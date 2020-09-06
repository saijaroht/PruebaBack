package com.solidus.profile.controllers;

import com.solidus.profile.domain.PaisDTO;
import com.solidus.profile.services.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class PaisesController {

    private final PaisesService paisesService;

    @Autowired
    public PaisesController(PaisesService paisesService) {
        this.paisesService = paisesService;
    }

    @GetMapping(value = "/paises")
    public List<PaisDTO> findAll(){
        return paisesService.getPaises();
    }

}
