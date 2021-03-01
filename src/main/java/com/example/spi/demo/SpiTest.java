package com.example.spi.demo;

import java.util.ServiceLoader;

/**
 * @author xing_seng
 * @date 2021/2/25
 **/
public class SpiTest {

    public static void main(String[] args) {
        final ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        for (int i = 0; i < 2; i++) {
            test(load);
            System.out.println("---------");
        }
    }

    private static void test(ServiceLoader<Animal> load) {
        for (Animal animal : load) {
            System.out.println(animal);
            animal.run();
        }
    }
}
