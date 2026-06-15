import java.util.Scanner;

public class ATM {

    // Private fields
    private int pin, amount, diff;

    // Protected field (accessible by subclasses)
    protected int balance;

    private static final Scanner scanner = new Scanner(System.in);

    // Process card input
    public void process(char card) {
        switch (card) {
            case 'a':
                System.out.println("Hello Anoop Yadav");
                balance = 50000;
                menu(1234);
                break;
            case 's':
                System.out.println("Hello Sunil Yadav");
                balance = 100000;
                menu(5678);
                break;
            case 'i':
                System.out.println("Hello Ista Yadav");
                balance = 60000;
                menu(9123);
                break;
            case 'j':
                System.out.println("Hello Joti Yadav");
                balance = 70000;
                menu(2007);
                break;
            case 'P':
                System.out.println("Hello Pankaj Yadav");
                balance = 0;
                menu(5485);
                break;
            case 'K':
                System.out.println("Hello KUMAR");
                balance = 52000000;
                menu(5123);
                break;
            case 'C':
                System.out.println("Hello Chenimya");
                balance = 7800000;
                menu(4321);
                break;
            default:
                System.out.println("Invalid card input.");
        }
    }

    // Private menu method
    private void menu(int correctPin) {
        System.out.println("> Press 1 to withdraw money");
        System.out.println("> Press 2 to check balance");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter your PIN: ");
            pin = scanner.nextInt();

            if (pin == correctPin) {
                System.out.print("Enter amount to withdraw: ");
                amount = scanner.nextInt();

                if (amount > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    diff = balance - amount;
                    System.out.println("Collect your money");
                    System.out.println("Now, your bank balance is " + diff);
                }
            } else {
                System.out.println("Incorrect PIN");
            }

        } else if (choice == 2) {
            System.out.print("Enter your PIN: ");
            pin = scanner.nextInt();

            if (pin == correctPin) {
                System.out.println("Your bank balance is " + balance);
            } else {
                System.out.println("Incorrect PIN");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        ATM obj = new ATM();

        System.out.println("Welcome To The ATM");
        System.out.print("Please insert your card (a/s/i/j/P/K/C): ");
        char card = scanner.next().charAt(0);

        obj.process(card);

        scanner.close();
    }
}
