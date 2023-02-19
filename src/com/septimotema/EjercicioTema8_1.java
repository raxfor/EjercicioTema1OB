package com.septimotema;

public class EjercicioTema8_1 {
    public static void main(String[] args) {
        int numeros [][] = {
                {1},
                {2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println( "Posiciones: " + j + " " + "valor: " + numeros[i][j]);

            }
        }

    }
}
