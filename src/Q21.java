import java.util.Scanner;

class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int dec = scanner.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(dec));

        scanner.close();
    }
}


