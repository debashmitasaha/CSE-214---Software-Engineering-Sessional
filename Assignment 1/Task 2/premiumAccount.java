package p2;

public class premiumAccount implements account {
    private static final double INTEREST_RATE = 3.5;
    
    @Override
    public double total_interest(double principal, float time) {
        return (principal * INTEREST_RATE * time) / 100;  // Simple interest formula
    }
}
