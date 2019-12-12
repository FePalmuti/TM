import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotaoTeclado extends JButton {
    public BotaoTeclado(String texto) {
        super(texto);
        setBackground(Color.WHITE);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(getBackground() == Color.WHITE) {
                    setBackground(new Color(255, 135, 135));
                    Dados.listaNumerosSelecionados.add(getText());
                    for(MeuJTextField tf : Dados.listaJTF) {
                        if(tf.getText().equals(getText())) {
                            tf.setBackground(new Color(255, 135, 135));
                        }
                    }
                }
                else {
                    setBackground(Color.WHITE);
                    Dados.listaNumerosSelecionados.remove(getText());
                    for(MeuJTextField tf : Dados.listaJTF) {
                        if(tf.getText().equals(getText())) {
                            tf.setBackground(Color.WHITE);
                        }
                    }
                }
            }
        });
    }
}
