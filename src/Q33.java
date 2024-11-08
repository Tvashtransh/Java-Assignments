import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.1; // assuming 10% commission rate
    }
}

class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);
            System.out.println("Commission: " + commission.commission());
        }

        scanner.close();
    }
}
