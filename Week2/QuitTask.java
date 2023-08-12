package Online_Code_Samples.Week2;


import java.util.Scanner;


public class QuitTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.print("Write a word ");
            word = scanner.nextLine();

            if(word.equalsIgnoreCase("quit"))
                System.out.println();
            else
                System.out.println(word);

        } while(!word.toLowerCase().equalsIgnoreCase("quit"));

}}



