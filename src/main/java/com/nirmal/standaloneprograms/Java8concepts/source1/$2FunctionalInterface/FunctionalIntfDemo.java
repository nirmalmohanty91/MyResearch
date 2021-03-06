package com.nirmal.standaloneprograms.Java8concepts.source1.$2FunctionalInterface;
// New in java 8. we can have method implementations as well as static methods in java 8 :)
// @$2FunctionalInterface annotation is optional. But if you use this, the advantage is the compiler
// will yell at you if you violate any rule
// Rule is it should contain single abstract method(SAM)
@FunctionalInterface
public interface FunctionalIntfDemo {

  public void m1();

  default void m2() {
    System.out.println("Hello");
  }

  public static void m3() {}
}
