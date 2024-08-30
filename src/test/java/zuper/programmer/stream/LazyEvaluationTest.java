package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOparation() {
        List.of("Mohammad", "Sirajul", "Umam").stream()
                .map(name -> {
                    System.out.println("Ubah " + name + "Menjadi Kapital");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOparation() {
        List.of("Mohammad", "Sirajul", "Umam").stream()
                .map(name -> {
                    System.out.println("Ubah " + name + " Menjadi Kapital");
                    return name.toUpperCase();
                }).map(upper -> {
                    System.out.println("Tambah Mr. pada " + upper );
                    return "Mr . " + upper;
                })
                .forEach(upperMr -> System.out.println(upperMr));
    }
}
