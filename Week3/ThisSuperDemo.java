package Online_Code_Samples.Week3;

public class ThisSuperDemo {

    private String fullName;
    private int age;
    private double accountBalance;

    public ThisSuperDemo(String firstName, String lastName, int age, double accountBalance){
        this.fullName = firstName + " " + lastName;
        this.age = age;
        this.accountBalance = accountBalance;
    }

    public ThisSuperDemo(String firstName, int age, double accountBalance){
        this(firstName, "Java", 28, 500000.00);
    }

    public ThisSuperDemo(int age, double accountBalance){
        this("Student", "Java", 35, 755500.00);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static void main(String[] args) {
        ThisSuperDemo superDemo = new ThisSuperDemo(35, 5600000);
        System.out.println(superDemo.getFullName() + " " + superDemo.getAge() + " " + superDemo.getAccountBalance());
    }


}
