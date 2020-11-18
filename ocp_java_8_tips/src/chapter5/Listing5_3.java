/**
 * 
 */
package chapter5;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author maurizio
 *
 */
public class Listing5_3 {

	private static void test () {
		Stream<String> strings = Stream.of("hello", "world");
		Consumer<String> printString = System.out::println;
		strings.forEach(printString);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
