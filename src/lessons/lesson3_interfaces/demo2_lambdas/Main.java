package lessons.lesson3_interfaces.demo2_lambdas;

public class Main {
    public static void main(String[] args) {

//        Calculate add = (a, b) -> a + b;
//        add.doCalculate(10, 20);
//
//        Calculate calculate = (a, b) -> a - b;


        doSomeCalculations(100, 200, (a, b) -> a + b);
    }

    public static int doSomeCalculations(int a, int b, Calculate callback) {
        return callback.doCalculate(a, b);
    }

}

@FunctionalInterface
interface Calculate {
    int doCalculate(int a, int b);

}
