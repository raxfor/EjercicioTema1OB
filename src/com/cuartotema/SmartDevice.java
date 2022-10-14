package com.cuartotema;

public class SmartDevice {
    String nombre;
    String modelo;
    String fabricante;
    String procesador;
    boolean camara;
    int bateria;
    int peso;
    int almancenamiento;
    int ram;
    double pantalla;


    public SmartDevice() {

    }

    public SmartDevice(String nombre, String modelo, String fabricante, String procesador, boolean camara, int bateria, int peso, int almancenamiento, int ram, double pantalla) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.procesador = procesador;
        this.camara = camara;
        this.bateria = bateria;
        this.peso = peso;
        this.almancenamiento = almancenamiento;
        this.ram = ram;
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", procesador='" + procesador + '\'' +
                ", camara=" + camara +
                ", bateria=" + bateria +
                ", peso=" + peso +
                ", almancenamiento=" + almancenamiento +
                ", ram=" + ram +
                ", pantalla=" + pantalla +
                '}';
    }
}
