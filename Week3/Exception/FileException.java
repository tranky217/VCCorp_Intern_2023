package Week3.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// file not found, io exception -> checked exception
//  checked exception inherits directly from exception
public class FileException {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("somefile");

            int i = 0;
            while (i != -1) {
                i = reader.read();
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("io exception");
//            e.printStackTrace();
        } finally {
            try{
                if(reader != null) reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
