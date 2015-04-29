package my.home.patterns.factory.test;

import my.home.patterns.abstractfactory.ComputerFactory;
import my.home.patterns.abstractfactory.PCFactory;
import my.home.patterns.abstractfactory.ServerFactory;
import my.home.patterns.factory.model.Computer;

public class TestAbstractFactory {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc
				= ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server
				= ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}

}
