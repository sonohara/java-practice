import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HowToStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // filter
        System.out.println("filter ---------");
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

        // map
        System.out.println("map ---------");
        list.stream().map(i -> i * 2).forEach(System.out::println);

        // sorted
        System.out.println("sorted ---------");
        System.out.println("Integer.compare --------");
        list.stream().sorted((a, b) -> Integer.compare(a, b)).forEach(System.out::println);
        System.out.println("Comparator.naturalOrder --------");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("Comparator.reverseOrder --------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // allMatch
        System.out.println("allMatch ---------");
        boolean allMatch = list.stream().allMatch(i -> i % 2 == 0);
        System.out.println(allMatch);

        // anyMatch
        System.out.println("anyMatch ---------");
        boolean anyMatch = list.stream().anyMatch(i -> i % 2 == 0);
        System.out.println(anyMatch);

        // findAny
        // 適当に1つ取得する
        // 直列の場合は必ず先頭の要素となるので findFirst と変わらない
        // 並列の場合はランダムになる
        System.out.println("findAny ---------");
        System.out.println(list.stream().findAny().orElse(0));
        System.out.println(list.parallelStream().findAny().orElse(0));

        // findFirst
        // 先頭から1つ取得する
        System.out.println("findFirst ---------");
        System.out.println(list.stream().findFirst().orElse(0));
        System.out.println(list.parallelStream().findFirst().orElse(0));

        // Stream の連結
        System.out.println("concat ---------");
        Stream<Integer> concat = Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6));
        concat.forEach(System.out::println);
    }
}
