import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PainelJogos extends JPanel {
    private ArrayList<Jogo> listaJogos = new ArrayList<>();
    private JButton botaoAdicionar;

    public PainelJogos() {
        setPreferredSize(new Dimension(820, 270));
        setBackground(Constantes.COR_CONTAINER);
        botaoAdicionar = new JButton("ADICIONAR");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeAll();
                for(Jogo j : listaJogos) {
                    add(j);
                }
                Jogo novoJogo = new Jogo();
                listaJogos.add(novoJogo);
                add(novoJogo);
                add(botaoAdicionar);
                revalidate();
                repaint();
            }
        });
        add(botaoAdicionar);
    }
}
