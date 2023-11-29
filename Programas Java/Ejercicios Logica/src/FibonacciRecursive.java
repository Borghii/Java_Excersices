import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursive {
    public static void main(String[] args){
        int N=5;
        List<Integer> Fibonacci  = getFibonacci(N);

        System.out.print(Fibonacci);

    }

    static List<Integer> getFibonacci(int N){ 

        List<Integer> Fibonacci = new ArrayList<Integer>();
        helpFibonacci(N,Fibonacci);

        return  Fibonacci;
    }

    static void helpFibonacci(int N,List<Integer> Fibonacci){
        if (N <= 0) {
            return;
        } else if (N == 1) {
            Fibonacci.add(1);
        } else if (N == 2) {
            Fibonacci.add(1);
            Fibonacci.add(1);
        }
        else
        {
            helpFibonacci(N-1,Fibonacci);
            Fibonacci.add(Fibonacci.get(N-3)+Fibonacci.get(N-2));
        }
    }
    }


