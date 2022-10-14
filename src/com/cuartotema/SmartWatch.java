package com.cuartotema;

public class SmartWatch extends SmartDevice {
    String tipoCorrea;
    boolean incluyeProtectorPantalla;

    public SmartWatch() {

    }

    public SmartWatch(String nombre, String modelo, String fabricante, String procesador, boolean camara, int bateria, int peso, int almancenamiento, int ram, float pantalla, String tipoCorrea, boolean incluyeProtectorPantalla) {
        super(nombre, modelo, fabricante, procesador, camara, bateria, peso, almancenamiento, ram, pantalla);
        this.tipoCorrea = tipoCorrea;
        this.incluyeProtectorPantalla = incluyeProtectorPantalla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoCorrea='" + tipoCorrea + '\'' +
                ", incluyeProtectorPantalla=" + incluyeProtectorPantalla +
                ", nombre='" + nombre + '\'' +
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
