package Examen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlamencoArchivo {
    public File crearArchivo(){
        return new File("flamenco.txt");
    }

    public void escribirArchivo(File file, String texto){
        try {
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(fr);
            bf.write(texto);
            bf.newLine();
            bf.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerArchivo(File file){
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void borrarArchivo(File file){
        file.delete();
    }
}
