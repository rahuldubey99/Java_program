/**
 * emp
 */
 class emp {
    int Reg_NO;
    static String comp = "Oracle";
    void display(){
        System.out.println("Reg: "+Reg_NO+" comp " +comp);
    }
    emp(int a){
        Reg_NO = a;
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        emp foo = new emp(123);
        foo.display();
    }
}
