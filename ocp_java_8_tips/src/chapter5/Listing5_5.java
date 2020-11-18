/**
 * 
 */
package chapter5;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author maurizio
 *
 */
public class Listing5_5 {

	private static void test() {
		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> absInt = Math::abs;
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
		Arrays.stream("4, -9, 16".split(", ")).map(parseAndAbsInt).forEach(System.out::println);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}

}
