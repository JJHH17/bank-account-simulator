package bankPackage;
import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        var newUser = new BankAccount(name);

        while (true) {
            System.out.println("View Balance | Deposit | Withdraw | quit");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            switch (userInput.toLowerCase()) {
                case "view":
                    newUser.getBalance();
                    break;

                case "deposit":
                    System.out.println("How much do you want to deposit?");
                    try {
                        int depositAmount = Integer.parseInt(input.nextLine());
                        newUser.deposit(depositAmount);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid entry.");
                        break;
                    }

                case "withdraw":
                    System.out.println("How much do you want to withdraw?");
                    try {
                        int withdrawAmount = Integer.parseInt(input.nextLine());
                        newUser.withdraw(withdrawAmount);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid entry.");
                        break;
                    }

                default:
                    System.out.println("Please enter a valid entry.");
            }
        }
    }
}
