package Week1.file;

import java.io.*;
import java.io.File;

public class ListAndRead {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week1" + "\\" + "file" + "\\" + "Resources";

        File dir =  new File(path);

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(path + "\\" +file.getName()));
                        String line;
                        while((line = reader.readLine()) != null){
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
        }
    }
}
