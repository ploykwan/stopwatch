package stopwatch;

/**
 * Main class
 * 
 * @author Kwankaew Uttama
 *
 */
public class Main {
	/**
	 * Run the task.
	 * 
	 */
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		Runnable[] task = {
				new AppendToString(50000), 
				new AppendToString(100000),
				new AppendToStringBuilder(100000), 
				new SumDoublePrimitive(1000000000), 
				new SumDouble(1000000000),
				new SumBigDecimal(1000000000)
		};
		for(int i = 0 ; i < task.length ; i++ ){
			timer.measureAndPrint(task[i]);
		}
	}
}
