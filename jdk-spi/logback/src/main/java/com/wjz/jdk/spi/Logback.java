package com.wjz.jdk.spi;

public class Logback implements Log {

    @Override
    public void debug(String log) {
        System.out.println("Logback[debug]: --->" + log);
    }

    @Override
    public void info(String log) {
        System.out.println("Logback[info]: --->" + log);
    }
}
