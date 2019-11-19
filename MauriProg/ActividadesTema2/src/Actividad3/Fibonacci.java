package Actividad3;

public class Fibonacci {
    static int[] serieFib;

    public static int Fib(int n){
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return Fib(n-1) + Fib(n-2);
    }

    public static void main(String[] args) {
        serieFib = new int [20];
        System.out.println(Fib(10));
    }
}
