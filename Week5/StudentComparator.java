package Online_Code_Samples.Week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentComparator  {

    static Comparator<Student> studentComparator = Comparator.comparingInt(Student::getScore);

    public static void main(String[] args) {
        Student first = new Student("John", 25, 72);
        Student second = new Student("Jane", 27, 83);
        Student third = new Student("David", 35, 68);
        Student fourth = new Student("Joy", 30, 95);
        List<Student> studentList = new ArrayList<>();
        studentList.add(first);
        studentList.add(second);
        studentList.add(third);
        studentList.add(fourth);

        studentList.stream()
                .sorted(studentComparator).forEach(System.out::println);

    }
}
