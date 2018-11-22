import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSample {
  public static void main(String[] args) {
    Stream<String> originalStream = Arrays.stream(new String[] { "あ", "い", "う", "え", "お" });
    Stream<String> stream1 = originalStream.filter(value -> !value.equals("あ"));
    stream1.forEach(value -> System.out.println("value=" + value));
    // 例外発生 (一つのStreamインスタンスに対して複数回実行すると例外が発生するので必ずインスタンスは作り直す)
    // Stream<String> stream2 = originalStream.filter(value -> !value.equals("い"));
    // stream2.forEach(value -> System.out.println("value=" + value));

    Stream<String> originalStream2 = Arrays.stream(new String[] { "あ", "い", "う", "え", "お" });
    Stream<String> stream2 = originalStream2.filter(value -> !value.equals("あ"));
    stream2.forEach(value -> System.out.println("value=" + value));

  }
}