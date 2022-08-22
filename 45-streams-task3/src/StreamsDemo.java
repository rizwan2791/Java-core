import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jay", "Nimish", "Mark", "Mahesh", "Ramesh");
		names.stream().limit(3).sorted().forEach(System.out::println);
		System.out.println("--------------");
		List<String> names1 = Arrays.asList("Jay", "Nimish", "Mark", "Mahesh", "Ramesh");
		names1.stream().filter(a -> a.contains("a")).sorted().forEach(System.out::println);
		System.out.println("---------------------");
		List<String> names2 = Arrays.asList("Jay", "Nimish", "Mark", "Mahesh", "Ramesh");
		names2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("-------------------------");
		List<String> names3 = Arrays.asList("Jay", "Nimish", "Mark", "Mahesh", "Ramesh");
		names3.stream().map(n -> n.substring(0, 3)).sorted().forEach(System.out::println);
		System.out.println("------------------------");
		List<String> names4 = Arrays.asList("Jay", "Nimish", "Mark", "Mahesh", "Ramesh");
		names4.stream().filter(n -> n.length() <= 4).forEach(System.out::println);

	}

}
