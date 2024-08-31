package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {
    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 5) {
                        return "besar";
                    } else {
                        return "kecil";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> collect = Stream.of("Mohammad", "Sirajul", "Umam", "Ahmad", "Mustafa", "Jono")
                .collect(Collectors.groupingBy(name -> {
                    if (name.length() > 5) {
                        return "panjang";
                    } else {
                        return "pendek";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> number > 5));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> collect = Stream.of("Mohammad", "Sirajul", "Umam", "Ahmad", "Mustafa", "Jono")
                .collect(Collectors.groupingBy(name -> {
                    return name.length() > 5;

                }));

        System.out.println(collect);
    }
}
