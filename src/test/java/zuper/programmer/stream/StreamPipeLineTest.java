package zuper.programmer.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipeLineTest {
    @Test
    void testStreamPipeline() {
        System.out.println("Jarang digunakan");
        Stream<String> streamNames = List.of("Mohammad", "Sirajul", "Umam").stream();
        Stream<String> streamNamesToUpper = streamNames.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamNamesToUpper.map(upper -> "Mr. " + upper);
        streamMr.forEach(System.out::println);
    }

    @Test
    void testStreamPipelineOk() {
        System.out.println("Best Practice");
        List.of("Mohammad", "Sirajul", "Umam").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(mr -> System.out.println(mr));
    }
}
