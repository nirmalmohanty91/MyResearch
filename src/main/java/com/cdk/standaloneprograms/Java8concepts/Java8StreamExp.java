package com.cdk.standaloneprograms.Java8concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamExp {

  public static void main(String[] args) {
    List<String> items = new ArrayList<String>();

    items.add("one");
    items.add("two");
    items.add("three");

    Stream<String> stream = items.stream();

    String reduced2 = items.stream().reduce((acc, item) -> acc + " " + item).get();

    System.out.println(reduced2);
  }
}
