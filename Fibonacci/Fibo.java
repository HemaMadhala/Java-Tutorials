package Fibonacci;

public class Fibo {
    public static void main(String[] args) {
        fib(5);
    }

    public static void fib(int n){
        int a=0,b=1,i=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while (i<=n) {
            int c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            i++;
        }
    }
}
