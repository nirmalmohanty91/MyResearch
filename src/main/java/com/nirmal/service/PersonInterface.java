package com.nirmal.service;

import java.util.List;
import com.nirmal.domain.Person;

public interface PersonInterface {
  List<Person> getListOfPeople();

  List<Person> getLastSorted();

  List<Person> lastNameStartsWith(String startsWith);
}
