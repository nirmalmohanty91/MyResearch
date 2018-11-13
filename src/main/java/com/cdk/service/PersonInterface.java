package com.cdk.service;

import java.util.List;
import com.cdk.domain.Person;

public interface PersonInterface {
  List<Person> getListOfPeople();

  List<Person> getLastSorted();

  List<Person> lastNameStartsWith(String startsWith);
}
