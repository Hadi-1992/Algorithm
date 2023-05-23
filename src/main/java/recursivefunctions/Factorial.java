package recursivefunctions;

public class Factorial {
    public int factorial(int a){
        if (a <= 1) {
            return a;
        }else {
            return a * factorial(a-1);
        }
    }
}
