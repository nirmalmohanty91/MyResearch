package com.cdk.service;

import java.util.List;
import com.cdk.domain.Person;

public interface PersonInterface {
  public List<Person> getListOfPeople();

  public List<Person> getLastSorted();


  List<Person> lastNameStartsWith(String startsWith);

}
