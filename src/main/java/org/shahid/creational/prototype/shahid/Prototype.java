package org.shahid.creational.prototype.shahid;

import java.util.HashMap;
import java.util.Map;


//Driver class
public class Prototype {

	public static void main(String[] args) {
		ColorStore.getColor(ColorConstant.BLUE).addColor();
		ColorStore.getColor(ColorConstant.BLACK).addColor();
		ColorStore.getColor(ColorConstant.BLACK).addColor();
		ColorStore.getColor(ColorConstant.BLUE).addColor();
	}
}
abstract class Color implements Cloneable {

	protected String colorName;

	abstract void addColor();

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return clone;
	}
}

class BlueColor extends Color {
	public BlueColor() {
		this.colorName = ColorConstant.BLUE;
	}

	@Override
	void addColor() {
	}

}

class BlackColor extends Color {

	public BlackColor() {
		this.colorName = ColorConstant.BLACK;
	}

	@Override
	void addColor() {
	}
}

class ColorStore {
	private static Map<String, Color> colorMap = new HashMap<>();
	private ColorStore() {}
	static {
		colorMap.put(ColorConstant.BLUE, new BlueColor());
		colorMap.put(ColorConstant.BLACK, new BlackColor());
	}
	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}
}
class ColorConstant {
	private ColorConstant(){}
	public static final String BLUE  = "blue";
	public static final String BLACK = "black";
}
