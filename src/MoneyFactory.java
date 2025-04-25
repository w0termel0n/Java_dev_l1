// implements the factory pattern

public class MoneyFactory {
    public static Money.Denomination getDenomination(double amt) {
        for (Money.Denomination d : Money.money) {
            if (Double.compare(d.amt(), amt) == 0) {
                return d;
            }
        }
        throw new IllegalArgumentException("Invalid denomination amount: " + amt);
    }
}