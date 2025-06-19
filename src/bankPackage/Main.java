package bankPackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your initial bank balance: ");
        int initBalance = Integer.parseInt(input.nextLine());

        var newUser = new BankAccount(name, initBalance);

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
                    System.out.println("How much do you want to despoit?");
                    int depositAmount = Integer.parseInt(input.nextLine());
                    newUser.desposit(depositAmount);
                    break;
                case "withdraw":
                    System.out.println("How much do you want to withdraw?");
                    int withdrawAmount = Integer.parseInt(input.nextLine());
                    newUser.withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println("Please enter a valid entry.");
            }
        }
    }
}
