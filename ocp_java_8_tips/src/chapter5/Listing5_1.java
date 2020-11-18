/**
 * 
 */
package chapter5;

import java.util.function.Predicate;

/**
 * @author maurizio
 *
 */
public class Listing5_1 {

	private static void test () {
		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		String helloStr = "hello";
		System.out.println(nullAndEmptyCheck.test(helloStr));
		String nullStr = null;
		System.out.println(nullAndEmptyCheck.test(nullStr));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        test();
	}

}
