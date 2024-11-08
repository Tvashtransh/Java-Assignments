import java.util.HashMap;
import java.util.Scanner;

class DuplicateFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequency:");
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > 1) {
                System.out.println(num + " occurs " + frequencyMap.get(num) + " times.");
            }
        }

        scanner.close();
    }
}
