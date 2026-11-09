interface Notifier {
    void notifyUser();
}

class BankAccount {

    private double balance = 1000;

    // Inner Class
    class DepositManager {
        void deposit(double amount) {
            System.out.println("Old Balance: " + balance);
            balance = balance + amount;
            System.out.println("New Balance: " + balance);
        }
    }

    // Static Nested Class
    static class Receipt {
        void printReceipt() {
            System.out.println("Bank Receipt Generated Successfully");
        }
    }

    // Method using Interface
    void sendNotification(Notifier notifier) {
        notifier.notifyUser();
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Inner Class Object
        BankAccount.DepositManager dm =
                account.new DepositManager();

        dm.deposit(500);

        // Static Nested Class Object
        BankAccount.Receipt receipt =
                new BankAccount.Receipt();

        receipt.printReceipt();

        // Lambda Expression
        Notifier n = () ->
                System.out.println("Amount deposited successfully!");

        account.sendNotification(n);
    }
}