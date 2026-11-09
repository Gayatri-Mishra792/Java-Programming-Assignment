import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        int years = days / 365;
        int remaining = days % 365;

        int weeks = remaining / 7;
        int remainingDays = remaining % 7;

        System.out.println("Years = " + years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + remainingDays);
    }
}