package Week1.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week1" + "\\" + "file" + "\\" + "Resources" + "\\";
        String path1 = path + "test2.txt";
        String path2 = path + "out2.txt";

        String inputFile = path1;
        String outputFile = path2;

        FileReader reader;
        FileWriter writer;

        {
            try {
                reader = new FileReader(inputFile);
                try {
                    writer = new FileWriter(outputFile);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                int character;
                while((character = reader.read()) != -1){
                    System.out.println(character);
                    writer.write(character);

                }
                writer.close();
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
