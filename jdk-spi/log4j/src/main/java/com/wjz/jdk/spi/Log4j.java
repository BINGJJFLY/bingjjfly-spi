package com.wjz.jdk.spi;

public class Log4j implements Log {

    @Override
    public void debug(String log) {
        System.out.println("Log4j[debug]: --->" + log);
    }

    @Override
    public void info(String log) {
        System.out.println("Log4j[info]: --->" + log);
    }
}
