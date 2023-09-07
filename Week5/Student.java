package Online_Code_Samples.Week5;

public class Student {

    private String name;
    private int age;
    private final int score;
    private char grade;

    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = setGrade(score);
    }

    private char setGrade(int score){
        if(score >= 70){
            this.grade = 'A';
        } else if(score >= 60){
            this.grade = 'B';
        }else if(score >= 50){
            this.grade = 'C';
        }else {
            this.grade = 'D';
        }
        return this.grade;
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

    @Override
    public String toString() {
        return "Student name: " + this.getName() +
                ", Age: " + this.getAge() +
                ", Score: " + this.getScore() +
                ", Grade: " + this.getGrade();
    }

}
