package org.example.singleton;

public class Singleton1 {
    // this is not thread safe
    private static Singleton1 SINGLETON = null;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        // if we add synchronized to this method signature, it will be thread safe
        // but all the calls to this method will be synchronized, which is not necessary after the first call
        if (SINGLETON == null) {
            SINGLETON = new Singleton1();
        }
        return SINGLETON;
    }
}
