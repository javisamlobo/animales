package com.javier.animales;

import com.javier.animales.Animals;

public class Dog implements Animals {
    private String name;
    private Integer age;


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}