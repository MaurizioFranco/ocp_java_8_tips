/**
 * 
 */
package chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maurizio
 *
 */
public class Listing5_2 {

	private static void test () {
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		greeting.removeIf(str -> !str.startsWith("h"));
		greeting.forEach(System.out::println);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
