package Online_Code_Samples.Week3;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello, world!");

//        System.out.println(reverse("John"));

        // append() method
        buffer.append(" This is a test.");
        System.out.println(buffer); // Hello, world! This is a test.

        // insert() method
        buffer.insert(7, "Java ");
        System.out.println(buffer); // Hello, Java world! This is a test.

        // delete() method
        buffer.delete(7, 12);
        System.out.println(buffer); // Hello, world! This is a test.

        // reverse() method
        buffer.reverse();
        System.out.println(buffer); // .tset a si siht ,dlrow olleH

        // charAt() method
        char c = buffer.charAt(0);
        System.out.println(c); // .

        // length() method
        int length = buffer.length();
        System.out.println(length); // 12

        buffer.reverse();

        //replace method
        buffer.replace(7, 12, "everyone");
        System.out.println(buffer); // Hello, everyone! This is a test.

        //setLength(int x) method to clear buffer
        buffer.setLength(0);
        System.out.println(buffer.length());
        System.out.println(buffer);
    }


//    public static String reverse(String string){
//        String empty = "";
//        for( int j = string.length()-1; j >= 0; j-- ){
//            empty += string.charAt(j);
//        }
//        return empty;
//    }
}
