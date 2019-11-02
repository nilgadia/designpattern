package org.shahid.creational.singleton.shahid;

public class Singleton {

    private static  Singleton instance = new Singleton();

    //private constructor.
    private Singleton(){
    	if(instance!=null) {
    		throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    	}
    }

    public static Singleton getInstance() {
        return instance;
    }

    protected Singleton readResolve() {
        return getInstance();
    }
}
