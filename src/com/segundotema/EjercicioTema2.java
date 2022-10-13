package com.segundotema;

public class EjercicioTema2 {
    public static void main(String[] args) {

        double precio = productoIva(100000);
        System.out.println(precio);
    }

    static double productoIva(double precio) {
        double precioIva = precio * 0.19;
        return precioIva + precio;

    }
}
