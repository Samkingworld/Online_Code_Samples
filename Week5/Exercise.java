package Online_Code_Samples.Week5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercise {
    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        List<Integer> integerList = Arrays.asList(integers);

        String[] strings = {"Mary", "Maryam", "Mitchell", "Mimi", "Margaret", "Emily", "Monster"};
        List<String> stringList = Arrays.asList(strings);

//        stringList.stream().filter(belowFiveCharacters).forEach(System.out::println);
//        System.out.println("_________________________________________________");
//
//        stringList.stream().map(stringFunction).forEach(System.out::println);
//        System.out.println("_________________________________________________");
//
//        List<String> maString = stringList.stream().filter(maFilter).collect(Collectors.toList());
//        maString.forEach(System.out::println);
//        System.out.println("_________________________________________________");
//
//        stringList.stream().sorted(stringComparator).forEach(System.out::println);

        integerList.stream().filter(evenNumbers).forEach(System.out::println);
        List<Integer> oddList = integerList.stream().filter(oddNumbers).toList();
        Integer sum = 0;
        for( Integer x: oddList){
            sum += x;
        }
        System.out.println(sum);
        List<Integer> evenList = integerList.stream().filter(evenNumbers).toList();

        integerList.stream().map(intFunction).forEach(System.out::println);


    }

    static Predicate<String> belowFiveCharacters = str -> str.length() <= 5;

    static Function<String, String> stringFunction = str -> str.toUpperCase();

    static Predicate<String> maFilter = str -> str.startsWith("Ma");

    static Comparator<String> stringComparator = (s1, s2) -> s2.compareTo(s1);

    static Predicate<Integer> evenNumbers = in -> in % 2 == 0;
    static Predicate<Integer> oddNumbers = in -> in % 2 == 1;
    static Function<Integer, Integer> intFunction = num -> num*num;

}
