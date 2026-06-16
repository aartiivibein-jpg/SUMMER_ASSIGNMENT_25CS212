public class pyramidn {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}