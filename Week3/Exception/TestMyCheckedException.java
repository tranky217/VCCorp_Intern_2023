package Week3.Exception;

public class TestMyCheckedException {
    public static void main(String[] args) throws MyException{
        String input = "abc123";
        testing(input);
    }
    private static void testing(String input) throws MyException{
        try{
            int result = Integer.parseInt(input);
            System.out.println(result);
        }catch (NumberFormatException e){
            throw new MyException("please check again your input", e, 400);
        }
    }
}


