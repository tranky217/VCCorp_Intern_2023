package Week2.serialize;

import Week2.collections.Employee;
import Week2.collections.Intern;
import Week2.collections.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Intern p = new Intern(1000);
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week2" + "\\" + "serialize" + "\\";
        String path1 = path + "employee.data";
        System.out.println(path1);
        try{
            FileOutputStream fileOut = new FileOutputStream(path1);
            ObjectOutputStream serializedObj = new ObjectOutputStream(fileOut);
            serializedObj.writeObject(p);

            serializedObj.close();
            fileOut.close();
            System.out.println("check file output");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
