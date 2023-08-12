package Online_Code_Samples.Week4;

import java.io.*;
import java.util.Scanner;

public class FileWriter {

    public static void writeToFile(String fileName) throws IOException {
        BufferedWriter writer = null;
        Scanner scanner = new Scanner(System.in);
        try {
            writer = new BufferedWriter(new java.io.FileWriter(fileName));
            String line;
            while ((line = scanner.nextLine()) != null && !line.equalsIgnoreCase("quit")) {
                writer.write(line + "\n");
            }
        } catch( FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (writer != null && scanner != null) {
                try {
                    writer.close();
                    scanner.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            writeToFile("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples\\Week4\\output.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
