package MethodOverloading;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Overloading{
    int sum(int num1,int num2){
        return(num1+num2);

    }
     int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 

}
class MethodCalling {
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two no");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine()); 
        Overloading ol = new Overloading();
     
     
        System.out.println("Sum:"+ol.sum(x, y, 25));
        // System.out.println("Sum:"+ol.sum(x, y));
    }    
}
