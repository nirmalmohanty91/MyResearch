package com.nirmal.standaloneprograms.Java8concepts.source1;

import java.util.function.Predicate;

public class CheckingEvenUsingJava8 {

  public static void main(String[] args) {

    Predicate<Integer> predicate = i -> i % 2 == 0;

    System.out.println("Is 5 Event?: " + predicate.test(5));
  }
}
