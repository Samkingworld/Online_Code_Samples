package Online_Code_Samples.Week4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFromFile {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples\\Week4\\read.txt");

        if(!file.exists()){
            System.out.println("File does not exist");
            return;
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))){
            String fromFile;

            while((fromFile = bufferedReader.readLine()) != null){
                System.out.println(fromFile);
            }
        } catch(IOException e){
            System.out.println("Could not read from file " + e.getMessage());
        }
    }
}
