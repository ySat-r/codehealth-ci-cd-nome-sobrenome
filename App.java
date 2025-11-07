import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hi");

        System.out.println("---Menu---");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");

        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");

            default:
                System.out.println("0");
                break;
        }
    }
}