public class swapnumber {

    public static void Swapnumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " SWap " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 4;
        System.out.println(a + " " + b);
        Swapnumber(a, b);
    }
}
