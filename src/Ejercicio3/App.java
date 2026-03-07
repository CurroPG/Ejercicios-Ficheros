package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("fichero1.txt");
            FileReader fr2 = new FileReader("fichero2.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);

            FileWriter fw = new FileWriter("resultado.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String linea1 = br1.readLine();
            String linea2 = br2.readLine();

            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    bw.write(linea1);
                    bw.newLine();
                    linea1 = br1.readLine();
                }
                if (linea2 != null) {
                    bw.write(linea2);
                    bw.newLine();
                    linea2 = br2.readLine();
                }
            }

            br1.close();
            br2.close();
            bw.close();
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
