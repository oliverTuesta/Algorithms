package recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, Integer> memory = new HashMap<Integer, Integer>();

    public int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memory.get(n) != null){
            return memory.get(n);
        }
        memory.put(n, fibonacci(n-1) + fibonacci(n-2));
        return memory.get(n);

    }

}
