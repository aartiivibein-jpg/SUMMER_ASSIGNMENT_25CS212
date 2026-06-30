import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, total;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        hra = basic * 0.20;
        da = basic * 0.10;

        total = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Total Salary = " + total);

        sc.close();
    }
}