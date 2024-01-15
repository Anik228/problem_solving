//A. Satisfying Constraints

import java.util.*;

public class code1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();

        while (tt-- > 0) {
            int n = scanner.nextInt();

            int lowerBound = 0;
            int upperBound = 1000000000; 

            Set<Integer> set = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                int operation = scanner.nextInt();
                int value = scanner.nextInt();

                if (operation == 1) {
                    lowerBound = Math.max(lowerBound, value);
                } else if (operation == 2) {
                    upperBound = Math.min(upperBound, value);
                } else {
                    set.add(value);
                }
            }

            int answer = upperBound - lowerBound + 1;
        

            for (int val : set) {
                if (lowerBound <= val && val <= upperBound) {
                    answer =answer - 1;
                    
                }
            }

            System.out.println(answer > 0 ? answer : 0); 

            set.clear();
        }
    }
}
