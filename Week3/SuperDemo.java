package Online_Code_Samples.Week3;

public class SuperDemo extends ThisDemo{

    private String name;
    private int age;
    private double accountBalance;
    private final String accountType;
    private final double[] loans;
    private final int loanCount = 10;

    public SuperDemo(String name, int age, double accountBalance, String accountType){
        super(name, age, accountBalance);
        this.accountType = accountType;
        loans = new double[loanCount];
    }

    public SuperDemo(String name, int age){
        super(name, age);
        this.accountType = "Savings";
        loans = new double[loanCount];
    }

    public SuperDemo(String name){
        this(name, 18);

    }

    @Override
    public String getName(){
        return super.getName() + " " + super.getAccountBalance();
    }
    public double getAccountBalance(){
        return super.getAccountBalance();
    }

    public int getLoanCount(){
        return loans.length;
    }

    public static void main(String[] args) {
        SuperDemo demo1 = new SuperDemo("Mike");
        System.out.println("Name: " + demo1.getName() + " Age: " + demo1.getAge() + " Account Balance: "
                + demo1.getAccountBalance() + " No. of available loans: " + demo1.getLoanCount());

    }
}
