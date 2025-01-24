import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.*;

public class InputPanel extends JPanel {
    private JTextField input;
    private JLabel label;

    public InputPanel() {
        this.setPreferredSize(new Dimension(500, (30 * 13 + 50)));
        this.setOpaque(false);

        input = new JTextField();
        label = new JLabel();
        input.setPreferredSize(new Dimension(300, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        input.setFont(new Font("Monospaced", Font.PLAIN, 12));
        label.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
        input.addActionListener(new Listener());

        this.add(input);
        this.add(label);
    }

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double inp;
            try {
                inp = Double.parseDouble(input.getText());
            } catch(NumberFormatException ex) {
                inp = 0;
            }

            Purse purse = Register.makeChange(inp);
            String[] strs = purse.toStr();
            String finStr = "<html><br>Your change:<br>";

            for (String s : strs) {
                finStr += s + "<br>";
            }
            finStr += "</html>";

            label.setPreferredSize(new Dimension(500, (30 * (strs.length + 2))));
            label.setText(finStr);

            purse.displayPurse();
        }
    }
}
