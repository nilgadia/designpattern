package org.shahid.behavioral.mediator.shahid.example1;

public class Button {

	private Fan fan;

    // constructor, getters and setters

    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}
