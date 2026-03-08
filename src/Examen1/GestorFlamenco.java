package Examen1;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorFlamenco extends FlamencoArchivo {
    private ArrayList<String> frases = new ArrayList<>();
    private HashMap<Integer, String> mapaFrases = new HashMap<>();

    public void añadirFrase(String frase) {
        int id = mapaFrases.size();
        mapaFrases.put(id, frase);
        this.frases.add(frase);
        escribirArchivo(crearArchivo(), id + " - " + frase);
    }

    public String recuperarFrase(int id) {
        return mapaFrases.get(id);
    }

    public void listarFrases() {
        for (Integer id : mapaFrases.keySet()) {
            System.out.println(id + ". " + mapaFrases.get(id));
        }
    }
}