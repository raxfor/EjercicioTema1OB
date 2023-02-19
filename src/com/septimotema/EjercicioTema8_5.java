package com.septimotema;

public class EjercicioTema8_5 {
    public static void main(String[] args) {
        try {
            DividePorCero(10, 2);
        }catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }


    }

    public static Integer DividePorCero(int x, int y) throws ArithmeticException {

        int z = x/y;
        return z;
    }
}
