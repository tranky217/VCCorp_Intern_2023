package Week3.Exception;

// null pointer -> unchecked
// inherit from runtime exception
public class StrException {
    static String str;
    public static void main(String[] args) {
        try{
            System.out.println("Before exception");
            StrLength();
            System.out.println("After exception");
        }catch(NullPointerException e){
            System.out.println("String is null");
//            e.printStackTrace();
        }finally {
            System.out.println("Jump to finally");
        }
    }

    static void StrLength(){
        System.out.println(str.length());
    }
}
