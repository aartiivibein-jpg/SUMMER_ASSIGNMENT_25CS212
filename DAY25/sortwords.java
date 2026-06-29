import java.util.Scanner;

public class sortwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Enter 5 words:");

        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words Sorted by Length:");

        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}