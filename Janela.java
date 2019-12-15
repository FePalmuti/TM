import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela() {
        configurar();
        setLayout(new GridLayout(2, 1));
        //---
        JPanel painelSuperior = new JPanel(new GridBagLayout());
        add(painelSuperior);
        painelSuperior.add(new TecladoVirtual());
        //---
        JPanel painelInferior = new JPanel(new GridBagLayout());
        add(painelInferior);
        JScrollPane scroll = new JScrollPane(new PainelJogos());
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelInferior.add(scroll);
    }

    private void configurar() {
        setSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
