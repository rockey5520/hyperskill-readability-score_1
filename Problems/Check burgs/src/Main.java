import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.length() > 3){
            if(input.endsWith("burg")){
                System.out.println("true");
                System.exit(0);
            }
        }
        System.out.println("false");
    }
}