import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            int count = 0;

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }

            if (count == str1.length()) {
                System.out.println("Anagram Strings");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}