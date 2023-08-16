package Online_Code_Samples.Week5;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {


    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isBelowTen = num -> num < 10;
        Predicate<Integer> isMultiple5 = num -> num % 5 == 0;
        BiPredicate<Integer, Integer> isEvenOrDivisibleBy3 = (a, b) -> a % 2 == 0 || b % 3 == 0;

         // Output: true or false
        for( int i = 0; i <= 20; i++){
            System.out.println(i + " isEven: " + isEven.test(i));
            System.out.println(i + " isMultiple5: " + isMultiple5.test(i));
            System.out.println(i + " isBelowTen: " + isBelowTen.test(i));
            System.out.println(i + " isEvenAndDivisibleBy3: " + isEvenOrDivisibleBy3.test(i, i));
            System.out.println(new PredicateExample().test(i));

        }
    }

    @Override
    public boolean test(Integer integer) {
        return integer >= 25;
    }
}
