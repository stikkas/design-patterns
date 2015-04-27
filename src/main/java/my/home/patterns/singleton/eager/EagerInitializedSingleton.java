package my.home.patterns.singleton.eager;

/**
 * Singleton Class with eager intialization
 *
 * @author Благодатских С.
 */
public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
