package Examen3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(
                    "C:/Users/Curro_/programacion/dev/java/Ejercicios-Ficheros/src/Examen3/Registros.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("procesado.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;
            int contadorRegistros = 0;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                int edad = Integer.parseInt(partes[2].replace("Edad:", "").trim());

                if ((linea.contains("Madrid") || linea.contains("Barcelona")) && edad >= 18) {
                    System.out.println(linea);
                    contadorRegistros++;
                    bw.write(linea);
                    bw.newLine();
                }
            }
            System.out.println("Total de registros procesados: " + contadorRegistros);
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
