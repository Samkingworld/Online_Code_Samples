package Online_Code_Samples.Week5;

import java.util.function.Function;

public class FunctionExercise {

    public static void functionMethod(Integer integer, Function<Integer, String> function){
        for( int i = 1; i <= integer; i++){
            System.out.println(function.apply(i));
        }
    }

    public static void main(String[] args) {
        Function<Integer, String> theFunction = number -> String.format("Number is: %d and the Cube of the Number is: %d", number, (int)Math.pow(number, 3));
        functionMethod(25, theFunction);
    }
}
