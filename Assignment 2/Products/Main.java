package Products;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.createBasicMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to create a combo, 2 to view menu and 0 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter the name of the combo: ");
                String comboName = scanner.nextLine();
                Container_Combo customCombo = new Container_Combo(comboName);

                while (true) {
                    System.out.println("Available commands:");
                    System.out.println("Add [item], Remove [item], Free [item], Discount [percentage], Done");
                    String command = scanner.nextLine();
                    String[] parts = command.split(" ", 2);

                    if (parts[0].equalsIgnoreCase("Add")) {
                        Product item = menu.getProduct(parts[1]);
                        if (item != null) {
                            customCombo.addFood(item);
                            System.out.println(parts[1] + " added to " + comboName);
                        } else {
                            System.out.println("Item not found");
                        }
                    } else if (parts[0].equalsIgnoreCase("Remove")) {
                        Product item = menu.getProduct(parts[1]);
                        if (item != null) {
                            customCombo.removeFood(item);
                            System.out.println(parts[1] + " removed from " + comboName);
                        } else {
                            System.out.println("Item not found in combo");
                        }
                    } else if (parts[0].equalsIgnoreCase("Free")) {
                        Product item = menu.getProduct(parts[1]);
                        if (item instanceof FoodItem) {
                            customCombo.addFreeFood(item);
                            System.out.println(parts[1] + " is now free in " + comboName);
                        } else {
                            System.out.println("Item not found or cannot be set free");
                        }
                    } else if (parts[0].equalsIgnoreCase("Discount")) {
                        int discount = Integer.parseInt(parts[1]);
                        customCombo.setDiscount(discount);
                        System.out.println("Discount of " + discount + "% applied to " + comboName);
                    } else if (parts[0].equalsIgnoreCase("Done")) {
                        menu.addFoodtoMenu(customCombo);
                        System.out.println(comboName + " created and added to the menu");
                        System.out.println();
                        // Display the final combo in the hierarchical format as requested
                        // customCombo.showDetails();
                        menu.showMenu2();
                        break;
                    } else {
                        System.out.println("Invalid command");
                    }
                }
            } else if (choice == 2) {
                menu.showMenu();
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
