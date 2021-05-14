import java.util.*;
public class merge_sort {
    public static void sort(int[] x, int lower, int upper){
        int num1 = upper - lower;
        if(num1 <=1){
            return;
        }
        int num2 = lower + num1/2;
        sort(x, lower,num2);
        sort(x, num2, upper);
        int[] num3 = new int[num1];
        int y = lower, z = num2;
        for(int w= 0; w<num1; w++){
            if(y == num2){
                num3[w] =x[z++];
            }
            else if(z == upper){
                num3[w] = x[y++];
            }
            else if(x[z]<x[y]){
                num3[w] = x[z++];
            }
            else{
                num3[w] = x[y++];
            }
        }
        for(int w=0;w<num1; w++){
            x[lower+w] = num3[w];   
        }

    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1,y;
    System.out.println("Please choose number of arrays element");
    num1 = scanner.nextInt();
    int xyz[] = new int[num1];
    System.out.println("plz insert"+num1+"number of element:");
    for(y=0;y<num1;y++){
        xyz[y] =scanner.nextInt();
    }
    sort(xyz,0,num1);
    System.out.println("Result of array after sorting");
    for(y=0;y<num1;y++){
        System.out.print(xyz[y]+" ");    
    }
    
}
}