
public class Main {
    public static void main(String[] args) {

        long start, end;
        long timeIterative, timeRecursive;
        System.out.printf("%2s%25s%25s\n","n","Iterative (ns)","Recursive (ns)");
        System.out.println("====================================================");
        for(int n=1; n<=20; n++){
            start = System.nanoTime();
            new fiboIteration();
            end = System.nanoTime();
            timeIterative = end  - start;

            start = System.nanoTime();
            new fibRecursion();
            end = System.nanoTime();
            timeRecursive = end  - start;

            System.out.printf("%2d%25d%25d\n",n,timeIterative,timeRecursive);

        }


}
}