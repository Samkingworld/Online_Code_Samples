package Online_Code_Samples.Week2;



public class CourseMain {

    public static void main(String[] args) {

        Student first = new Student("John", 25, 70);
        Student second = new Student("Jane", 27, 70);
        Student third = new Student("David", 35, 50);
        Student fourth = new Student("Smith", 30, 45);
        Student fifth = new Student("Joy", 30, 70);
        Student sixth = new Student("Mn", 30, 45);

        Course course = new Course("Java", "Software Engineering");
        course.addStudent(first);
        course.addStudent(second);
        course.addStudent(third);
        course.addStudent(fourth);
        course.addStudent(fifth);
        course.addStudent(sixth);

        System.out.println(course.classLead(course.getStudents()));
        System.out.println("*************************************");

        System.out.println(course.getAGradeStudents(course.getStudents()));
        System.out.println("*************************************");

        course.printStudents(course.getStudents());
    }
}
