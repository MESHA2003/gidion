public class Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Outer loop
            for (int j = 1; j <= i; j++) { // Inner loop
                System.out.print(i + " "); // Print numbers on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
