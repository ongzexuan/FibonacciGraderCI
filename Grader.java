/**
 * Created by Petromyzontidae on 22/8/2015.
 */
public class Grader {

    public static void main(String[] args) {
        int score = 0;
        int score_max = 5;

        // Fibonacci
        // Test 1
        if (Fibonacci.fibonacci(1) == 0) {
            System.out.println("Test 1 Passed +1");
            score += 1;
        }

        // Test 2
        if (Fibonacci.fibonacci(2) == 1) {
            System.out.println("Test 2 Passed +1");
            score += 1;
        }

        // Test 3
        if (Fibonacci.fibonacci(3) == 1) {
            System.out.println("Test 3 Passed +1");
            score += 1;
        }

        // Test 4
        if (Fibonacci.fibonacci(5) == 3) {
            System.out.println("Test 4 Passed +1");
            score += 1;
        }

        // Test 5
        if (Fibonacci.fibonacci(10) == 34) {
            System.out.println("Test 5 Passed +1");
            score += 1;
        }

    }

}
