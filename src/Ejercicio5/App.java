package Ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("hola.java");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("hola2.java");
            BufferedWriter bw = new BufferedWriter(fw);
            boolean dentroComentarioBloque = false;
            String linea;
            while ((linea = br.readLine()) != null) {
                if (dentroComentarioBloque) {
                    if (linea.contains("*/")) {
                        linea = linea.substring(linea.indexOf("*/") + 2);
                        dentroComentarioBloque = false;
                    } else {
                        continue; // línea entera es comentario de bloque
                    }
                }

                // Comentario de bloque que abre en esta línea
                if (linea.contains("/*")) {
                    if (linea.contains("*/")) {
                        // El bloque abre y cierra en la misma línea
                        linea = linea.substring(0, linea.indexOf("/*"))
                                + linea.substring(linea.indexOf("*/") + 2);
                    } else {
                        // El bloque abre pero no cierra → continúa en siguientes líneas
                        linea = linea.substring(0, linea.indexOf("/*"));
                        dentroComentarioBloque = true;
                    }
                }

                // Comentario de línea //
                if (linea.contains("//")) {
                    linea = linea.substring(0, linea.indexOf("//"));
                }

                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
