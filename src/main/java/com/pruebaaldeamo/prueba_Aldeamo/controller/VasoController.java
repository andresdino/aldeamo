package com.pruebaaldeamo.prueba_Aldeamo.controller;

import com.pruebaaldeamo.prueba_Aldeamo.service.VasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VasoController {
    @Autowired
    private VasoService vasoService;

    @GetMapping("/vasos/{id_pila}")
    public List<Integer> getRespuesta(@PathVariable int id_pila, @RequestParam int Q) {
        return vasoService.getRespuesta(id_pila, Q);
    }
}

