import java.util.Scanner;
// import java.math.*;
public class assigment1 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    double radius= s.nextDouble();
    double perimeter;
    double area;
    if(radius>0){
        System.out.println((2 * radius * Math.PI));
        System.out.println((Math.PI * radius * radius));
      }
      else{
          System.out.println(" please enter non zero positive number ");
      }
}
        
}
