package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    static boolean esPrimo(int numero){
        if(numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 1; i <= 500; i++) {
                if(esPrimo(i)){
                    bw.write("" + i);
                    bw.newLine();
                }
            }
            bw.close(); 
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
