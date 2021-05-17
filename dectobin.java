public class dectobin {
    static void convert(int n) {
        int bin[] = new int[40];
        int i = 0;
        while (n > 0) {
            bin[i++] = n % 2;
            n = n / 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary number is");
        convert(10);
    }
}
