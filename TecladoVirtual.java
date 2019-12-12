import javax.swing.*;
import java.awt.*;

public class TecladoVirtual extends JPanel {
    public TecladoVirtual() {
        setPreferredSize(new Dimension(270, 270));
        setLayout(new GridLayout(5, 5));
        for(int i=0; i<5; i++) {
            for(int j=1; j<=5; j++) {
                String id = Integer.toString(5*i + j);
                add(new BotaoTeclado(id));
            }
        }
    }
}
