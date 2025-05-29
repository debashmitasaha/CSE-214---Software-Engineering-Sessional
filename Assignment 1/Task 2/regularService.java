package p2;

public class regularService implements interestRate{
    
    @Override
    public account createAccount() {
        // TODO Auto-generated method stub
        return new regularAccount();
    }
    @Override
    public loan giveLoan() {
        // TODO Auto-generated method stub
        return new regularLoan();
    }
    public String getType() {
        return "You are receiving Regualar Service";
    }
    
}
