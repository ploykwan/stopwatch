package stopwatch;

/**
 * Task 2: append chars to a StringBuilder
 * 
 * @author Kwankaew Uttama
 *
 */
public class AppendToStringBuilder implements Runnable {
	/** length of string. */
	private int count;

	/**
	 * Initialize the length of string.
	 * 
	 * @param count
	 *            is the length of string.
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to stringbuilder until the string filled and print the final
	 * string length.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
		// now create a String from the result, to be compatible with task 1.
		System.out.println("final string length = " + result.length());
	}

	/**
	 * 
	 * return the task have to do.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);
	}
}
