package Week1.file;

import java.io.*;
import java.nio.file.*;
public class CopyFilesBin {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week1" + "\\" + "file" + "\\" + "Resources" + "\\";
        String path1 = path + "test1.txt";
        String path2 = path + "outbin.txt";

        String inputFile = path1;
        String outputFile = path2;

        try {
            FileInputStream fin = new FileInputStream(inputFile);
            FileOutputStream fout = new FileOutputStream(outputFile);
            int byteread;
            while((byteread = fin.read()) != -1){
                fout.write(byteread);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}