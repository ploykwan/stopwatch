package stopwatch;

/**
 * Task 3: add double primitives from an array.
 * 
 * @author Kwankaew Uttama
 *
 */
public class SumDoublePrimitive implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private double[] values;

	/**
	 * Initialize SumDoublePrimitive class
	 * 
	 * @param counter
	 *            is times to add the number.
	 * 
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		// create array of values to add, before we start the timer
		values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
	}

	/**
	 * 
	 * Add the number from 1 to ARRAY_SIZE in primitive double type. If run terms more than
	 * or equals to length of value,it will reset to add number from 1 to
	 * ARREY_SIZE
	 * 
	 */
	@Override
	public void run() {
		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
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
		return String.format("Sum array of double primitives with count=%,d\n",
				counter);
	}
}
