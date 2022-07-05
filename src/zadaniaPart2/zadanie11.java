package zadaniaPart2;

public class zadanie11 {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        fib(7);
    }
    static int fibonacci(int element) {
        if (element <= 1)
        return element;

        return fibonacci(element -1)+fibonacci(element-2);
    }
    static void fib(int element){
            long n1 = 0;
            long n2 = 1;
            do {
                System.out.print(n1 + " ");
                long n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

            } while (element-- > 0);
    }
}


