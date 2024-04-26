import java.math.BigInteger;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        // Create streams
        Stream<BigInteger> positiveIntegers = StreamSource.getPositiveIntegers();
        Stream<BigInteger> fibonacciNumbers = StreamSource.getFibonacciNumbers();
        Stream<BigInteger> triangularNumbers = StreamSource.getTriangularNumbers();

        // Process streams
        int stop = 10;
        BigInteger sum = IntStreamProcessor.sumStream(positiveIntegers, stop);
        BigInteger evenSum = IntStreamProcessor.sumEvens(fibonacciNumbers, stop);
        BigInteger primeSum = IntStreamProcessor.sumPrimes(triangularNumbers, stop);
        BigInteger everyThirdSquareSum = IntStreamProcessor.sumEveryThirdSquare(positiveIntegers, stop);

        // Print results
        System.out.println("Sum of the first " + stop + " positive integers: " + sum);
        System.out.println("Sum of the first " + stop + " even Fibonacci numbers: " + evenSum);
        System.out.println("Sum of the first " + stop + " prime triangular numbers: " + primeSum);
        System.out.println("Sum of the squares of the first " + stop + " positive integers divisible by 3: " + everyThirdSquareSum);
    }
}
