import java.util.Scanner;

public class findgreater {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      int z = s.nextInt();
        int result = 0;
        if(x>=y && x>=z)
                 System.out.print(x);
        else if(y>=x && y>=z)
                     System.out.print(y);
        else 
            System.out.print(z);
    
    }
}
