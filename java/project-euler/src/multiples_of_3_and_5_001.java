public class multiples_of_3_and_5_001 {



    public static void main(String[] args) {
        System.out.println(new multiples_of_3_and_5_001().run());
    }

    public String run() {

        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return Integer.toString(sum);
    }
}
