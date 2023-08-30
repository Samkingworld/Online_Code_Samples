package Online_Code_Samples.Week2;



import java.util.ArrayList;
import java.util.List;

public class CombinedObjects {

    private String name;
    private String location;
    private String courseName;
    private List<Student> studentList;

    public CombinedObjects(String name, String location, String courseName){
        this.name = name;
        this.location = location;
        this.courseName = courseName;
        studentList = new ArrayList<>();
    }

    public List<Student> getAGradeStudent( List<Student> students, int score ){

        List<Student> returnedStudents = new ArrayList<>();

        for(Student st: students){
            if( st.getScore() >= score ){
                returnedStudents.add(st);
            }
        }
        return returnedStudents;

    }

    public Student getBestStudent( List<Student> students ){

        Student best = students.get(0);

        for(Student student : students ){
            if(student.getScore() > best.getScore()){
                best = student;
            }
        }

        return best;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public static void main(String[] args) {
        Student first = new Student("John", 25, 72);
        Student fifth = new Student("John", 25, 35);
        Student second = new Student("Jane", 27, 83);
        Student third = new Student("David", 35, 68);
        Student fourth = new Student("Joy", 30, 95);

        CombinedObjects combinedObjects = new CombinedObjects("Java Students", "Ingryd Academy", "Java101");

        List<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        students.add(fourth);
        students.add(fifth);

        combinedObjects.setStudentList(students);

        System.out.println(combinedObjects.getBestStudent(students));

        for(Student st: students){
            System.out.println(st);
        }

        List<Student> studentList1 = combinedObjects.getAGradeStudent( combinedObjects.getStudentList(), 70 );
        System.out.println(studentList1);
    }
}
