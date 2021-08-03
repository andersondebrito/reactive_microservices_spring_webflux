package com.abo.webfluxdemo.util;

public class SleepUtil {

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
