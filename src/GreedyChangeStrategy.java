public class GreedyChangeStrategy implements ChangeStrategy {
    @Override
    public Purse makeChange(double amt) {
        Purse purse = new Purse();
        double tempAmt = amt;

        double[] denominations = {1000, 100, 50, 20, 10, 5, 1, 0.25, 0.10, 0.05, 0.01};

        for (double value : denominations) {
            if (tempAmt / value >= 1) {
                int count = (int) (tempAmt / value);
                purse.add(MoneyFactory.getDenomination(value), count);
                tempAmt %= value;
                tempAmt = Math.round(tempAmt * 100.0) / 100.0;
            }
        }
        return purse;
    }
}