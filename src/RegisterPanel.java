import java.awt.*;
import javax.swing.*;

public class RegisterPanel extends JPanel {
    public RegisterPanel() {
        InputPanel input = new InputPanel();
        LabelPanel label = new LabelPanel("-~$ Cash Register $~-");

        this.setOpaque(false);
        this.add(label);
        this.add(input);
    }
}
