import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.ParseException;

public class Jogo extends JPanel {
    private ArrayList<MeuJTextField> listaJTF = new ArrayList<>();
    private JLabel labelSoma;

    public Jogo() {
        setPreferredSize(new Dimension(770, 30));
        for(int i=0; i<15; i++) {
            try {
                MeuJTextField labelNumero = new MeuJTextField(this);
                listaJTF.add(labelNumero);
                add(labelNumero);
            }
            catch(ParseException e) {
                System.out.println("Erro na mascara!");
            }
        }
        add(new JLabel(" --->"));
        labelSoma = new JLabel("0");
        add(labelSoma);
    }

    public void atualizarSoma() {
        int soma = 0;
        for(MeuJTextField mtf : listaJTF) {
            if(mtf.getBackground().equals(new Color(255, 135, 135))) {
                soma += 1;
            }
        }
        labelSoma.setText(Integer.toString(soma));
    }
}
