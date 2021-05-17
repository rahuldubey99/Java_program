import java.util.Scanner;

public class perfectsquare {
    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (isPerfectSquare(n)) {
            System.out.println("Perfect square ");
        } else {
            System.out.println("not Perfect square ");
        }

    }

}
