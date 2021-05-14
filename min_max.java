import java.util.*;
public class min_max{
    public static void main(String[] args){
        Integer[] num1 = {7,3,53,2,4,12,43,5432,2};
        int min = (int)Collections.min(Arrays.asList(num1));
        int max = (int)Collections.max(Arrays.asList(num1));
        System.out.println("Min"+min);
        System.out.println("Max"+max);
    }
}