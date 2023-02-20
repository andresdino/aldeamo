package com.pruebaaldeamo.prueba_Aldeamo.service.implement;

import com.pruebaaldeamo.prueba_Aldeamo.repository.VasosRepository;
import com.pruebaaldeamo.prueba_Aldeamo.service.VasosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VasoServiceImpl implements VasosService {
    private final VasosRepository vasoRepository;


    @Override
    public List<Integer> generarVaso(int interacion, Long idPila) {
        List<Integer> b = new ArrayList<>();
        List<Integer> ai = new ArrayList<>();
        var Pi = this.obtenerNumerosPrimos(20);
        var input = this.vasoRepository.findById(idPila).orElseThrow(
                () -> new RuntimeException("No se encontro informacion con el ID: " + idPila));
        var A = input.getInput().split(",");
   try{
       for (int f = 0; f <= interacion; f++) {
           var data = Pi.get(f);
           for (int x = (A.length) - 1; x >= 0; x--) {
               var item = Integer.parseInt(A[x]);
               var isdivisible = this.isDivisible(data, item);
               if (isdivisible) {
                   b.add(item);
               } else {
                   ai.add(item);
               }
           }
           A = this.listaToStringArray(ai);
           ai.clear();
       }

   }catch (Exception ex){
       return b;
   }
       return b;
    }

    private String[] listaToStringArray(List<Integer> datos) {
        String[] strArr = new String[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            strArr[i] = String.valueOf(datos.get(i));
        }
        return strArr;
    }

    private Boolean isDivisible(int interacion, int input) {
        return input % interacion == 0;
    }

    private List<Integer> obtenerNumerosPrimos(int rango) {
        List<Integer> numerosPrimos = new ArrayList<>();
        boolean esPrimo;

        for (int i = 2; i <= rango; i++) {
            esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                numerosPrimos.add(i);
            }
        }

        return numerosPrimos;

    }
}
