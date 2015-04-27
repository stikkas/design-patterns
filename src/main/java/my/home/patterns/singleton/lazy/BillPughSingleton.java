package my.home.patterns.singleton.lazy;

/**
 *
 * @author Благодатских С.
 */
public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class SingletonHelper {

		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
