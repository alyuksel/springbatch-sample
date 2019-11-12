package com.alpi.writer;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class ConsoleItemWriter<T> implements ItemWriter<T> {

    @Override
    public void write(List<? extends T> list) throws Exception {
        list.forEach(System.out::println);
    }
}
