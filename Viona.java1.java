import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "12345";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome " + username);
                return;
            } else {
                attempts--;
                System.out.println("Incorrect login. Attempts left: " + attempts);
            }
        }
        System.out.println("Too many failed attempts. Access denied.");
        sc.close();
    }
}