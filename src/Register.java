import java.util.*;

public class Register {
    public static Purse makeChange(double amt) {
        Purse purse = new Purse();
        double tempAmt = amt;

        if(tempAmt/1000 >= 1) {
            purse.add(findDeno(1000), (int) (tempAmt / 1000));
            tempAmt %= 1000;
        }
        if(tempAmt/100 >= 1) {
            purse.add(findDeno(100), (int) (tempAmt / 100));
            tempAmt %= 100;
        }
        if(tempAmt/50 >= 1) {
            purse.add(findDeno(50), (int) (tempAmt / 50));
            tempAmt %= 50;
        }
        if(tempAmt/20 >= 1) {
            purse.add(findDeno(20), (int) (tempAmt / 20));
            tempAmt %= 20;
        }
        if(tempAmt/10 >= 1) {
            purse.add(findDeno(10), (int) (tempAmt / 10));
            tempAmt %= 10;
        }
        if(tempAmt/5 >= 1) {
            purse.add(findDeno(5), (int) (tempAmt / 5));
            tempAmt %= 5;
        }
        if(tempAmt >= 1) {
            purse.add(findDeno(1), (int) tempAmt);
            tempAmt %= 1;
        }
        if(tempAmt/.25 >= 1) {
            purse.add(findDeno(.25), (int) (tempAmt / .25));
            tempAmt %= .25;
        }
        if(tempAmt/.1 >= 1) {
            purse.add(findDeno(.1), (int) (tempAmt / .1));
            tempAmt %= .1;
        }
        if(tempAmt/.05 >= 1) {
            purse.add(findDeno(.05), (int) (tempAmt / .05));
            tempAmt %= .05;
        }
        tempAmt = (double)Math.round(tempAmt * 100d) / 100d;
        //System.out.println(tempAmt);
        if(tempAmt/.01 >= 1) {
            purse.add(findDeno(.01), (int) (tempAmt / .01));
        }

        return purse;
    }

    private static Money.Denomination findDeno(double amt) {
        Money.Denomination mon;

        for(int i = 0; i < Money.money.length; i++) {
            mon = Money.money[i];
            if(mon.amt() == amt) {
                return mon;
            }
        }
        return null;
    }
}
