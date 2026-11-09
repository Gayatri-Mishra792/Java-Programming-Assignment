import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;

        String initials = firstName.charAt(0) + "." +
                          lastName.charAt(0) + ".";

        System.out.println("Full Name: " + fullName);
        System.out.println("Initials: " + initials);

        sc.close();
    }
}