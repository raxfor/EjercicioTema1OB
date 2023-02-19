package com.septimotema;
import java.io.*;
public class EjercicioTema8_6 {

    public static void main(String[] args) {
        String fileIn = "D:\\Java\\EjercicioTema1OB\\src\\com\\septimotema\\archivoEntrada.txt";
        String fileOut = "D:\\Java\\EjercicioTema1OB\\src\\com\\septimotema\\archivoSalida.txt";
        try {
            copyFile(fileIn, fileOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void copyFile(String fileIn, String fileOut) throws IOException {
        // Creamos un objeto File para el archivo de entrada y otro para el archivo de salida
        File inFile = new File(fileIn);
        File outFile = new File(fileOut);

        // Creamos un InputStream para el archivo de entrada y un PrintStream para el archivo de salida
        InputStream in = new FileInputStream(inFile);
        PrintStream out = new PrintStream(outFile);

        // Leemos los datos del archivo de entrada y los escribimos en el archivo de salida
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }

        // Cerramos los streams
        in.close();
        out.close();
    }
}
