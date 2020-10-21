 class First {
    int x;
    public First(int x){
        this.x = x;

    }
    protected void finalize() throws Throwable{
        System.out.println("Welcome to finalize in java programming"+x);
    }
    public static void main(String[] args) {
        
    }
}
public class FinalizeKeyword{
    public static void main(String[] args) {
        First foo = new First(24);
    }
}
