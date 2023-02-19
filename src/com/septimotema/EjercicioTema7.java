package com.septimotema;

public class EjercicioTema7 {
    public static void main(String[] args) {
        System.out.println(reverse("hola Mundo"));
    }

    public static String reverse(String texto) {
        String invertida = "";
        for (int i = texto.length()-1; i >= 0; i--){
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    }