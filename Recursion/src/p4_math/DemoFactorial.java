package p4_math;

public class DemoFactorial {
    public static void main(String[] args){
        System.out.println(Long.MAX_VALUE);
        System.out.println(factorial(21));
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
