package Online_Code_Samples.Week3;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, world!");

        // append() method
        builder.append(" This is a test.");
        System.out.println(builder); // Hello, world! This is a test.

        // insert() method
        builder.insert(7, "Java ");
        System.out.println(builder); // Hello, Java world! This is a test.

        // delete() method
        builder.delete(7, 12);
        System.out.println(builder); // Hello, world! This is a test.

        // reverse() method
        builder.reverse();
        System.out.println(builder); // .tset a si siht ,dlrow olleH

        // charAt() method
        char c = builder.charAt(0);
        System.out.println(c); // .

        // length() method
        int length = builder.length();
        System.out.println(length); // 12

        builder.reverse();

        //replace method
        builder.replace(7, 12, "everyone");
        System.out.println(builder); // Hello, everyone! This is a test.

        //setLength(int x) method to clear builder
        builder.setLength(0);
        System.out.println(builder.length());

    }


}