import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Chennai");

        System.out.print("Enter answer: ");
        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B') {
            score++;
        }

        System.out.println("Q2. 5 + 3 = ?");
        System.out.println("a) 6");
        System.out.println("b) 7");
        System.out.println("c) 8");

        System.out.print("Enter answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'c' || ans == 'C') {
            score++;
        }

        System.out.println("Your Score = " + score + "/2");

        sc.close();
    }
}