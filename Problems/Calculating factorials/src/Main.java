import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static long factorial(long n) {
        return LongStream.rangeClosed(1,n).reduce(1,(long x, long y)->x*y);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}