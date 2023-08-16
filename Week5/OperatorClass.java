package Online_Code_Samples.Week5;

public class OperatorClass {

    public static <T> T implementation(Operator<T> function, T type1, T type2){
        var result = function.operator(type1, type2);
        System.out.println("The result from operation is: " + result);
        return result;
    }

    public static void main(String[] args) {

        var output = implementation((a, b ) -> a + b, 10.0, 2.5);
        var intOutput = implementation((a, b) -> a * b, 25, 4);
        var stringOutput = implementation((a, b) -> a.toUpperCase() + " and" + b.toUpperCase() + " was made by God", "Man", " Woman");


    }

}
