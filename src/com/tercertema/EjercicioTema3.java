package com.tercertema;

public class EjercicioTema3 {
    public static void main(String[] args) {

        String[] nombres = {"Jhon", "alex", "pepe", "juan", "roberto", "martha", "cecilia"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
        for (String nombre : nombres){
            System.out.print( nombre + " ");
        }
    }
}
