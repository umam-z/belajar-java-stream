package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AgregatOparationTest {
    @Test
    void testMax() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        Integer result = List.of(1, 2, 3, 4)
                .stream()
                .reduce(0, (valuee, item) -> valuee + item);
        System.out.println(result);

        // 1. value=0 item=1
        // 2. value=1 item=2
        // 3. value=3 item=3
        // 4. value=6 item=4

    }

    @Test
    void testFactorial() {
        Integer factorial = List.of(1, 2, 3, 4)
                .stream()
                .reduce(1, (valuee, item) -> valuee * item);
        System.out.println(factorial);

        // 1. value=1 item=1
        // 2. value=1 item=2
        // 3. value=2 item=3
        // 4. value=6 item=24

    }
}
