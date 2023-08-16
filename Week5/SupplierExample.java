package Online_Code_Samples.Week5;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!, Java World, Remain Hopeful, Learn Coding, Keep Practicing";
        Supplier<Student> studentSupplier = () -> new Student("John", 28, 96);

        String result = supplier.get();
        System.out.println(result);
        System.out.println(studentSupplier.get().getAge() + " years old outstanding student");
    }
}
