package com.diffblue.javamock;

public class Animals {

    String name;
    int age;

    public Animals(){
        this.name = "diffy";
    }

    public Animals (String name) {
        this.name = name;
    }

    public Animals(int age) {
        this.age = age;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setName() {
        this.name = name;
    }

    public String getName( ) {
        return name;
    }

}
