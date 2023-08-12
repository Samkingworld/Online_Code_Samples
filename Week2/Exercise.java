package Online_Code_Samples.Week2;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        int[] arrayTotal = new int[4];
        int total = 0;
        int arrayIndex = 0;

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        do{
            System.out.print("Please enter a valid integer: ");
            int entered = scanner.nextInt();
            total += entered;

            if( count % 5 == 0){
                arrayTotal[arrayIndex++] = total;
                total = 0;
            }
            count++;
        } while ( count <= 20);
        scanner.close();

        count = 1;
        for( int integer: arrayTotal ){
            System.out.println("Series " + count++ + " total = " + integer);
            total+= integer;
        }
        System.out.println("Total summation = " + total);

    }

}
