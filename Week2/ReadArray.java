package Online_Code_Samples.Week2;
import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {
    static Scanner scanner = new Scanner(System.in);

    public static int[] readInteger(){
        int[] num = new int[5];
        int count = 0;
        System.out.println("Input 5 numbers ");
        do {
            int numbers = scanner.nextInt();
            num[count] = numbers;
            count++;
        } while (count < 5);

        return num;
    }

    public static String[] readStrings(){
//        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[5];
        int count = 0;


        do {
            System.out.println("Enter A Strings ");
            String strings = scanner.nextLine();
            stringArray[count] = strings;
            count++;

        } while (count < 5);
//        scanner.close();
        return stringArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readInteger()));
        System.out.println(Arrays.toString(readStrings()));
    }


}