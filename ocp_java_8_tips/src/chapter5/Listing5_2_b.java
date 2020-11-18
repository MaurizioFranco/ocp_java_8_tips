/**
 * 
 */
package chapter5;

import java.util.function.Consumer;

/**
 * @author maurizio
 *
 */
public class Listing5_2_b {

	private static void test () {
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
