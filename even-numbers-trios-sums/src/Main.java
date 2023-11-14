import java.util.ArrayList;

public class Main {
    public static void  main(String[] args) {

            ArrayList<Integer> evenNumbers = new ArrayList<>();
            ArrayList<Integer> sums = new ArrayList<>();

            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);

        int n = evenNumbers.size();;
        for (int j = 0; j < n; j++) {
            for (int k = j+1; k < n; k++) {
                for (int z = k + 1; z < n; z++) {
                    int sum = evenNumbers.get(j) + evenNumbers.get(k) + evenNumbers.get(z);
                    if (!evenNumbers.contains(sum)) {
                        sums.add(sum);
                    }

                }
            }
                }
            }
        }
        System.out.println(sums.size());


    }
}

