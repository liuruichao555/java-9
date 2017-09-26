package com.liuruichao.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Test2
 *
 * @author liuruichao
 * Created on 2017/9/26 17:29
 */
public class Test2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Person(i, "liuruichao_" + i, 20 + i));
        }

        for (int i = 50; i< 60; i++) {
            list.add(new Person(i, "buzhidao_" + i, 50 + i));
        }

        list.stream()
                .dropWhile(person -> person.id < 10) // 删除id小于10
                .forEach(System.out::println);
    }

    private static class Person {
        private int id;

        private String name;

        private int age;

        private Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
