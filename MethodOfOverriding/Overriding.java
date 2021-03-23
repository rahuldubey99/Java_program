package MethodOfOverriding;
class First{
    int x, y;
    First(int x,int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("x :"+x+"\n y :"+y);

    }
}
/**
 * Second
 */
class Second extends First{

    int z;
    Second(int x, int y, int z){
        super(x,y);
        this.z = z;

    }
    void display(){
        super.display();
        System.out.println("z :"+z);
    }
}
public class Overriding {
    public static void main(String[] args) {
        Second luv = new Second(1,3,4);        
        luv.display();
    }    
}
