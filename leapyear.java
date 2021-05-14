public class leapyear {
    static Boolean isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
            return true;
        return false;

    }

    public static void main(String[] args) {
        int a = 2024;
        if (isLeapYear(a)) {
            System.out.println("ths year is leapyear" + a);
        } else
            System.out.println("ths year isn't leapyear" + a);
    }
}
