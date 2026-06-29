import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 7;
        int guess;

        System.out.print("Guess the number (1 to 10): ");
        guess = sc.nextInt();

        if (guess == number) {
            System.out.println("Congratulations! You guessed correctly.");
        } else {
            System.out.println("Wrong Guess!");
            System.out.println("Correct Number is " + number);
        }

        sc.close();
    }
}