import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;

public class MeuJTextField extends JFormattedTextField {
    private Jogo jogoPai;

    public MeuJTextField(Jogo j, String numero) {
        super(numero);
        jogoPai = j;
        setPreferredSize(new Dimension(40, 20));
        getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                //---
            }
            public void removeUpdate(DocumentEvent e) {
                atualizarCor();
                jogoPai.atualizarSoma();
            }
            public void insertUpdate(DocumentEvent e) {
                atualizarCor();
                jogoPai.atualizarSoma();
            }
        });
        Dados.todosJTF.add(this);
    }

    public Jogo getJogoPai() {
        return jogoPai;
    }

    private void atualizarCor() {
        if(Dados.listaNumerosSelecionados.contains(Util.removeZerosEsquerda(getText()))) {
            setBackground(Constantes.COR_ACERTO);
        }
        else {
            setBackground(Color.WHITE);
        }
    }
}
