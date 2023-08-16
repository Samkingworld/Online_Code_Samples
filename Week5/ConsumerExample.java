package Online_Code_Samples.Week5;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = message -> System.out.println("Message: " + message);
        consumer.accept("Hello, Consumer!");
    }
}

