import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        int cases, number;
        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            number = sc.nextInt();
            int factorial = 1;
            for (int j = 1; j <= number; j++)
                factorial*=j;
            System.out.println(factorial% 10);
        }
    }
}