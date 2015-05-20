package my.home.patterns.builder;

/**
 *
 * @author Благодатских С.
 */
public class Computer {
//required parameters

	private final String HDD;
	private final String RAM;
//optional parameters
	private final boolean graphicsCardEnabled;
	private final boolean bluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return graphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return bluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.graphicsCardEnabled = builder.graphicsCardEnabled;
		this.bluetoothEnabled = builder.bluetoothEnabled;
	}
//Builder Class

	public static class ComputerBuilder {
// required parameters

		private String HDD;
		private String RAM;
// optional parameters
		private boolean graphicsCardEnabled;
		private boolean bluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			HDD = hdd;
			RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.graphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.bluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
