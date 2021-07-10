package homework6;

public class Calculator {

    public static void main(String[] args) {

        int[]arr = new int[] { 10, 15, 20, 30, 50, };
        int totalSumArr = sum(arr);

        double a = 2.123;
        double b = 10.6387;

        System.out.println(totalSumArr);

    }
    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}

