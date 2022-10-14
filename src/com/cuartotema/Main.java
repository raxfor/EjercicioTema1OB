package com.cuartotema;

public class Main {
    public static void main(String[] args) {
        SmartDevice asusRog = new SmartPhone("Asus Rog", "Rog 2", "Asus", "snapdragon 8", true, 4000, 200, 128, 8, 6, true, true);

        SmartDevice mi6Band = new SmartWatch("xiaomi MI band 6", "band 6", "xiaomi", "snapdragon 6", false, 125, 100, 2, 4, 2, "Cuero sintetico", true);

        System.out.println(asusRog);
        System.out.println();
        System.out.println(mi6Band);

    }
}
