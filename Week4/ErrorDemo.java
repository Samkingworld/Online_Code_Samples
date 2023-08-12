package Online_Code_Samples.Week4;

public class ErrorDemo {
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
