import java.util.Scanner;

public class arrayoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Display");
        System.out.println("2. Sum");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                for (int i = 0; i < 5; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum = " + sum);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}