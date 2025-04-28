public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        System.out.println("Rest of the code...");
    }
}
