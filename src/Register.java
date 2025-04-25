public class Register {
    private ChangeStrategy strategy;

    public Register(ChangeStrategy strategy) {
        this.strategy = strategy;
    }

    public Purse makeChange(double amount) {
        return strategy.makeChange(amount);
    }
}