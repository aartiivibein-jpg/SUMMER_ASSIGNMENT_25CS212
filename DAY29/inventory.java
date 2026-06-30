import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, quantity;
        String name;

        System.out.print("Enter Product ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.println("\n----- Inventory Details -----");
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity : " + quantity);

        sc.close();
    }
}