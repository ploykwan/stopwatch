package stopwatch;

/**
 * Measures the elapsed time of each task.
 * 
 * @author Kwankaew Uttama
 *
 */
public class TaskTimer {
	/**
	 * Run a task, measures and prints its running time to console
	 * 
	 * @param task
	 *            is task to do.
	 */
	public void measureAndPrint(Runnable task) {
		Stopwatch timer = new Stopwatch();
		System.out.print(task.toString());
		timer.start();
		task.run();
		timer.stop();
		timer.getElapsed();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
