package Question2;

public class ConsoleSales extends Consoles {

    // Constructor passing parameters to superclass
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Method to display report
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("***********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
