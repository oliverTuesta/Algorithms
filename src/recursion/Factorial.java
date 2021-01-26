package recursion;

public class Factorial {

    public static int getFactorial(int n){
        if (n == 1){
            return 1;
        }
        return getFactorial(n-1) * n;
    }

    public static int getFactorial2(int n){

        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        return factorial;

    }

}
