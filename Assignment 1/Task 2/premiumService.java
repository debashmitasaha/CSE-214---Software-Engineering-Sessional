package p2;

public class premiumService implements interestRate {
    @Override
    public account createAccount() {
        // TODO Auto-generated method stub
        return new premiumAccount();
    }
    @Override
    public loan giveLoan() {
        // TODO Auto-generated method stub
        return new premiumLoan();
    }
    public String getType() {
        return "You are receiving Premium Service";
    }
}
