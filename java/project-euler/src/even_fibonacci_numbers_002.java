public class even_fibonacci_numbers_002 {

    public static void main(String[] args) {
        System.out.println(new even_fibonacci_numbers_002().run());
    }

    public String run() {
        int sum = 0;
        int x = 1;  // represents the current Fibonacci number being processed
        int y = 2;  // represents the next Fibonacci number in the sequence
        while (x <= 4000000) {
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y;
            y = z;
        }
        return Integer.toString(sum);
    }
}
