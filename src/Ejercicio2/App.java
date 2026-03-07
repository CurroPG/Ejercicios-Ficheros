package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Users/Curro_/programacion/dev/java/Ejercicios-Ficheros/src/primos.dat");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
