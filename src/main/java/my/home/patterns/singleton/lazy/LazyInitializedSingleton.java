package my.home.patterns.singleton.lazy;

/**
 * Singleton Class with lazy intialization
 *
 * @author Благодатских С.
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

}
