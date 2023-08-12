package Online_Code_Samples.Week2;

import java.util.Scanner;

public class FirstArray {

    private static int[] intArray;
    private static Double[] doubleArray;
    private static String[] stringArray;

    private static final Scanner scanner = new Scanner(System.in);

    private static void readIntegers(){
        intArray = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Enter an integer: ");
            int y = scanner.nextInt();
            intArray[i] = y;
            scanner.nextLine();
        }
    }

    private static void readDoubles(){
        doubleArray = new Double[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Enter a double number: ");
            double y = scanner.nextDouble();
            doubleArray[i] = y;
            scanner.nextLine();
        }
    }

    private static void readStrings(){
        stringArray = new String[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Enter a String: ");
            String y = scanner.nextLine();
            stringArray[i] = y;
        }
        scanner.close();
    }

    public static void main(String[] args) {

        readIntegers();
        readDoubles();
        readStrings();

        System.out.println();
        System.out.println();
        System.out.println("+===============================================================+");

        System.out.println("These are the integers entered");
        for(int t: intArray){
            System.out.println("Integer number: " + t);
        }
        System.out.println();
        System.out.println("These are the doubles entered");
        for(double t: doubleArray){
            System.out.println("Double number: " + t);
        }
        System.out.println();
        System.out.println("These are the Strings entered");
        for(String t: stringArray){
            System.out.println("String value: " + t);
        }

    }


}
