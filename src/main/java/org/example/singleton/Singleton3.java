package org.example.singleton;

public class Singleton3 { //Name.class
    // this is to most used method in real-world apps
    // the JVM class loader is synchronized, so this is thread safe
    // this is concurrent and lazy without using synchronized

    private Singleton3(){

    }

    private static final class SingletonHolder{
        private static final Singleton3 SINGLETON = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.SINGLETON;
    }
}
