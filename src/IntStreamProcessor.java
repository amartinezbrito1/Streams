import java.math.BigInteger;
import java.util.stream.Stream;

class IntStreamProcessor {
    static BigInteger sumStream(Stream<BigInteger> stream, int stop) {
        try (Stream<BigInteger> closedStream = stream) {
            return closedStream.limit(stop)
                    .reduce(BigInteger.ZERO, BigInteger::add);
        }
    }

    static BigInteger sumEvens(Stream<BigInteger> stream, int stop) {
        try (Stream<BigInteger> closedStream = stream.filter(n -> n.mod(BigInteger.TWO).equals(BigInteger.ZERO))) {
            return closedStream.limit(stop)
                    .reduce(BigInteger.ZERO, BigInteger::add);
        }
    }

    static BigInteger sumPrimes(Stream<BigInteger> stream, int stop) {
        try (Stream<BigInteger> closedStream = stream.filter(n -> n.isProbablePrime(100))) {
            return closedStream.limit(stop)
                    .reduce(BigInteger.ZERO, BigInteger::add);
        }
    }

    static BigInteger sumEveryThirdSquare(Stream<BigInteger> stream, int stop) {
        try (Stream<BigInteger> closedStream = stream.filter(n -> n.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
                .map(n -> n.pow(2))) {
            return closedStream.limit(stop)
                    .reduce(BigInteger.ZERO, BigInteger::add);
        }
    }
}