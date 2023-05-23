package recursivefunctions;

public class Fibonacci {
    public int fibonacci(int a) {
        if (a == 0 || a == 1) {
            return a;
        } else return fibonacci(a - 1) + fibonacci(a - 2);
    }
}
