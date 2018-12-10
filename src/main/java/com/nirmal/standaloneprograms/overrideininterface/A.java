package com.nirmal.standaloneprograms.overrideininterface;

public interface A {
  default void printGreetings() {
    System.out.println("Ohh snap! You are not calling the overridden method");
  }
}
