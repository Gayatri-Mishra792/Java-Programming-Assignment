import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() >= 3) {
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
            System.out.println("Third character: " + str.charAt(2));
        } else {
            System.out.println("Please enter at least 3 characters.");
        }

        sc.close();
    }
}