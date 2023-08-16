package Online_Code_Samples.Week5;

public class Student {

    private String name;
    private int age;
    private int score;
    private char grade;

    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = setGrade(score);
    }

    private char setGrade(int score){
        if(score >= 70){
            return 'A';
        }
        if(score >= 60){
            return 'B';
        }
        if(score >= 50){
            return 'C';
        }
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
    public String toString() {
        return "Student name: " + this.getName() +
                ", Age: " + this.getAge() +
                ", Score: " + this.getScore() +
                ", Grade: " + this.getGrade();
    }

}
