package Online_Code_Samples.Week4;

import java.io.*;

public class TryWithResources {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples\\Week4\\input.txt"));
                InputStreamReader ignored = new InputStreamReader(new FileInputStream("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples\\Week4\\input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Input/Output Exception: " + e.getMessage());
        }

    }

}

