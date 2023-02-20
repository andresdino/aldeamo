package com.pruebaaldeamo.prueba_Aldeamo.controller;


import com.pruebaaldeamo.prueba_Aldeamo.service.VasosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/vasos")
public class VasosController {
    private final VasosService vasoService;

    @Autowired
    public VasosController(VasosService vasoService) {
        this.vasoService = vasoService;
    }


    /**
     * Petición Get que recibe como parametro q:'numero de iteraciones'  idPila:'identificados fuente de datos'
     * @param q
     * @param idPila
     * @return
     */
    @GetMapping(value = "/{q}/{idPila}")
    public ResponseEntity<?> getFedCafeteros(@PathVariable int q, @PathVariable Long idPila) {
        var service = this.vasoService.generarVaso(q, idPila);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }
}