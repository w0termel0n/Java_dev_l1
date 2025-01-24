import java.awt.*;
import javax.swing.*;

public class LabelPanel extends JPanel {
    public LabelPanel(String text) {
        this.setPreferredSize(new Dimension(800, 50));
        this.setOpaque(false);

        JLabel label = new JLabel(text);
        label.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
        label.setForeground(Color.BLUE);

        this.add(label);
    }
}