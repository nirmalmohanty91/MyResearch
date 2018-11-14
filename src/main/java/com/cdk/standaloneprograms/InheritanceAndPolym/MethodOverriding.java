package com.cdk.standaloneprograms.InheritanceAndPolym;

public class MethodOverriding {

  // Notice that the return type should be the Class itself or it's subclasses
  public Parent getCount() {
    Child1 c = new Child1(5);
    return c;
  }
}
