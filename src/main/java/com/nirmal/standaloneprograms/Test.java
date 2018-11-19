package com.nirmal.standaloneprograms;

interface P {

  default void printB() {
    System.out.println("ghkgh");
  };
}

interface Q {

  default void printB() {
    System.out.println("hjl");
  };
}

public class Test implements P, Q {

  public static void main(String[] args) {
    Test t = new Test();
    t.printB();
  }

  @Override
  public void printB() {
    // System.out.println("Own");
    Q.super.printB();
  }
}
