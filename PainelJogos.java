import javax.swing.*;
import java.awt.*;

public class PainelJogos extends JPanel {
    public PainelJogos() {
        setPreferredSize(new Dimension(780, 270));
        setBackground(Color.RED);
        add(new Jogo());
        add(new Jogo());
    }
}
