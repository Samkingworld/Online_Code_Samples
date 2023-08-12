package Online_Code_Samples.Week4;

public class UncheckedException {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
