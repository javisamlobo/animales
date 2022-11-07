package com.javier.animales;

import com.javier.animales.Animals;

public class Whale implements Animals {
    private String name;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
