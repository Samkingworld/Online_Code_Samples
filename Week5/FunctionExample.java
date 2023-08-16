package Online_Code_Samples.Week5;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, String> converter = num -> "Number: " + num.toString() + " \tCube: " + (num * num * num);
        String result = converter.apply(10);
        System.out.println(result);
        System.out.println("----------------");

        printFunction(converter, 20);
    }

    public static void printFunction(Function<Integer, String> function, int x){
        for( int i = 1; i <= x; i++ ){
            String result = function.apply(i);
            System.out.println(result);
        }
    }
/*
Write a code that takes a Function<Integer, String> to print 1 - 20 in below format:
Number: num, Cube: (num*num*num)

public void printFunction(Function<Integer, String>, int x)
 */
}
