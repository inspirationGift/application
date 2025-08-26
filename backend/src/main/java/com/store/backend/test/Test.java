package com.store.backend.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {


    static class Person {
        public final String name;
        public final Integer salary;
        public Person(String name, Integer salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    private static final String HEADER= "List of employees:\n";

    public void generateList(Stream<Person> people) {
        // generate list of people's names
        List<Integer> list = new ArrayList<>();

        people.forEach(p-> {
            Integer salary = p.salary;
        });



        // save to file
    }

}
