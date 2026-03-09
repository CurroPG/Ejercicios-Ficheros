package Examen6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DiarioMagico {
    private int numEntradas;

    public int getNumEntradas() {
        return numEntradas;
    }

    public DiarioMagico() {
    File fichero = new File("diario.txt");
    if (fichero.exists()) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            while (br.readLine() != null) {
                numEntradas++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al inicializar: " + e.getMessage());
        }
    }
}

    public File crearDiario(){
        File file = new File("diario.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return file;
    }

    public void escribirEntrada(String entrada){
        try {
            FileWriter fw = new FileWriter(crearDiario(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(entrada);  
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerDiario(){
        try {
            FileReader fr = new FileReader(crearDiario());
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("Elara ha escrito "+getNumEntradas()+" entradas en su diario mágico.");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarEntrada(int indice, String nuevaEntrada){
        ArrayList<String> entradas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(crearDiario()));
            String linea;
            while ((linea = br.readLine()) != null) {
                entradas.add(linea);
            }
            entradas.set(indice, nuevaEntrada);
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(crearDiario(), false));
            for (String entrada : entradas) {
                bw.write(entrada);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarEntradas(int indice){
        ArrayList<String> entradas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(crearDiario()));
            String linea;
            while ((linea = br.readLine()) != null) {
                entradas.add(linea);
            }
            entradas.remove(indice);
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(crearDiario(), false));
            for (String entrada : entradas) {
                bw.write(entrada);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
