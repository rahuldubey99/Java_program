class FirstSuper{

    int x, y;
    FirstSuper(int x, int y){
        this.x = x;
        this.y = y;
    }
    void Show(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}

class SecondSuper extends FirstSuper{
    int z;
    SecondSuper(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    void Show(){
        super.Show();
        System.out.println("z : "+z);

    }
    
}
public class useSuper {
    public static void main(String[] args) {
        SecondSuper foo = new SecondSuper(1,2,3);
        foo.Show();
    }   
}
