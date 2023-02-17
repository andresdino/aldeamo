package com.pruebaaldeamo.prueba_Aldeamo.model;

import java.util.List;

public class vasosModelos {
    public class Vasos {
        private int number;
        public int getNumber() {
            return number;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public int getPrimeIndex() {
            return primeIndex;
        }
        public void setPrimeIndex(int primeIndex) {
            this.primeIndex = primeIndex;
        }
        private int primeIndex;
    }

    public class listaVasos {
        public List<Vasos> getA() {
            return A;
        }

        public void setA(List<Vasos> a) {
            A = a;
        }

        public List<Vasos> getB() {
            return B;
        }

        public void setB(List<Vasos> b) {
            B = b;
        }

        public List<Vasos> getAi() {
            return Ai;
        }

        public void setAi(List<Vasos> ai) {
            Ai = ai;
        }

        private List<Vasos> A;
        private List<Vasos> B;
        private List<Vasos> Ai;
    }
}
