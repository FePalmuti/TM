import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PainelJogos extends JPanel {
    private ArrayList<Jogo> listaJogos = new ArrayList<>();
    private JButton botaoAdicionar;

    public PainelJogos() {
        PainelJogos self = this;
        setLayout(new WrapLayout());
        setBackground(Constantes.COR_CONTAINER);
        botaoAdicionar = new JButton("ADICIONAR");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogo novoJogo = new Jogo(self);
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
