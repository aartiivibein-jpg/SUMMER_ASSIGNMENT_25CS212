import java.util.Scanner;

public class minilibrary {

    static void display(String[] books) {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Book Name: ");
            books[i] = sc.nextLine();
        }

        display(books);

        sc.close();
    }
}