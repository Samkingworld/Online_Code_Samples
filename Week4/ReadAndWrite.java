package Online_Code_Samples.Week4;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try{
            Path path = Paths.get("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples.Week4\\read.txt");
            File readFile = path.toFile();
            bufferedReader = new BufferedReader(new FileReader(readFile));
            StringBuilder toWrite = new StringBuilder();
            if(readFile.isFile()){
                String readLine;
                while((readLine = bufferedReader.readLine()) != null ){
                    toWrite.append(readLine).append("\n");
                }
            } else {
                System.out.println("Document is not a file");
            }
            System.out.println(toWrite);
            File writeFile = new File("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Code_Samples.Week4\\readwrite.txt");
            bufferedWriter = new BufferedWriter(new java.io.FileWriter(writeFile));
            Scanner scanner = new Scanner(System.in);

            String input;
            while( !(input = scanner.nextLine()).equals("eof") ){
                toWrite.append(input).append("\n");
            }
            bufferedWriter.write(toWrite.toString());

        } catch(IOException | SecurityException fe){
            System.out.println("File " + fe.getMessage() );
        } finally{
            try{
                if( bufferedReader != null ){
                    bufferedReader.close();
                }

                if( bufferedWriter != null ){
                    bufferedWriter.close();
                }
            } catch( IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
