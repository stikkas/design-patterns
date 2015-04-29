package my.home.patterns.factory.model;

import my.home.patterns.factory.model.Computer;

/**
 *
 * @author Благодатских С.
 */
public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

}
