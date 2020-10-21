import java.io.BufferedReader;
import java.io.InputStreamReader;



class Emp{
    int Reg_no, Rt1, Rt2, Rt3 ;
    String name;
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    void GetInput() throws Exception{
        System.out.println("PLz Enter Employee Detalils");
        Reg_no = Integer.parseInt(br.readLine());
        name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());

    }
    void Display(){
        System.out.println("Reg_no :"+Reg_no);
        System.out.println("name :"+name);
        System.out.println("Rt1 :"+Rt1);
        System.out.println("Rt2 :"+Rt2);
        System.out.println("Rt3 :"+Rt3);
    }
}    
class Output extends Emp{
        int avg ;
        float percentage;
        void evaluate() throws Exception{
            GetInput();
            avg = Rt1 + Rt2 + Rt3;
            percentage = (float)avg/3;
        }
        void screenShow(){
            System.out.println("avg:"+avg);
            System.out.println("percentage :"+percentage);
        }
    }
public class javaintface{
    public static void main(String[] args) throws Exception {
    Output foo = new Output();
        foo.evaluate();
        foo.screenShow();
}
}

 
