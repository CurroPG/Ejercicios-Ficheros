package Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int contador = 0;
            String palabra = System.console().readLine("introduzca la palabra a contar: ");
            while((linea = br.readLine()) != null){
                String[] palabras = linea.split(" ");
                for (String p : palabras) {
                    if (p.equals(palabra))
                        contador++;
                }
            }
            System.out.println("la palabra "+palabra+" a salido "+contador+" veces");
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
