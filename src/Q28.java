import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum of all odd numbers: " + sum);
        scanner.close();
    }
}
