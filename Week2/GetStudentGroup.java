package Online_Code_Samples.Week2;

import java.util.*;

public class GetStudentGroup  {

    public static Map<Integer, List<Student>> groupStudent(List<Student> students){
        Map<Integer, List<Student>> groupedStudents = new HashMap<>();
        List<Student> studentAbove70 = new ArrayList<>();
        List<Student> cStudents = new ArrayList<>();
        List<Student> backBenchers = new ArrayList<>();

        for(Student st: students){
            switch (st.getScore()) {
                case 70 -> studentAbove70.add(st);
                case 50 -> cStudents.add(st);
                default -> backBenchers.add(st);
            }
        }
        groupedStudents.put(70, studentAbove70);
        groupedStudents.put(50, cStudents);
        groupedStudents.put(40, backBenchers);
        return groupedStudents;
    }

    public static void main(String[] args) {
        Student first = new Student("John", 25, 70);
        Student fifth = new Student("John", 25, 35);
        Student second = new Student("Jane", 27, 70);
        Student third = new Student("David", 35, 50);
        Student fourth = new Student("Joy", 30, 45);

        List<Student> student = new ArrayList<>();
        student.add(first);
        student.add(second);
        student.add(third);
        student.add(fourth);
        student.add(fifth);

        //Used to test for a condition: returns true or false;
//        Predicate<Student> predicate = (stud) -> stud.getAge() < 30;
//        student.stream().filter(predicate).forEach(System.out::println);

        Comparator<Student> nameComparator = (s, s2) -> s.getName().compareTo(s2.getName());
        Comparator<Student> scoreComparator = (s, s1 ) -> s.getScore() - s1.getScore();
        Comparator<Student> ageComparator = (s, s1 ) -> s.getAge() - s1.getAge();
        student.stream().sorted(ageComparator).forEach(System.out::println);




//        Map<Integer, List<Student>> result = groupStudent(student);
//
//        for( Integer key: result.keySet() ){
//            System.out.println("Key is " + key);
//           List<Student> list = result.get(key);
//           for( Student st: list ){
//               System.out.println(st);
//           }
//        }
    }



}
