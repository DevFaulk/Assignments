import java.util.Scanner;

public class CoinCounter {
    // Year Up Change Counter
    public static void main(String[] args) {
        System.out.println("How many pennies are you inputting: ");
        Scanner userInput = new Scanner(System.in);
        String pennies = userInput.nextLine();
        System.out.println("How many nickels are you inputting: ");
        userInput = new Scanner(System.in);
        String nickels = userInput.nextLine();
        System.out.println("How many dimes are you inputting: ");
        userInput = new Scanner(System.in);
        String dimes = userInput.nextLine();
        userInput = new Scanner(System.in);
        System.out.println("How many quarters are you inputting: ");
        String quarters = userInput.nextLine();
        System.out.println("How many quarters are you inputting: ");
        System.out.println("Pennies: " + pennies);
        System.out.println("Nickels: " + nickels);
        System.out.println("Dimes: " + dimes);
        System.out.println("Quarters: " + quarters);
    }

}
