package Online_Code_Samples.Week2;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        String trimmedStr = str.trim(); // Trims leading and trailing whitespace​

        System.out.println(trimmedStr); // Output: "Hello, World!"​

        String replacedStr = str.replace("Hello", "Hi"); // Replaces "Hello" with "Hi"​

        System.out.println(replacedStr); // Output: "   Hi, World!   "​

        String[] parts = str.split(","); // Splits the string at the comma​

        System.out.println(parts[0]); // Output: "   Hello"​

        String replacedStr1 = str.replace("World", "Universe");

        System.out.println(replacedStr1); // Output: "   Hello, Universe!   "​

        System.out.println();
        System.out.println(str.concat("man"));
        System.out.println(str.trim().toUpperCase().repeat(10) + "\n");

        System.out.println(str.strip());
    }
}
