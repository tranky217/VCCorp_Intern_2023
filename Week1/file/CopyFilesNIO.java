package Week1.file;

import java.io.*;
import java.nio.file.*;
/**
 * Copy one file to another using low level byte streams, one byte at a time.
 * @author www.codejava.net
 */
public class CopyFilesNIO {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week1" + "\\" + "file" + "\\" + "Resources" + "\\";
        String path1 = path + "test1.txt";
        String path2 = path + "out.txt";

        String inputFile = path1;
        String outputFile = path2;

        try {
            long start = System.currentTimeMillis();
            byte[] allBytes = Files.readAllBytes(Paths.get(inputFile));

            Files.write(Paths.get(outputFile), allBytes);

            long end = System.currentTimeMillis();

            System.out.println("Copied in " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}