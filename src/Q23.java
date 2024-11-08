// Pattern (a)
class PatternA {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

// Pattern (b)
class PatternB {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
