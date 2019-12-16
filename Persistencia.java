import java.io.*;
import java.util.*;

public class Persistencia {
    private static String caminho = "Dados.txt";

    public static ArrayList<Jogo> lerDados(PainelJogos pj) {
        ArrayList<Jogo> listaJogos = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminho));
            String linha = leitor.readLine();
            while(linha != null) {
                Jogo j = interpretar(linha, pj);
                listaJogos.add(j);
                linha = leitor.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro na leitura!");
        }
        return listaJogos;
    }

    public static Jogo interpretar(String linha, PainelJogos pj) {
        String[] numeros = linha.split(", ");
        return new Jogo(pj, numeros);
    }
}
