package Online_Code_Samples.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    
    public static void printIntList(List<Integer> intList){
        for(Integer integer: intList){
            System.out.printf("%s\t\t", integer);
        }
    }

    public static void printStringList(List<String> stringList){
        for(String string: stringList){
            System.out.printf("%s\t\t", string);
        }
    }

    public static void listPrinter(List<? extends Object> objectList){
        for(Object object: objectList){
            System.out.printf("%s\t\t", object.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1); intList.add(2); intList.add(7);
        List<Double> doubleList;
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        doubleList = Arrays.asList(doubleArray);
        List<Character> charList;
        Character[] characterArray = {'A', 'B', 'C', 'D', 'E'};
        charList = Arrays.asList(characterArray);
        List<String> stringList;
        String[] stringArray = {"Boy", "Girl", "Woman", "Man", "Undecided"};
        stringList = Arrays.asList(stringArray);

        listPrinter(doubleList);
        listPrinter(charList);
        listPrinter(stringList);

    }
}
