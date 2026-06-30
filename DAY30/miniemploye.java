import java.util.Scanner;

public class miniemploye {

    static void display(String[] name, int[] salary) {

        System.out.println("\nEmployee Details");

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " : " + salary[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        int[] salary = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextInt();
            sc.nextLine();
        }

        display(name, salary);

        sc.close();
    }
}