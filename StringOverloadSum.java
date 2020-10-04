
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Overload{
    String add(String s1, String s2){
        return (s1+s2);
    }
}
public class StringOverloadSum  {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Enter Two String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String y = br.readLine();
        Overload ol = new Overload();
        System.out.println("String Sum :"+ol.add(x, y));

    }
}
