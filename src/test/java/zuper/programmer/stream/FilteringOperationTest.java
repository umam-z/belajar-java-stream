package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List<String> names = List.of("Mohammad", "Sirajul", "Umam", "Zuper", "Programmer");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
        names.stream().filter(name -> name.length() > 3).forEach(System.out::println);

    }

    @Test
    void tastDistinct() {
        List.of("Mohammad", "Sirajul", "Umam", "Zuper", "Programmer", "Programmer")
                .stream()
                .distinct().forEach(System.out::println);
    }
}
