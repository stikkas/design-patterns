package my.home.patterns.singleton.lazy;

public class DoubleCheckThreadSaveSingleton {

	private static DoubleCheckThreadSaveSingleton instance;

	private DoubleCheckThreadSaveSingleton() {
	}

	public static DoubleCheckThreadSaveSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckThreadSaveSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckThreadSaveSingleton();
				}
			}
		}
		return instance;
	}
}
