package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitifStreamTest {
    @Test
    void testCreate() {
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 67, 8, 9);
        IntStream range = IntStream.range(1, 20);
        numbers.forEach(System.out::println);

        LongStream range2 = LongStream.range(1, 10);
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
    }

    @Test
    void testOperations() {
        IntStream numbers = IntStream.builder().add(1).add(2).add(3).add(4).add(5).add(6).build();

        OptionalDouble average = numbers.average();
        average.ifPresent(System.out::println);

        IntStream.range(1,10)
                .mapToObj(name -> "Nomor: " + String.valueOf(name))
                .forEach(System.out::println);
    }
}
