package my.home.patterns.singleton.lazy;

/**
 *
 * @author Благодатских С.
 */
public class ThreadSaveSingleton {

	private static ThreadSaveSingleton instance;

	private ThreadSaveSingleton() {
	}

	public static synchronized ThreadSaveSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSaveSingleton();
		}
		return instance;
	}

}
