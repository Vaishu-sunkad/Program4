public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // You can change this number or take user input
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
