package com.nirmal.standaloneprograms.Java8concepts.source2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamExp {

  public static void main(String[] args) {
    List<String> items = new ArrayList<>();

    items.add("1");
    items.add("3");
    items.add("5");

    Stream<String> stream = items.stream();

    String reduced2 = stream.reduce((acc, item) -> acc + " " + item).get();
    System.out.println(reduced2);

    List<Integer> integerList =
        items.stream().map(t -> Integer.parseInt(t)).collect(Collectors.toList());
    //Method inference :: operator
    integerList.forEach(System.out::println);
  }
}
