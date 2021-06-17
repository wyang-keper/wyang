package Client;

import Facade.Computer;

public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();  
		computer.startup();  
		computer.shutdown();
	}

}
