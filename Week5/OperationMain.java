package Online_Code_Samples.Week5;

public class OperationMain {

    public static <T> T manipulator(Operation<T> operation, T type1, T type2){
        var result = operation.operate(type1, type2);
        System.out.println ( "Result from Operation.operate: " + result) ;
        return result;
    }

    public static void main(String[] args) {
        int result = manipulator((a, b) -> a+b, 5, 10);
        String response = manipulator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Man", "Go");
    }
}
