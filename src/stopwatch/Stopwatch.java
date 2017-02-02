package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Kwankaew Uttama
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwach was stopped, in nanoseconds. */
	private long stopTime;
	/** status of stopwatch */
	private boolean running;

	/**
	 * Initialize of variable
	 */
	public Stopwatch() {
		this.startTime = 0;
		this.stopTime = 0;
		this.running = false;
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (this.running == false) {
			this.startTime = System.nanoTime();
			this.running = true;
		}
	}

	/** Stop the stopwatch if it is already running. */
	public void stop() {
		if (this.running) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}
	}

	/**
	 * Measure the elapsed time.
	 * 
	 * @return the elapsed time.
	 */
	public double getElapsed() {
		if (this.running) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		}
		return (this.stopTime - this.startTime) * NANOSECONDS;
	}

	/**
	 * @return the status of stopwatch.
	 */
	public boolean isRunning() {
		return this.running;
	}
}
