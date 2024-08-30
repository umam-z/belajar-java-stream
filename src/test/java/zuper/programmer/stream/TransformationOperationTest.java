package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap() {
        List.of("Mohammad", "Sirajul", "Umam").stream()
                .map(names ->  names.toUpperCase() )
                .map(nUpper -> nUpper.length())
                .forEach(System.out::println);
    }

    @Test
    void testFlatmap() {
        List.of("Mohammad", "Sirajul", "Umam").stream()
            .map(names ->  names.toUpperCase() )
                .flatMap(stream -> Stream.of(stream, stream.length()))
                .flatMap(value -> Stream.of(value, value, value))
            .forEach(System.out::println);
    }
}
