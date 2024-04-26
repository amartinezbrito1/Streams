import java.math.BigInteger;
import java.util.stream.Stream;

class IntStreamProcessor {
    static BigInteger sumStream(Stream<BigInteger> stream, int stop) {
        return stream.limit(stop)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    static BigInteger sumEvens(Stream<BigInteger> stream, int stop) {
        return stream.filter(n -> n.mod(BigInteger.TWO).equals(BigInteger.ZERO))
                .limit(stop)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    static BigInteger sumPrimes(Stream<BigInteger> stream, int stop) {
        return stream.filter(n -> n.isProbablePrime(100)) // Use lambda expression instead of method reference
                .limit(stop)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    static BigInteger sumEveryThirdSquare(Stream<BigInteger> stream, int stop) {
        return stream.filter(n -> n.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
                .map(n -> n.pow(2))
                .limit(stop)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}