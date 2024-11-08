import java.util.Scanner;

class SmallestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) min = array[i];
        }

        System.out.println("Smallest number: " + min);
        scanner.close();
    }
}
