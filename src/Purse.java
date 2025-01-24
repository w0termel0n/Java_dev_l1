import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Purse {
    Map<Money.Denomination, Integer> cash;

    public Purse() {
        cash = new HashMap<>();
    }

    public void add(Money.Denomination mon, int num) {
        if(cash.containsKey(mon)) {
            cash.put(mon, cash.get(mon) + num);
        } else {
            cash.put(mon, num);
        }
    }

    public double rem(Money.Denomination mon, int num) {
        if(cash.containsKey(mon) && cash.get(mon) >= num) {
            cash.put(mon, cash.get(mon) - num);
            return cash.get(mon.amt());
        }
        return 0;
    }

    public double getValue() {
        double total = 0;

        for(Map.Entry<Money.Denomination,Integer> entry : cash.entrySet()) {
            total += entry.getKey().amt() * entry.getValue();
        }

        return total;
    }

    public int getAmt() {
        int total = 0;

        for(Map.Entry<Money.Denomination,Integer> entry : cash.entrySet()) {
            total += entry.getValue();
        }

        return total;
    }

    public void displayPurse() {
        JFrame frame2 = new JFrame("Purse Contents:");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();

        if(getAmt() <= 25) {
            //System.out.println(getAmt());
            panel.setPreferredSize(new Dimension(540, (((int) (getAmt() / 5.0 - 0.01)) + 1) * 100 + 10));
        } else {
            panel.setPreferredSize(new Dimension(1080, (((int) (getAmt() / 10.0 - 0.01)) + 1) * 100 + 10));
        }
        frame2.getContentPane().setBackground(Color.PINK);
        panel.setOpaque(false);
        frame2.getContentPane().add(panel);

        for(Map.Entry<Money.Denomination,Integer> entry : cash.entrySet()) {
            for(int i = 0; i < entry.getValue(); i++) {
                panel.add(new ImagePanel(entry.getKey().img()));
            }
        }

        frame2.pack();
        frame2.setVisible(true);
    }

    public String[] toStr() {
        String[] str = new String[cash.size()];

        int i = 0;
        for(Map.Entry<Money.Denomination,Integer> entry : cash.entrySet()) {
            str[i] = entry.getKey().name() + " " + Integer.toString((int)(entry.getValue())) + "x";
            i++;
        }

        return str;
    }
}
