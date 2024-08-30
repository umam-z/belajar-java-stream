package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrivingOperationTest {
    @Test
    void testLimit() {
        List.of("Mohammad", "Sirajul", "Umam").stream().limit(1).forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Mohammad", "Sirajul", "Umam").stream().skip(3).forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu").stream()
                .takeWhile(name -> name.length() <= 3)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu").stream()
                .dropWhile(name -> name.length() <= 3)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> opsional = List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu").stream()
                .findAny();

        opsional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> opsional = List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu").stream()
                .findFirst();

        opsional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
