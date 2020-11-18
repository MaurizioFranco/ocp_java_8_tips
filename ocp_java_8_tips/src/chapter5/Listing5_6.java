/**
 * 
 */
package chapter5;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author maurizio
 *
 */
public class Listing5_6 {

	private static void test() {
		Random random = new Random();
		Stream.generate(random::nextBoolean)
		.limit(2)
		.forEach(System.out::println);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}

}