import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MeuJTextField extends JFormattedTextField {
    private Jogo jogoPai;

    public MeuJTextField(Jogo j) throws ParseException {
        super(new MaskFormatter("##"));
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
            setBackground(new Color(255, 135, 135));
        }
        else {
            setBackground(Color.WHITE);
        }
    }
}
