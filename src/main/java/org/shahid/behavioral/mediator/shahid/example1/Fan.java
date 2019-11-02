package org.shahid.behavioral.mediator.shahid.example1;

public class Fan {
    private Button button;
    private PowerSupplier powerSupplier;
    private boolean isOn = false;

    // constructor, getters and setters



    public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }

    public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public PowerSupplier getPowerSupplier() {
		return powerSupplier;
	}

	public void setPowerSupplier(PowerSupplier powerSupplier) {
		this.powerSupplier = powerSupplier;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }
}
