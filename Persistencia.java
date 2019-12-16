import java.io.*;
import java.util.*;

public class Persistencia {
    private static String caminho = "Dados.txt";

    public static ArrayList<String[]> lerDados() {
        ArrayList<String[]> listaVetoresNumeros = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            String linha = leitor.readLine();
            while(linha != null) {
                String vetorNumeros[] = interpretar(linha);
                listaVetoresNumeros.add(vetorNumeros);
                linha = leitor.readLine();
            }
            leitor.close();
        }
        catch(IOException e) {
            System.out.println("Erro na leitura!");
        }
        return listaVetoresNumeros;
    }

    private static String[] interpretar(String linha) {
        String[] numeros = linha.split(", ");
        return numeros;
    }

    public static void salvarDados(ArrayList<String[]> listaVetoresNumeros) {
        try {
            PrintWriter escritor = new PrintWriter(new FileWriter(caminho));
            for(String[] vetorNumeros : listaVetoresNumeros) {
                String linha = "";
                for(int i=0; i<vetorNumeros.length-1; i++) {
                    linha += vetorNumeros[i]+", ";
                }
                linha += vetorNumeros[vetorNumeros.length-1];
                escritor.println(linha);
            }
            escritor.close();
        }
        catch(IOException e) {
            System.out.println("Erro na leitura!");
        }
    }
}
