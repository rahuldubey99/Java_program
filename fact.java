import java.util.Scanner;
class fact{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = kb.nextInt();
        int f =1;
        while(n!=0){
            f=f*n;
            n--;
        }
        System.out.println("FACT:"+f);

    }
        
    
}