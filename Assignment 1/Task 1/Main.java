import java.util.Scanner;

import Builder1.Builder;
import Builder1.Director;
import Builder1.TicketingSystem;
import Builder1.TicketingSystemBuilder;
import InternetConnection.InternetConnection;
import InternetFactory.EthernetFactory;
import InternetFactory.GSMFactory;
import InternetFactory.Internetfactory;
import InternetFactory.WifiFactory;
import PackageFactory.Advanced_PackageFactory;
import PackageFactory.Basic_PackageFactory;
import PackageFactory.PackageFactory;
import PackageFactory.Premium_PackageFactory;
import PackageFactory.StandardPackageFactory;
import Package_Product.Advanced;
import Package_Product.Basic;
import Package_Product.Package;
import Package_Product.Premium;
import Package_Product.Standard;
import WebServer.Django;
import WebServer.DjangoFactory;
import WebServer.Nodejs;
import WebServer.NodejsFactory;
import WebServer.Ruby;
import WebServer.RubyFactory;
import WebServer.WebFactory;
import WebServer.WebServer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Builder builder = new Builder();
        PackageFactory pkg;
        Internetfactory net;
        WebFactory web;

        // Step 1: Choose Package
        System.out.println("Choose a package:");
        System.out.println("1. Basic (ATMega32 with LED display)");
        System.out.println("2. Standard (Arduino Mega with LCD display)");
        System.out.println("3. Advanced (Raspberry Pi with OLED display)");
        System.out.println("4. Premium (Raspberry Pi with touch screen display)");
        int packageChoice = scanner.nextInt();

        switch (packageChoice) {
            case 1:
                pkg = new Basic_PackageFactory();
                break;
            case 2:
                pkg = new StandardPackageFactory();
                break;
            case 3:
                pkg = new Advanced_PackageFactory();
                break;
            case 4:
                pkg = new Premium_PackageFactory();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        // Step 2: Choose Internet Connection
        System.out.println("Choose internet connection:");
        switch (packageChoice) {
            case 1:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                break;

            case 2:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                break;

            case 3:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                System.out.println("3. Ethernet");
                break;

            case 4:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                System.out.println("3. Ethernet");
                break;

            default:
                System.out.println("Invalid choice!");
                return;

        }
      
        int internetChoice = scanner.nextInt();

        switch (internetChoice) {
            case 1:
                net =new WifiFactory();
                break;
            case 2:
                net = new GSMFactory();
                break;
            case 3:
                net = new EthernetFactory();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Step 3: Choose Web Server Framework
        System.out.println("Choose a web server framework:");
        System.out.println("1. Django");
        System.out.println("2. NodeJS");
        System.out.println("3. Ruby");
        int serverChoice = scanner.nextInt();

        switch (serverChoice) {
            case 1:
                web = new DjangoFactory();
                break;
            case 2:
                web = new NodejsFactory();
                break;
            case 3:
                web = new RubyFactory();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        Director director= new Director(builder);
        director.CreateSystem(pkg, net, web);
        TicketingSystem system= builder.getsystem();

        System.out.println(system);

    }
    
}
