package com.wjz.jdk.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Logger {

    public static void main(String[] args) {
        System.out.println("---开始运行---");
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Log log = iterator.next();
            log.debug("开始使用日志");
            log.info("开始使用日志");
        }
        System.out.println("---运行结束---");
    }
}
