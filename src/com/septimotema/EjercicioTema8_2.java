package com.septimotema;


import java.util.Vector;

public class EjercicioTema8_2 {
    public static void main(String[] args) {
        Vector<Integer> vecNumeros = new Vector();
        vecNumeros.add(1);
        vecNumeros.add(2);
        vecNumeros.add(3);
        vecNumeros.add(4);
        vecNumeros.add(5);
        vecNumeros.remove(1);
        vecNumeros.remove(2);

        System.out.println("valores del vector " + vecNumeros);

    }


}
