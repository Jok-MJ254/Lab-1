public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        int max = 1000 ;
        while (number < max) {
            if (number % 3 == 0 || number % 5 == 0) {
                count++;
            }
            number++;
        }
        System.out.println(count);
    }
}
