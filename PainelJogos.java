import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PainelJogos extends JPanel {
    private ArrayList<Jogo> listaJogos = new ArrayList<>();
    private JButton botaoAdicionar;

    public PainelJogos() {
        PainelJogos self = this;
        // Leitura dos dados persistentes
        //---
        ArrayList<Jogo> listaJogos = Persistencia.lerDados(this);
        //---
        setLayout(new WrapLayout());
        setBackground(Constantes.COR_CONTAINER);
        // Insercao jogos persistentes
        //---
/*        for(Jogo j : listaJogos) {
            listaJogos.add(j);
            atualizar();
        }*/
        //---
        botaoAdicionar = new JButton("ADICIONAR");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogo novoJogo = new Jogo(self, null);
                listaJogos.add(novoJogo);
                atualizar();
            }
        });
        add(botaoAdicionar);
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
