package Online_Code_Samples.Week5;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Initialization of LinkedList
        List<Student> studentList = new LinkedList<>();
        for(int i = 1; i <= 5; i++){
            String name = "Student" + i;
            Random random = new Random();
            studentList.add(new Student(name, random.nextInt(20, 40), random.nextInt(45, 99)));
        }

        Map<Integer, String> studentMap = new HashMap<>();
        int i = 1;
        for( Student st: studentList ){
            studentMap.put(i, st.getName());
            i++;
        }



        for( Integer x: studentMap.keySet() ){
            System.out.println(studentMap.get(x));
        }

        Predicate<Student> predicate = n -> n.getAge() <= 35;
        System.out.println("Predicate print out");
        studentList.stream().filter(predicate).forEach(System.out::println);

        Function<Student, String> stringFunction = (s) -> s.getScore() + " is your mark Mr. " + s.getName();
        studentList.stream().map(stringFunction).forEach(System.out::println);

    }
}