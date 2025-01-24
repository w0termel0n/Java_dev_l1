import java.awt.*;
import javax.swing.*;

public class MakingChange {
    public static void main(String[] args) {

        JFrame frame = new JFrame("MakingChange");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().setBackground(Color.PINK);
        frame.getContentPane().add(new RegisterPanel());

        frame.pack();
        frame.setVisible(true);
    }
}