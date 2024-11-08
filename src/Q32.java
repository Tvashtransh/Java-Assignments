class ParameterizedConstructor {
    private int number;
    private String name;

    public ParameterizedConstructor(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
        System.out.println("Number: " + number + ", Name: " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10, "Example");
    }
}
