/**
 * 
 */
package chapter5;

import java.util.Arrays;

/**
 * @author maurizio
 *
 */
public class Listing5_4 {

	private static void test () {
		Arrays.stream("4, -9, 16".split(", "))
		.map(Integer::parseInt)
		.map(i -> (i < 0) ? -i : i)
		.forEach(System.out::println);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
