package recursivefunctions;

public class Main {
    public static void main(String[] args) {

        /*
        Factorial
         */
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));



        /*
        Fibonacci
         */
        Fibonacci fibonacci = new Fibonacci();
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci.fibonacci(i));
        }

    }
}
