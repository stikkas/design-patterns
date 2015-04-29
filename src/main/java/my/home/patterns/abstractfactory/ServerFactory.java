package my.home.patterns.abstractfactory;

import my.home.patterns.factory.model.Computer;
import my.home.patterns.factory.model.Server;

/**
 *
 * @author Благодатских С.
 */
public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
