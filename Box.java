public class Box {
    private int length;
    private int breadth;
    private int height;
    public void set_dimension(int l, int b, int h){
        length  = l;
        breadth = b;
        height  = h;

    }
    public void show_dimension(){
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
        System.out.println("Height:"+height);
    }
    public static void main(String[] args) {
    Box B1 = new Box();
    B1.set_dimension(12, 12, 1); 
    B1.show_dimension();       
    }
    
}