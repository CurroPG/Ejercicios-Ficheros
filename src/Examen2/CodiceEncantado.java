package Examen2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CodiceEncantado {
    private int numeroRelatos;
    private File file;

    public void crearCodice(){
        this.file = new File("codice.txt");
    }

    public void escribirRelato(String relato){
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(relato);
            numeroRelatos++;
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerCodice(){
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            System.out.println("Oh, viajero, este códice contiene "+getNumeroRelatos()+" relatos de antaño.");
            while((linea=br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }       

    public int getNumeroRelatos() {
        return numeroRelatos;
    }

    public void borrarCodice(){
        String opcion = System.console().readLine("De verdad desea borrar el códice? (s/n) ");
        if(opcion.equals("s"))
            file.delete();
        else
            System.out.println("Operación cancelada, no se borrará nada.");
    }
}
