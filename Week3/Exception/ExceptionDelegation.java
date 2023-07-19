package Week3.Exception;

public class ExceptionDelegation {
    public static void main(String[] args) throws ArithmeticException{
//        try{
//            System.out.println(divide(9, 3));
//
//            // exception
//            int num = divide(9, 0);
//            System.out.println(num);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        System.out.println(divide(9, 3));
        int num = divide(9, 0);
        System.out.println(num);
    }

    static int divide(int n1, int n2) throws ArithmeticException{
        if(n2 == 0){
            throw new ArithmeticException("can not divide by 0");
        }
        int num = n1 / n2;
        return num;
    }
}
