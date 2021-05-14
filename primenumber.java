import java.util.Scanner;

/**
 * primenumber
 */
public class primenumber {

    static boolean isPrimenumber(int n) {
        if (n == 0 || n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            if (isPrimenumber(i)) {
                System.out.println(i);
            }
        }
    }
}