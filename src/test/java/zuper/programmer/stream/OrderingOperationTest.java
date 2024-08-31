package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reversedOrder = Comparator.reverseOrder();
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .sorted(reversedOrder)
                .forEach(System.out::println);
    }
}
