package Online_Code_Samples.Week2;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String department;
    private Student[] students;
    int index = 0;

    public Course(String name, String department) {
        this.name = name;
        this.department = department;
        students = new Student[6];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public List<Student> classLead(Student[] studentList) {
        List<Student> classLead = new ArrayList<>();
        Student lead = studentList[0];

        for( Student st : studentList ){
            if( st != null ){
                if( st.getScore() >= lead.getScore() )
                    lead = st;
            }
        }
        classLead.add(lead);

        for( Student student : studentList ){
            if( student != null ){
                if( !classLead.contains(student) ){
                    if( student.getScore() == classLead.get(0).getScore()){
                        classLead.add(student);
                    }
                }
            }
        }

        return classLead;
    }

    public List<Student> getAGradeStudents(Student[] studentList) {
        List<Student> aGradeList = new ArrayList<>();

        for (Student st : studentList) {
            if (st != null) {
                if (st.getScore() >= 70) {
                    aGradeList.add(st);
                }
            }
        }
        return aGradeList;
    }

    public boolean addStudent(Student st) {
        if (st != null) {
            students[index++] = st;
            return true;
        }
        return false;
    }

    public void printStudents(Student[] studentList) {
        for (Student st : studentList) {
            if (st != null)
                System.out.println(st);
        }
    }
}

