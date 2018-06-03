package com.cdk.utils;

import java.util.Comparator;
import org.springframework.stereotype.Component;
import com.cdk.domain.Person;

@Component
public class SortLastNameComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
    return o1.getLastName().compareTo(o2.getLastName());
  }



}
