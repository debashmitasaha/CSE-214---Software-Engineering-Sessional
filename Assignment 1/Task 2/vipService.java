package p2;

public class vipService implements interestRate {
    
    @Override
    public loan giveLoan() {
        // TODO Auto-generated method stub
        return new vipLoan();
    }
    @Override
    public account createAccount() {
        // TODO Auto-generated method stub
        return new vipAccount();
    }
    public String getType() {
        return "You are receiving VIP Service";
    }
}
