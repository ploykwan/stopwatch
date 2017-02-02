package stopwatch;

/**
 * Task1: Append chars to a string
 * 
 * @author Kwankaew Uttama
 *
 */
public class AppendToString implements Runnable {
	/** length of string. */
	private int count;

	/**
	 * Initialize the length of String.
	 * 
	 * @param count
	 *            is the length of String.
	 */
	public AppendToString(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to the String until the String filled and print the final
	 * string length.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	/**
	 * 
	 * return the task have to do.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}