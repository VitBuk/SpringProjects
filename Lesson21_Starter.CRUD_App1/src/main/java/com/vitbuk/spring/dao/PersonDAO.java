package com.vitbuk.spring.dao;

import com.vitbuk.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Rita"));
        people.add(new Person(++PEOPLE_COUNT,"Dima"));
        people.add(new Person(++PEOPLE_COUNT,"Olja"));
        people.add(new Person(++PEOPLE_COUNT,"Nelly"));
        people.add(new Person(++PEOPLE_COUNT,"Vladimir"));
        people.add(new Person(++PEOPLE_COUNT,"Vitalik"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
