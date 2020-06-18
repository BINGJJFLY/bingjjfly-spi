package com.wjz.sentinel.spi;

import com.alibaba.csp.sentinel.slotchain.ProcessorSlot;
import com.alibaba.csp.sentinel.util.SpiLoader;

import java.util.List;

public class SPI {

    /**
     * 底层原理就是调用了jdk的ServiceLoader#load方法
     *
     * @param args
     */
    public static void main(String[] args) {
        ProcessorSlot processorSlot = SpiLoader.loadFirstInstance(ProcessorSlot.class);
        System.out.println(processorSlot);
        processorSlot = SpiLoader.loadHighestPriorityInstance(ProcessorSlot.class);
        System.out.println(processorSlot);
        List<ProcessorSlot> slots = SpiLoader.loadInstanceList(ProcessorSlot.class);
        System.out.println(slots);
        List<ProcessorSlot> sortedSlots = SpiLoader.loadInstanceListSorted(ProcessorSlot.class);
        System.out.println(sortedSlots);
        List<ProcessorSlot> sortedSlots2 = SpiLoader.loadPrototypeInstanceListSorted(ProcessorSlot.class);
        System.out.println(sortedSlots2);
    }
}
