package com.cdk.standaloneprograms.Java8concepts;

import com.cdk.domain.Person;

import java.util.Arrays;
import java.util.List;

public class MethodRefByKaushik2 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            Person.builder().firstName("Nirmal").lastName("Mohanty").age(27).build(),
            Person.builder().firstName("Bruce").lastName("Wayne").age(30).build());
  }
}
