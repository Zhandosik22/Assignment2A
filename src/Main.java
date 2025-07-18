public class Main {

    // Problem 1: Find minimum in array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    // Time complexity: O(n)

    // Problem 2: Calculate average
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }
    // Time complexity: O(n)

    // Problem 3: Prime check (recursive)
    public static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int i) {
        if (n < 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrimeHelper(n, i + 1);
    }
    // Time complexity: O(√n)

    // Problem 4: Factorial
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    // Time complexity: O(n)

    // Problem 5: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Time complexity: O(2^n)

    // Problem 6: Power a^n
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    // Time complexity: O(n)

    // Problem 7: Reverse print array
    public static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }
    // Time complexity: O(n)

    // Problem 8: Check if string is all digits
    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    // Time complexity: O(n)

    // Problem 9: Binomial Coefficient
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    // Time complexity: O(2^n)

    // Problem 10: GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    // Time complexity: O(log n)

    public static void main(String[] args) {
        System.out.println("Problem 1: " + findMin(new int[]{10, 1, 32, 3, 45}));
        System.out.println("Problem 2: " + findAverage(new int[]{3, 2, 4, 1}));
        System.out.println("Problem 3: " + isPrime(7));
        System.out.println("Problem 4: " + factorial(5));
        System.out.println("Problem 5: " + fibonacci(5));
        System.out.println("Problem 6: " + power(2, 10));
        System.out.print("Problem 7: "); reversePrint(new int[]{1, 4, 6, 2}, 3); System.out.println();
        System.out.println("Problem 8: " + isAllDigits("123456"));
        System.out.println("Problem 9: " + binomial(7, 3));
        System.out.println("Problem 10: " + gcd(32, 48));
    }
}