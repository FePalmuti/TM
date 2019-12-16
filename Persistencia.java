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
        }
        catch(IOException e) {
            System.out.println("Erro na leitura!");
        }
        return listaVetoresNumeros;
    }

    public static String[] interpretar(String linha) {
        String[] numeros = linha.split(", ");
        return numeros;
    }
}
