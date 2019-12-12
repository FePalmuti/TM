import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;

public class MeuJTextField extends JFormattedTextField {
    public MeuJTextField() {
        setPreferredSize(new Dimension(40, 20));
        getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                //---
            }
            public void removeUpdate(DocumentEvent e) {
                verificarConteudo();
            }
            public void insertUpdate(DocumentEvent e) {
                verificarConteudo();
            }
        });
        Dados.listaJTF.add(this);
    }

    private void verificarConteudo() {
        if(Dados.listaNumerosSelecionados.contains(getText())) {
            setBackground(new Color(255, 135, 135));
        }
        else {
            setBackground(Color.WHITE);
        }
    }
}
