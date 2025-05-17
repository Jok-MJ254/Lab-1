public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while ( n > 1) {
            if (n % 2 == 0) {
                steps++;
            }
            steps++;
            n = n -1;

        }
        System.out.println(steps);

    }
}
