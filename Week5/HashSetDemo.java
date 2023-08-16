package Online_Code_Samples.Week5;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Student first = new Student("John", 25, 72);
        Student second = new Student("Jane", 27, 83);
        Student third = new Student("David", 35, 68);
        Student fourth = new Student("Joy", 30, 95);

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(first);
        studentSet.add(second);
        studentSet.add(third);
        studentSet.add(fourth);
        System.out.println(studentSet);

        studentSet.remove(third);
        System.out.println(studentSet);

        System.out.println(studentSet.add(fourth));

    }
}
