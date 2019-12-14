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
                    for(MeuJTextField tf : Dados.todosJTF) {
                        if(Util.removeZerosEsquerda(tf.getText()).equals(getText())) {
                            tf.setBackground(new Color(255, 135, 135));
                            tf.getJogoPai().atualizarSoma();
                        }
                    }
                }
                else {
                    setBackground(Color.WHITE);
                    Dados.listaNumerosSelecionados.remove(getText());
                    for(MeuJTextField tf : Dados.todosJTF) {
                        if(Util.removeZerosEsquerda(tf.getText()).equals(getText())) {
                            tf.setBackground(Color.WHITE);
                            tf.getJogoPai().atualizarSoma();
                        }
                    }
                }
            }
        });
    }
}
