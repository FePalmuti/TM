import javax.swing.*;
import java.awt.*;

public class PainelJogos extends JPanel {
    public PainelJogos() {
        setPreferredSize(new Dimension(820, 270));
        setBackground(Constantes.COR_CONTAINER);
        add(new Jogo());
        add(new Jogo());
    }
}
