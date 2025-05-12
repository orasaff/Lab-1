/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {    // 1. method main must be defined

        int i = 1;
        while (i <= 100) {

            i = playFizzBuzz(i);
        }
    }

    private static int playFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0; // 2. uses ; to end statements
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // 3. open and ends a for or if statement by {}

            System.out.println("Fizz Buzz"); // 4. print statement is different from python

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
