package com.figurasgeometricas.dominio;

import java.util.Random;

public class FabricaForma {
    private Random random = new Random();
    public enum Tipo {
        CIRCULO, CUADRADO, TRIANGULO;
    }

    public static Forma crearForma(Tipo tipo) {
        Forma forma = null;
        switch (tipo) {
        case CIRCULO:
            forma = new Circulo();
            break;
        case CUADRADO:
            forma = new Cuadrado();
            break;
        case TRIANGULO:
            forma = new Triangulo();
        }
        return forma;
    }
}