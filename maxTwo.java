public class maxTwo {
    static void MaxTwo(int[] num) {
        int max1 = 0, max2 = 0;
        for (int i : num) {
            if (max1 < i) {
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max2 = i;
            }

        }
        System.out.println("the first maximum number is" + max1);
        System.out.println("the second maximum number is" + max2);
    }

    public static void main(String[] args) {
        int num[] = { 43, 78, 7, 34, 100, 500, 432, 500, 12, 7, 3 };
        MaxTwo(num);
    }
}
