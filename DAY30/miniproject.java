import java.util.Scanner;

public class miniproject {

    static void display(String[] name, int[] marks) {

        System.out.println("\nStudent Report");

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " : " + marks[i]);
        }
    }

    static void average(int[] marks) {

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        System.out.println("Average = " + (sum / marks.length));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Student Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(name, marks);
        average(marks);

        sc.close();
    }
}