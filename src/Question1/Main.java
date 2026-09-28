package Question1;

public class Main {
    public static void main(String[] args){
        String [] consoles ={"PS5","XBOX","SWITCH"};
        String [] cities = {"Cape Town","Port Elizabeth","Pretoria"};
        int [][] sales = {{1000,2000,3000}, {2000,3000,4000},{1500,1100,1200}};

        // Header Output
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        System.out.printf("%-20s","");

        for (int con = 0 ;con < consoles.length;con++){
            System.out.printf("%-15s",consoles[con]);
        }
        System.out.println();

        for (int city=0; city< cities.length;city++){
            System.out.printf("%-20s",cities[city]);

            for (int sale=0;sale<sales.length;sale++){
                System.out.printf("%-15s",sales[city][sale]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Calculate and display city totals
        for (int city = 0; city < cities.length; city++) {
            int cityTotal = 0;
            for (int sale = 0; sale < sales[city].length; sale++) {
                cityTotal += sales[city][sale];
            }

            System.out.printf("%-18s %d%n", cities[city], cityTotal);

            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[city];
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("------------------------------------------------------------");
    }
}