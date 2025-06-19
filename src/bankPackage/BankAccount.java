package bankPackage;
import java.util.InputMismatchException;

// Responsible for handling user bank account
public class BankAccount {
    String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public void deposit(int value) {
        if (value < 0) {
            System.out.println("Please enter a valid value");
        } else {
            this.balance += value;
        }
    }

    public void withdraw(int value) {
        try {
            if (value > this.balance) {
                System.out.println("Not enough funds.");
            } else {
                this.balance -= value;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid input");
        }
    }
}

