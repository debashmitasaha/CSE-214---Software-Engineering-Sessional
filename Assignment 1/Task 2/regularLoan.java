package p2;

public class regularLoan implements loan {
    private static final double INTEREST_RATE = 14.0;  // Interest rate for regular loans

    @Override
    public double total_interest(double principal, float time) {
        return (principal * INTEREST_RATE * time) / 100;  // Simple interest formula
    }
    
}
