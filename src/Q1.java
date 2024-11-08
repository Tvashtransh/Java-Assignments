import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (1) Celsius or (2) Fahrenheit? Enter choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 2) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
