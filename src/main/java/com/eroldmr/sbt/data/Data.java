package com.eroldmr.sbt.data;

import com.eroldmr.sbt.person.Person;

import java.util.List;

public class Data {

    private final List<Person> people = List.of(
            new Person(1L, "Patco", "Erold", 24),
            new Person(2L, "Shirt", "Handle", 24),
            new Person(3L, "Jack", "Franco", 24),
            new Person(4L, "Mouse", "Clicker", 24),
            new Person(5L, "Vans", "Shoes", 24)
    );

    public List<Person> getPeople() {
        return people;
    }
}
