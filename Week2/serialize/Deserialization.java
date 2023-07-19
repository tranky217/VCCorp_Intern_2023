package Week2.Serialize;

import Week2.Collections.Intern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        Intern i = null;
        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\" + "VCCorp_Intern_2023" + "\\" + "Week2" + "\\" + "serialize" + "\\";
        String path1 = path + "employee.data";
        System.out.println(path1);
        try{
            FileInputStream fileIn = new FileInputStream(path1);
            ObjectInputStream deserializedObj = new ObjectInputStream(fileIn);

            i = (Intern) deserializedObj.readObject();

            deserializedObj.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(i.getTemp_salary());
    }
}
