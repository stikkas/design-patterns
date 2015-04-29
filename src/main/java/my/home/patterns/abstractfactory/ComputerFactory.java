package my.home.patterns.abstractfactory;

import my.home.patterns.factory.model.Computer;

/**
 *
 * @author Благодатских С.
 */
public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
