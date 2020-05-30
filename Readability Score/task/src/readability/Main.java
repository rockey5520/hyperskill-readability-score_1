package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //stage 1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().length() > 100 ?"HARD":"EASY");*/
        String regex =  ".a.a.";
        System.out.println("aaaa".matches(regex));
        System.out.println("aa".matches(regex));
        System.out.println("javac".matches(regex));
        System.out.println(".a.a".matches(regex));
        System.out.println("java.".matches(regex));
    }
}
