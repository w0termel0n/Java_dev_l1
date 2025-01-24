import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel {
    public ImagePanel(String imagePath) {
        this.setPreferredSize(new Dimension(100, 100));
        this.setOpaque(false);

        JLabel imageLabel = new JLabel();
        imageLabel.setOpaque(false);

        this.add(imageLabel);

        ImageIcon img = new ImageIcon(imagePath);
        imageLabel.setIcon(img);
    }
}
