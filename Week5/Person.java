package Online_Code_Samples.Week5;

public class Person {
    private String name;
    private int age;
    private String location;
    private String techSkill;

    public Person(String name, int age, String location, String techSkill) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.techSkill = techSkill;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }
}
