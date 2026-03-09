package Examen6;

import java.util.ArrayList;
import java.util.HashMap;

public class AprendizHechicera extends DiarioMagico{
    ArrayList<String> entradas = new ArrayList<>();
    HashMap<Integer, String> mapaEntradas = new HashMap<>();

    public void añadirEntrada(String entrada){
        entradas.add(entrada);
        int id = mapaEntradas.size() + 1;
        mapaEntradas.put(id, entrada);
    }

    public void listarEntradas(){
        for (int i = 1; i <= mapaEntradas.size(); i++) {
        System.out.println(i + ". " + mapaEntradas.get(i));
    }
    }

    public void guardarEntradasenDiario(){
        for (String entrada : entradas) {
            escribirEntrada(entrada);
        }
        entradas.clear();
        mapaEntradas.clear();
    }
}
