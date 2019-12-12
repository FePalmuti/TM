import javax.swing.*;
import java.awt.*;

public class Jogo extends JPanel {
    public Jogo() {
        setPreferredSize(new Dimension(700, 30));
        for(int i=0; i<15; i++) {
            add(new MeuJTextField());
        }
    }
}
