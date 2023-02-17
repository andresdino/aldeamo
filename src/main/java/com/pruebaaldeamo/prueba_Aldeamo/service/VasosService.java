package com.pruebaaldeamo.prueba_Aldeamo.service;

import com.pruebaaldeamo.prueba_Aldeamo.repository.VasosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VasoService {
    @Autowired
    private VasosRepository vasoRepository;

    public List<Integer> getRespuesta(int id_pila, int Q) {
        List<Integer> P = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        List<Integer> A = vasoRepository.findByIdPila(id_pila);
        List<Integer> respuesta = new ArrayList<>();

        for (int i = 1; i <= Q; i++) {
            List<Integer> B = new ArrayList<>();
            List<Integer> Ai = new ArrayList<>();

            for (Integer vaso : A) {
                boolean encontrado = false;
                for (Integer p : P) {
                    if (vaso % p == 0) {
                        B.add(vaso);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    Ai.add(vaso);
                }
            }

            respuesta.addAll(B);
            A = Ai;
        }

        respuesta.addAll(A);
        return respuesta;
    }
}
