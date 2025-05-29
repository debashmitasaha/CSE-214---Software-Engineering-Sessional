package p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ServiceProducer serviceProducer = new ServiceProducer();
        interestRate absFactory;

        // Prompt user for the service type with numbered options
        System.out.println("Select customer type:");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        int customerChoice = scanner.nextInt();

        // Determine the customer type based on user input
        String customerType = "";
        interestRate service = null;
        switch (customerChoice) {
            case 1:
                customerType = "Regular";
                absFactory = new regularService();
                break;
            case 2:
                customerType = "Premium";
                absFactory = new premiumService();
                break;
            case 3:
                customerType = "VIP";
                absFactory = new vipService();
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
                return;
        }

        ServiceProducer serviceProducer = new ServiceProducer(absFactory);
        // Prompt user for operation type with numbered options
        System.out.println("Select operation type:");
        System.out.println("1. Account");
        System.out.println("2. Loan");
        int operationChoice = scanner.nextInt();

        // Determine the operation type based on user input
        String operationType = "";
        switch (operationChoice) {
            case 1:
                serviceProducer.createService("Account");
                operationType = "Account";
                break;
            case 2:
                serviceProducer.createService("Loan");
                operationType ="Loan";
                break;
            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
                return;
        }

        // Prompt user for principal amount
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt user for the time period in years
        System.out.println("Enter the time period in years: ");
       float time = scanner.nextFloat();

        
        serviceProducer.show(operationType,principal, time);
        scanner.close();  // Close the scanner
    }
}
