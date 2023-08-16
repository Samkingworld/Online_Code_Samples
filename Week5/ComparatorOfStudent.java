package Online_Code_Samples.Week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ComparatorOfStudent {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 52, 72));
        studentList.add(new Student("Jane", 27, 53));
        studentList.add(new Student("David", 35, 99));
        studentList.add(new Student("Joy", 30, 95));

        Comparator<Student> scoreComparator = (s1,s2) -> s1.getScore() - s2.getScore();

        //Collections.sort(studentList, scoreComparator) is same as line below;
        //studentList.sort(scoreComparator);

//        Collections.sort(studentList, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getScore() - o2.getScore();
//            }
//        });

        Function<Student, String> stringFunction = student -> "Student name: " + student.getName();
        Consumer<Student> printConsumer = student -> System.out.println("Student name is: " + student.getName());

        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);

        studentList.stream().sorted(ageComparator).forEach(printConsumer);

        studentList.stream().map(stringFunction).forEach(System.out::println);




//        studentList.stream()
//                .sorted((s1, s2) -> s2.getScore() - s1.getScore())
//                .forEach(System.out::println);


//        Comparator<Student> studentComparator = Comparator.comparing(Student::getScore);
//
//        studentList.sort(studentComparator);
//
//        studentList.forEach(System.out::println);
    }

}
