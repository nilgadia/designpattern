package org.shahid.creational.singleton.shahid;

import java.util.Arrays;

public class EnumSingletonExample {
    public static void main(String[] args) {
        System.out.println(EnumSingleton.WEEKDAY);
        System.out.println(EnumSingleton.WEEKEND);
    }
}

enum EnumSingleton {
    WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"),
    WEEKEND("Saturday", "Sunday");

    private String[] days;

    EnumSingleton(String ...days) {
        System.out.println("Initializing enum with " + Arrays.toString(days));
        this.days = days;
    }

    public String[] getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "days=" + Arrays.toString(days) +
                '}';
    }
}
