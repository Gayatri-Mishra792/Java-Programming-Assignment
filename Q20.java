interface Appliance {
    void switchOn();
    void switchOff();
}

class Light implements Appliance {
    public void switchOn() {
        System.out.println("Light is ON.");
    }

    public void switchOff() {
        System.out.println("Light is OFF.");
    }
}

class Fan implements Appliance {
    public void switchOn() {
        System.out.println("Fan is ON.");
    }

    public void switchOff() {
        System.out.println("Fan is OFF.");
    }
}

class AC implements Appliance {
    public void switchOn() {
        System.out.println("AC is ON.");
    }

    public void switchOff() {
        System.out.println("AC is OFF.");
    }
}

public class Q20 {
    public static void main(String[] args) {

        Appliance[] appliances = {
            new Light(),
            new Fan(),
            new AC()
        };

        for (Appliance a : appliances) {
            a.switchOn();
            a.switchOff();
            System.out.println();
        }
    }
}