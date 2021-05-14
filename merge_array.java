import java.util.*;
public class merge_array {
    public static void main(String[] args) {
        String x[] = { "H","E","L","L","O"};
        String y[] = { "W","O","R","L","D"};
        List ls = new ArrayList(Arrays.asList(x));
        ls.addAll(Arrays.asList(y));
        System.out.println(ls);
        Object[] z = ls.toArray();
        System.out.println(Arrays.toString(z));
    }
}
