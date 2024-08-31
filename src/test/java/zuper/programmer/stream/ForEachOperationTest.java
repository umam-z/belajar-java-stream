package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .map(name -> {
                    System.out.println("sebelum nama diubah menaji kapital: " + name);
                    String upper = name.toUpperCase();
                    System.out.println("sesudah nama diubah menaji kapital: " + upper);
                    return upper;
                })
                .forEach(System.out::println);
    }

    @Test
    void testPeekAfter() {
        List.of("Ali", "Mohammad", "Sirajul", "Umam", "Gugraha", "Ayu")
                .stream()
                .peek(name -> System.out.println("sebelum nama diubah menjadi kapital: " + name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("sesudah nama diubah menjadi kapital: " + name))
                .forEach(name -> System.out.println("Final name: " + name));
    }
}
