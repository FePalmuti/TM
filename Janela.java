import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela() {
        configurar();
        setLayout(new GridLayout(2, 1));
        //---
        JPanel painelSuperior = new JPanel();
        add(painelSuperior);
        painelSuperior.add(new TecladoVirtual());
        //---
        JPanel painelInferior = new JPanel();
        add(painelInferior);
        painelInferior.add(new PainelJogos());
    }

    private void configurar() {
        setSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
