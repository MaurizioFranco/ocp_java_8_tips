/**
 * 
 */
package chapter5;

import java.util.stream.Stream;

/**
 * @author maurizio
 *
 */
public class Listing5_0 {

	private static void test () {
		Stream.of("hello", "world")
		.filter(str -> str.startsWith("h"))
		.forEach(System.out::println);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
