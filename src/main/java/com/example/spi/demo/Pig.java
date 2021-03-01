package com.example.spi.demo;

/**
 * @author xing_seng
 * @date 2021/2/25
 **/
public class Pig implements Animal{
    @Override
    public void run() {
        System.out.println("猪在拱");
    }
}
