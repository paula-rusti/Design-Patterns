package org.example.singleton;

public class Singleton2 {
    // only synchronized the first call to getInstance()
    private static Singleton2 SINGLETON = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton2.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton2();
                }
            }
        }
        return SINGLETON;
    }
}
