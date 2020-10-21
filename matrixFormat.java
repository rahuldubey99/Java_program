import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrixFormat {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    num[i][j] = Integer.parseInt(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
