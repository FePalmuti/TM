import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PainelJogos extends JPanel {
    private ArrayList<Jogo> listaJogos = new ArrayList<>();
    private JButton botaoAdicionar;

    public PainelJogos() {
        PainelJogos self = this;
        // Leitura de dados persistentes
        //---
        ArrayList<String[]> listaVetoresNumeros = Persistencia.lerDados();
        //---
        setLayout(new WrapLayout());
        setBackground(Constantes.COR_CONTAINER);
        botaoAdicionar = new JButton("ADICIONAR");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogo novoJogo = new Jogo(self, null);
                listaJogos.add(novoJogo);
                atualizar();
            }
        });
        //---
        for(String[] vetorNumeros : listaVetoresNumeros) {
            Jogo novoJogo = new Jogo(this, vetorNumeros);
            listaJogos.add(novoJogo);
            atualizar();
        }
    }

    public void atualizar() {
        removeAll();
        for(Jogo j : listaJogos) {
            add(j);
        }
        add(botaoAdicionar);
        revalidate();
        repaint();
    }

    public void excluirJogo(Jogo j) {
        listaJogos.remove(j);
        atualizar();
    }
}
