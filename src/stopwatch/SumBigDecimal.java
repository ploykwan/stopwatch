package stopwatch;

/**
 * Task 5: add BigDecimal objects from an array.
 * @author Kwankaew Uttama
 *
 */
import java.math.BigDecimal;

public class SumBigDecimal implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private BigDecimal[] values;

	/**
	 * Initialize SumBigDecimal class
	 * 
	 * @param counter
	 *            is times to add the number.
	 * 
	 * 
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
		// create array of values to add, before we start the timer
		values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
	}

	/**
	 * 
	 * Add the number from 1 to ARRAY_SIZE in BigDecimal type. If run terms more
	 * than or equals to length of value,it will reset to add number from 1 to
	 * ARREY_SIZE
	 * 
	 */
	@Override
	public void run() {
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * 
	 * return the task have to do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n",
				counter);
	}
}
