package Online_Code_Samples.Week5;

import java.util.*;

public class LambdaExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number: (1 - 7)");
        number = scanner.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println("Today is monday");
                System.out.println("This is a Week day");
            }
            case 2 -> {
                System.out.println("Today is Tuesday");
                System.out.println("This is a Week day");
            }
            case 3 -> {
                System.out.println("Today is Wednesday");
                System.out.println("This is a Week day");
            }
            case 4 -> {
                System.out.println("Today is Thursday");
                System.out.println("This is a Week day");
            }
            case 5 -> {
                System.out.println("Today is Friday");
                System.out.println("This is the start of a Weekend");
            }
            case 6 -> {
                System.out.println("Today is Saturday");
                System.out.println("This is a Weekend");
            }
            default -> System.out.println("Today is Sunday");
        }

        List<Person> personList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            String name = "Student" + i;
            Random random = new Random();
            personList.add(new Person(name, random.nextInt(20, 50)));
        }
        personList.sort(Person.personComparator);
        System.out.println(personList);
    }

    record Person(String name, int age) {
        static Comparator<Person> personComparator = (o1, o2) -> o2.name().compareTo(o1.name());
    }
}

class LambdaStrings{
    public static void main(String[] args) {
        List<String> stringList = List.of(
                "man", "woman", "boy", "girl"
        );

        stringList.forEach( (var string) -> System.out.println(string));
        System.out.println("++++++++++++++++++++++++++++++");

        stringList.forEach((string) -> {
            var c = string.charAt(0);
            System.out.println(string  + " starts with " + (c + "").toUpperCase() + c );
        });


    }
}



