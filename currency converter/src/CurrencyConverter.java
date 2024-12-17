import java.util.Scanner;


public class CurrencyConverter {
    private static final double EURO_TO_USD_RATE = 1.05; //Changed the name to CurrencyConverter, also added exchange rates for EURO and DOLLAR.
    private static final double USD_TO_EURO_RATE = 0.95;

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in); //Variables determined.

        System.out.println("Määritä summa: "); 
        double amount = scanner.nextDouble();// Insert the amount you want to convert.

        System.out.println("Vaihda (1) Dollareihin vai (2) Euroihin");
        int choice = scanner.nextInt(); // user needs to choose 1 to convert to dollars or 2 to euros.

        double result = choice == 1 ? amount * EURO_TO_USD_RATE : amount * USD_TO_EURO_RATE;
        String kohdeValuutta = choice == 1 ? "Dollarit" : "Eurot"; // Add logic for currency conversion and target currency selection

        System.out.printf("Vaihdettu summa: %.2f %s%n", result, kohdeValuutta); //Print the final result.
       
        scanner.close(); //Close the scanner.

    }
}
