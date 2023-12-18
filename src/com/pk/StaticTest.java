package com.pk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StaticTest {
    private static String name;
    public int age;

    public StaticTest(String name, int age) {
        StaticTest.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "StaticTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<StaticTest> staticTests = List.of(new StaticTest("Shohag", 27), new StaticTest("Riyad", 26), new StaticTest("pk", 28));
        List<Integer> collect = staticTests.stream().map(staticTest -> staticTest.age).collect(Collectors.toList());
        System.out.println(collect);
    }
}
