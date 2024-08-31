package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    void testAnyMatch() {
        boolean match = List.of(1, 2, 3, 21, 4, 5, 6, 7, 8, 9)
                .stream()
                .anyMatch(name -> name > 20);

        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1, 2, 3, 21, 4, 5, 6, 7, 8, 9)
                .stream()
                .allMatch(name -> name > 0);

        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = List.of(1, 2, 3, 21, 4, 5, 6, 7, 8, 9)
                .stream()
                .noneMatch(name -> name > 23);

        System.out.println(match);
    }
}
