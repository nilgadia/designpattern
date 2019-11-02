package org.shahid.creational.singleton.wiki;

public final class Singleton {

    //private static final Singleton INSTANCE = new Singleton();
    private static volatile Singleton instance = null;

    private Singleton() {}

    /*public static Singleton getInstance() {
        return INSTANCE;
    }*/

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}