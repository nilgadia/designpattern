package org.shahid.creational.singleton.shahid;

public class SingletonAndCloneble implements Cloneable {
	private static SingletonAndCloneble instance;

	private SingletonAndCloneble() {
		// Private constructor prevents instantiation by untrusted callers
	}

	// Lazy initialization
	public static synchronized SingletonAndCloneble getInstance() {
		if (instance == null) {
			instance = new SingletonAndCloneble();
		}
		return instance;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
