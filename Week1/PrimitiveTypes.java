package Online_Code_Samples.Week1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveTypes {

    public static void main(String[] args) {
        System.out.print("Please type the word \"string\" in the prompt: ");
        String aString;
        Scanner scanner = new Scanner(System.in);
        aString = scanner.next();
        int anInt = 1000;
        boolean booleanValue = (aString.equals("string"));
        char charValue = 'A';
        double doubleValue = 1.50;
        float floatValue = 2000F;
        long longValue = 3445495996L;
        short shortValue = 12900;
        byte byteValue = 127;

        System.out.println(anInt);
        System.out.println(Arrays.toString(aString.getBytes(StandardCharsets.UTF_16BE)));
        System.out.println(Arrays.toString(aString.getBytes()));
        System.out.println(aString.repeat(3));
        System.out.println(booleanValue);
        System.out.println(charValue);
        System.out.println(doubleValue);
        System.out.println(floatValue);
        System.out.println(longValue);
        System.out.println(shortValue);
        System.out.println(byteValue );
    }
}
