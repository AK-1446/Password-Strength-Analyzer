import java.util.Scanner;

public class PassStrengthAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        int score = 0;

        if(password.length() >= 8) {
            score++;
        }

        if(password.matches(".*[A-Z].*")) {
            score++;
        }

        if(password.matches(".*[a-z].*")) {
            score++;
        }

        if(password.matches(".*[0-9].*")) {
            score++;
        }

        if(password.matches(".*[@#$%^&+=!].*")) {
            score++;
        }

        System.out.println("\nPassword Score: " + score);

        if(score <= 2) {
            System.out.println("Weak Password");
            System.out.println("Suggestion: Use uppercase, numbers, and symbols.");
        }
        else if(score <= 4) {
            System.out.println("Medium Password");
        }
        else {
            System.out.println("Strong Password");
        }
        sc.close();
    }
}