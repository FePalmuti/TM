import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Jogo extends JPanel {
    private ArrayList<MeuJTextField> listaJTF = new ArrayList<>();
    private JLabel labelSoma;
    private PainelJogos painelPai;

    public Jogo(PainelJogos pj, String[] numeros) {
        Jogo self = this;
        painelPai = pj;
        setPreferredSize(new Dimension(800, 40));
        //---
        if(numeros != null) {
            for(int i=0; i<15; i++) {
                MeuJTextField campoNumero = new MeuJTextField(this);
                listaJTF.add(campoNumero);
                add(campoNumero);
//                campoNumero.setText(numeros[i]);
            }
        }
        else {
            for(int i=0; i<15; i++) {
                MeuJTextField campoNumero = new MeuJTextField(this);
                listaJTF.add(campoNumero);
                add(campoNumero);
            }
        }
        //---
        add(new JLabel(" --->"));
        labelSoma = new JLabel("0");
        add(labelSoma);
        add(new JLabel("   "));
        //---
        JButton botaoExcluir = new JButton("x");
        botaoExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelPai.excluirJogo(self);
            }
        });
        add(botaoExcluir);
    }

    public void atualizarSoma() {
        int soma = 0;
        for(MeuJTextField mtf : listaJTF) {
            if(mtf.getBackground().equals(Constantes.COR_ACERTO)) {
                soma += 1;
            }
        }
        labelSoma.setText(Integer.toString(soma));
    }
}
