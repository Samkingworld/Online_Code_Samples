package Online_Code_Samples.Week2;

public class Student{

    private String name;
    private int age, score;
    private char grade;

    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
        grade = setGrade(score);
    }

    public char setGrade(int score){
        if( score >= 70)
            return 'A';
        if( score >= 60 )
            return 'B';
        if( score >= 50)
            return 'C';
        return 'D';
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return String.format("Student name: %s, Age: %d, Score: %d, Grade: %s", name, age, score, grade);
    }
}
