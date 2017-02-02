package stopwatch;

/**
 * Task 4: add Double objects from an array.
 * 
 * @author Kwankaew Uttama
 *
 */
public class SumDouble implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private Double[] values;

	/**
	 * Initialize SumDouble class
	 * 
	 * @param counter
	 *            is times to add the number.
	 * 
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		// create array of values to add, before we start the timer
		values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
	}
	
	/**
	 * 
	 * Add the number from 1 to ARRAY_SIZE in Double type. If run terms more
	 * than or equals to length of value,it will reset to add number from 1 to
	 * ARREY_SIZE
	 * 
	 */
	@Override
	public void run() {
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * 
	 * return the task have to do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n",
				counter);
	}
}
