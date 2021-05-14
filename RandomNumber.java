import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        int rand ;
        Random radnum = new Random();
        System.out.println("The result of the random are: " + radnum);
        for (rand = 0; rand<=7; rand++) {
            System.out.println(radnum.nextInt(200)+'\n');
        }
    }    
}
