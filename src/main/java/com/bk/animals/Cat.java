package com.bk.animals;

public class Cat extends Animal {
    String name;
    private Integer numberOfLegs;

    public void voice(){
        System.out.println(name+" meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Cat(String name, Integer numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }
}
