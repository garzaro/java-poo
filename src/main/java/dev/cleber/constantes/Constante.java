package dev.cleber.constantes;

import java.util.List;

public class Constante {

    public static final float VALOR_PI = 3.14f;

    public static final List lista = List.of(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {

        System.out.println("O valor de PI é estatico e nunca muda - " + VALOR_PI + " , trata-se de uma constante");
        System.out.println(lista);

    }
}
