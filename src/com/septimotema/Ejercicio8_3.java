package com.septimotema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ejercicio8_3 {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Pera", "Fresa", "Mora", "Uva"));


    LinkedList<String> listFruit = new LinkedList<String>(listaFrutas);

    for(String list : listaFrutas) {
        System.out.println("Contenido de listaFrutas: " + list);
    }

    for (String list1: listFruit) {
        System.out.println("Contenido de listFruit: " + list1);
}

    }
}
