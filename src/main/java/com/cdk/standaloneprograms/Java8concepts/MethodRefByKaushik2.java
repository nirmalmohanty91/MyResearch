package com.cdk.standaloneprograms.Java8concepts;

import com.cdk.domain.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MethodRefByKaushik2 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            Person.builder().firstName("Scarlet").lastName("Johanson").age(30).build(),
            Person.builder().firstName("Nirmal").lastName("Mohanty").age(27).build(),
            Person.builder().firstName("Bruce").lastName("Wayne").age(30).build(),
            Person.builder().firstName("Natalie").lastName("Portman").age(27).build());

    /*Sort list by last name*/
    //    Method-1
    //    Collections.sort(personList, (p1, p2) ->
    // p1.getFirstName().compareTo(p2.getFirstName()));
    // Method-2
    Function<Person,String> getLastName=Person::getLastName;
    Collections.sort(personList, Comparator.comparing(getLastName));

    Collections.sort(personList, Comparator.comparing(Person::getLastName));

    // personList.forEach(person -> System.out.println(person.getFirstName()));
    personList.forEach(System.out::println);

    personList.forEach(
        person -> {
          if (person.getLastName().startsWith("M"))
            System.out.println(person.getFirstName());
        });

    //Map<List<Person>,String> groupingList=personList.
  }
}
