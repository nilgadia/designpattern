package org.shahid.behavioral.command.pluralsight;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
