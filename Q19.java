abstract class Payment {
    String name;

    Payment(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Payment Method: " + name);
    }

    abstract void pay();
}

class Cash extends Payment {
    Cash() {
        super("Cash");
    }

    void pay() {
        System.out.println("Payment done using Cash.");
    }
}

class Card extends Payment {
    Card() {
        super("Card");
    }

    void pay() {
        System.out.println("Payment done using Card.");
    }
}

class UPI extends Payment {
    UPI() {
        super("UPI");
    }

    void pay() {
        System.out.println("Payment done using UPI.");
    }
}

public class Q19 {
    public static void main(String[] args) {

        Payment[] payments = {
            new Cash(),
            new Card(),
            new UPI()
        };

        for (Payment p : payments) {
            p.display();
            p.pay();
            System.out.println();
        }
    }
}