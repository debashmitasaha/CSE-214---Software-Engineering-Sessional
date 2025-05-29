package p2;

public class ServiceProducer {
    // gives loan or account according to customer demand
    interestRate absFactory;
    loan l;
    account acc;

    public ServiceProducer(interestRate absFactory) {
        this.absFactory = absFactory;
    }

    public void createService(String serviceType) {
        if (serviceType.equalsIgnoreCase("Account")) {
            this.acc = absFactory.createAccount();
        } else if (serviceType.equalsIgnoreCase("Loan")) {
            this.l = absFactory.giveLoan();
        }
    }

    public double getValue(double principal, float time) {
        if (serviceType.equalsIgnoreCase("Account")) {
            return acc.total_interest(principal, time);
        } else if (serviceType.equalsIgnoreCase("Loan")) {
            return l.total_interest(principal, time);
        }
    }

    public void show(String serviceType,double principal, float time) {
        if (serviceType.equalsIgnoreCase("Account")) {
            String str = absFactory.getType();
            System.out.println(str);
            System.out.println("You want to open an account");
            System.out.println("Total amount: "+acc.total_interest(principal, time));
        } else if (serviceType.equalsIgnoreCase("Loan")) {
            String str = absFactory.getType();
            System.out.println(str);
            System.out.println("You want to take loan");
            System.out.println("Total amount to pay: "+l.total_interest(principal, time));
        }
    }

}
