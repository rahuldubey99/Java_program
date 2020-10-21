import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class matrixMultiplay {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[][] = new int[3][3];
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    num1[i][j] = Integer.parseInt(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    num2[i][j] = Integer.parseInt(br.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = 0;
                for (int z = 0; z < 3; z++) {
                        num[i][j] = num[i][j] + (num1[i][z]*num2[z][j]);
                }
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
