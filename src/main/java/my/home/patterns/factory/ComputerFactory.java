package my.home.patterns.factory;

import my.home.patterns.factory.model.Computer;
import my.home.patterns.factory.model.PC;
import my.home.patterns.factory.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}

}
