package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Mohammad");
        builder.add("Sirajul").add("Umam");

        Stream<String> build = builder.build();
        build.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> build = Stream.builder().add("Mohammad").add("Sirajul").add("Umam").build();
        build.forEach(System.out::println);
    }
}
