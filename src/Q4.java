import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Swapping without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: First number = " + a + ", Second number = " + b);

        scanner.close();
    }
}

