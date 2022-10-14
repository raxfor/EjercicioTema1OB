package com.cuartotema;

public class SmartPhone extends SmartDevice{
    boolean incluyeAudifonos;
    boolean incluyeProtector;

    public SmartPhone() {

    }

    public SmartPhone(String nombre, String modelo, String fabricante, String procesador, boolean camara, int bateria, int peso, int almancenamiento, int ram, float pantalla, boolean incluyeAudifonos, boolean incluyeProtector) {
        super(nombre, modelo, fabricante, procesador, camara, bateria, peso, almancenamiento, ram, pantalla);
        this.incluyeAudifonos = incluyeAudifonos;
        this.incluyeProtector = incluyeProtector;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "incluyeAudifonos=" + incluyeAudifonos +
                ", incluyeProtector=" + incluyeProtector +
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
