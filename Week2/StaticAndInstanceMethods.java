package Online_Code_Samples.Week2;

public class StaticAndInstanceMethods {

    public void print(){
        System.out.println("Instance Method Call");
    }
    public static void printStatic(){
        System.out.println("Static Method Call");
    }

    public static void main(String[] args) {
        new StaticAndInstanceMethods().print();
        printStatic();
    }
}
