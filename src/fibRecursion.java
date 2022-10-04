public class fibRecursion {
    public static int fibRecursion(int n) {
        if (n == 0) return 0; // base case
        else if (n == 1) return 1; // base case
            // recursive call
        else return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}
