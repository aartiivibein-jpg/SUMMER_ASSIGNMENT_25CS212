public class max {

    // Function to find maximum
    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int result = maximum(10, 20);

        System.out.println("Maximum Number = " + result);
    }
}