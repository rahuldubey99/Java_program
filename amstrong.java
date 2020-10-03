import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0,r=0;
        int  originalNumber, remainder;

        originalNumber = n;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            r += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (r == n)
            result =1;
        else
            result =0;
    System.out.print(result);
        }
}
