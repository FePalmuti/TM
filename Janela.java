import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Janela extends JFrame {
    public Janela() {
        configurar();
        aoSair();
        setLayout(new GridLayout(2, 1));
        //---
        JPanel painelSuperior = new JPanel(new GridBagLayout());
        add(painelSuperior);
        painelSuperior.add(new TecladoVirtual());
        //---
        JPanel painelInferior = new JPanel(new GridBagLayout());
        add(painelInferior);
        JScrollPane scroll = new JScrollPane(new PainelJogos());
        scroll.setPreferredSize(new Dimension(820, 270));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        painelInferior.add(scroll);
    }

    private void configurar() {
        setSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void aoSair() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int bloco = 0, tam = Dados.todosJTF.size();
                ArrayList<String[]> listaVetoresNumeros = new ArrayList<>();
                while(bloco*15 != tam) {
                    String vetorNumeros[] = new String[15];
                    for(int i=0; i<15; i++) {
                        String numero = Dados.todosJTF.get(bloco*15 + i).getText();
                        if(numero.equals("")) {
                            numero = "-";
                        }
                        vetorNumeros[i] = numero;
                    }
                    listaVetoresNumeros.add(vetorNumeros);
                    bloco++;
                }
                Persistencia.salvarDados(listaVetoresNumeros);
            }
        });
    }
}
