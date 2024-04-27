import java.math.BigInteger;
import java.util.stream.Stream;

class StreamSource {
    static Stream<BigInteger> getPositiveIntegers() {
        return Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
    }

    static Stream<BigInteger> getFibonacciNumbers() {
        return Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
                        arr -> new BigInteger[]{arr[1], arr[0].add(arr[1])})
                .flatMap(arr -> Stream.of(arr[0], arr[1]));
    }

    static Stream<BigInteger> getTriangularNumbers() {
        return Stream.iterate(BigInteger.ZERO,
                n -> n.add(BigInteger.valueOf(n.intValue() + 1)));
    }
}

