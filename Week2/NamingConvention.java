package Online_Code_Samples.Week2;

public class NamingConvention {

    private String name;
    private int age;
    private double balance;

    public NamingConvention(String name, int age){
        this(name, age, 0.0);
    }

    public NamingConvention(String name, int age, double x){
        this.name = name;
        this.age = age;
        this.balance = x;
    }
}
