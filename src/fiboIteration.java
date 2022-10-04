public class fiboIteration {
    public int fiboIteration(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        int n1 = 0, n2 = 1, next = 0;
        for (int term = 2; term <= n; term++) {
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        return next;
    }
}
