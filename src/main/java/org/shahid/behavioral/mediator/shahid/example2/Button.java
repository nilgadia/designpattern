package org.shahid.behavioral.mediator.shahid.example2;

public class Button {

	private Mediator mediator;

    // constructor, getters and setters

    public void press() {
        mediator.press();
    }
}
