package p2;

public class vipAccount implements account {
    private static final double INTEREST_RATE = 5.0; 

    @Override
    public double total_interest(double principal, float time) {
        return (principal * INTEREST_RATE * time) / 100;  // Simple interest formula
    }
}
