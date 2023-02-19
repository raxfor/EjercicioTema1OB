package com.septimotema;

import java.util.ArrayList;

//6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
public class EjercicioTema8_4 {
    public static void main(String[] args) {
        //Creacion del arrayList de numeros
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        //Agregando los numeros del 1 al 10 con un bucle for convencional
        for (int i = 0; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        //Eliminando los numeros que sean pares del arrayList de numeros
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
                i--;
            }
        }

        System.out.println(numeros);


    }
}
