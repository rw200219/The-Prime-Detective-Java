import java.util.ArrayList;

class PrimeDirective {

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find only prime numbers
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        // Test the isPrime() method
        System.out.println(pd.isPrime(7));  // should print true
        System.out.println(pd.isPrime(28)); // should print false
        System.out.println(pd.isPrime(2));  // should print true
        System.out.println(pd.isPrime(0));  // should print false

        // Test the onlyPrimes() method
        System.out.println(pd.onlyPrimes(numbers)); // should print [29, 11, 101, 43, 89]
    }
}