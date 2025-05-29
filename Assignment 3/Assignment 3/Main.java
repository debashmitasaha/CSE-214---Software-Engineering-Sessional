import java.util.Scanner;

import Observer_Classes.User;
import Observer_Classes.Users;
import Subject.Genre;
import Subject.Desiflix;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Genre thriller = new Genre("Thriller");
        Genre horror = new Genre("Horror");
        Genre comedy = new Genre("Comedy");

        
        Users user = new Users("Debashmita");
        Users user2 = new Users("Nabanita");
        Users user3 = new Users("Swapna");
        Users user4 = new Users("Swadesh");

        thriller.AddSubscriber(user2);
        thriller.AddSubscriber(user3);
        comedy.AddSubscriber(user4);
        comedy.AddSubscriber(user2);
        comedy.AddSubscriber(user3);
        horror.AddSubscriber(user4);

        System.out.println("Welcome to DesiFlix!");

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Add genre to favorites");
            System.out.println("2. Remove genre from favorites");

            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {

                    System.out.print("Enter genre to add (Thriller/Horror/Comedy): ");
                    String genreName = scanner.nextLine().toLowerCase();
                    switch (genreName) {
                        case "Thriller" -> thriller.AddSubscriber(user);
                        case "Horror" -> horror.AddSubscriber(user);
                        case "Comedy" -> comedy.AddSubscriber(user);
                        default -> System.out.println("Invalid genre. Please try again.");
                    }
                }
                case 2 -> {

                    System.out.print("Enter genre to remove (Thriller/Horror/Comedy): ");
                    String genreName = scanner.nextLine().toLowerCase();
                    switch (genreName) {
                        case "Thriller" -> thriller.RemoveSubscriber(user);
                        case "Horror" -> horror.RemoveSubscriber(user);
                        case "Comedy" -> comedy.RemoveSubscriber(user);
                        default -> System.out.println("Invalid genre. Please try again.");
                    }
                }

                case 3 -> {
                    System.out.println("Exiting DesiFlix. Goodbye!");
                    scanner.close();
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("\nReleasing initial movies:");
        thriller.MovieRelease("The Batman");
        thriller.MovieRelease("Feluda");
        horror.MovieRelease("The Conjuring");
        comedy.MovieRelease("Haha");
        thriller.MovieRelease("The Platform");
        horror.MovieRelease("The Ghost");
        comedy.MovieRelease("Funny");
    }
}
