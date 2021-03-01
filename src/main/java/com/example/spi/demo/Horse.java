package com.example.spi.demo;

/**
 * @author xing_seng
 * @date 2021/2/25
 **/
public class Horse implements Animal{
    @Override
    public void run() {
        System.out.println("马在跑");
    }
}
