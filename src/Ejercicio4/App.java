package Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("palabras.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("palabras_sort.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            ArrayList<String> palabras = new ArrayList<>();
            String linea;
            while((linea = br.readLine()) != null){
                palabras.add(linea);
            }
            Collections.sort(palabras);
            for (String p : palabras) {
                bw.write(p);
                bw.newLine();
            }
            bw.close();
            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
