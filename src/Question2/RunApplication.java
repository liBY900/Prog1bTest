package Question2;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String consoleType = switch (choice) {
            case 1 -> "PS5";
            case 2 -> "XBOX";
            case 3 -> "SWITCH";
            default -> "PS5";
        };

        System.out.print("Enter the store: ");
        String store = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = scanner.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();


    }
}
