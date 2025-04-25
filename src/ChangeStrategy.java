// implements the strategy pattern

public interface ChangeStrategy {
    Purse makeChange(double amount);
}