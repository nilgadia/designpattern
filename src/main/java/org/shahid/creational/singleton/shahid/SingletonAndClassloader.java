package org.shahid.creational.singleton.shahid;

public class SingletonAndClassloader {

	private static Class getClass(String classname) throws ClassNotFoundException {
	    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    if(classLoader == null) 
	        classLoader = SingletonAndClassloader.class.getClassLoader();
	      return (classLoader.loadClass(classname));
	}
}
