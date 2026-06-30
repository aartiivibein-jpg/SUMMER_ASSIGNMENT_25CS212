import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String destination;
        int seats;

        System.out.print("Enter Passenger Name: ");
        name = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        seats = sc.nextInt();

        System.out.println("\n----- Ticket Details -----");
        System.out.println("Passenger Name : " + name);
        System.out.println("Destination : " + destination);
        System.out.println("Seats Booked : " + seats);

        sc.close();
    }
}