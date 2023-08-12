package Online_Code_Samples.Week3;

public class ThisDemo {

    private String name;
    private int age;
    private double accountBalance;

    public ThisDemo(String name, int age, double accountBalance){
        this.name = name;
        this.age = age;
        this.accountBalance = accountBalance;
    }

    public ThisDemo(String name, int age){
        this(name, age, 0.0);
    }

    public ThisDemo(String name){
        this(name, 18);
    }

    public ThisDemo(){
        this("User");
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getAccountBalance() { return accountBalance; }

    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    public static void main(String[] args) {
        ThisDemo demo1 = new ThisDemo("Joanna", 45);
        System.out.println("Name: " + demo1.getName() + " Age: " + demo1.getAge() + " Account Balance: " + demo1.getAccountBalance());
    }
}
