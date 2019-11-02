package org.shahid.behavioral.mediator.shahid.example2;

public class Fan {
	private Mediator mediator;
	private boolean isOn = false;

	// constructor, getters and setters


	public void turnOn() {
		mediator.start();
		isOn = true;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void turnOff() {
		isOn = false;
		mediator.stop();
	}
}
