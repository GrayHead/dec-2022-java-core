package lessons.lesson6_some.errorrs;

public class Main {

    public static void main(String[] args) {


//        int[] ints = {11, 22, 33};
//        try {
//            System.out.println(ints[1001]); // ArrayIndexOutOfBoundEx
//
//        } catch (RuntimeException e) {
//            //......
//        } finally {
//            System.out.println("sgfhasfdhasfdhsagfd");
//
//        }

        divide(100, 0);

    }

    public static void divide(int a, int b) throws RuntimeException {
        if (b == 0) {
            throw new ArithmeticException("msg!!!!!! b is 0");
        } else {
            System.out.println(a / b);
        }

    }


}

class CustomException extends Exception {


}


