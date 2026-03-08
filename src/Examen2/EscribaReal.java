package Examen2;

import java.util.ArrayList;
import java.util.HashMap;

public class EscribaReal extends CodiceEncantado{
    private ArrayList<String> relatosPendientes = new ArrayList<>();
    private HashMap<Integer, String> mapaRelatos = new HashMap<>();

    public void añadirRelato(String relato){
        relatosPendientes.add(relato);
        int id = mapaRelatos.size();
        mapaRelatos.put(id, relato);
    }

    public void listarRelatos(){
        for (Integer id : mapaRelatos.keySet()) {
            System.out.println(id+". "+mapaRelatos.get(id));
        }
    }

    public void guardarRelatosEnCodice(){
        for (String relato : relatosPendientes) {
            escribirRelato(relato);
        }
    }
}
