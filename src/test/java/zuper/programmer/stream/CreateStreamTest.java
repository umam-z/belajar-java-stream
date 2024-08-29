package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> singleStream = Stream.of("Mohammad");
        singleStream.forEach((data)->{
            System.out.println(data);
        });
        Stream<String> emptyOrNO = Stream.ofNullable(null);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> stringStream = Stream.of("Mohammad", "Sirajul", "Umam");
        stringStream.forEach(data -> {
            System.out.println(data);
        });
        Integer[] numbers = new Integer[] {1,2,3,4,5};

        Stream<Integer> streamFromArray = Arrays.stream(numbers);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> names = List.of("Mohamad", "Sirajul", "Umam");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> generate = Stream.generate(() -> "Zuper Programmer");
        Stream<Integer> iterate = Stream.iterate(1, integer -> integer + 1);
    }
}
