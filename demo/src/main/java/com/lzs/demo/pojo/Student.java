package com.lzs.demo.pojo;

public class Student {
    private int id;
    private String name;
    private int age;
    private Add add;

    public Student(int id, String name, int age, Add add) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Add getAdd() {
        return add;
    }

    public void setAdd(Add add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + add;
    }
}
