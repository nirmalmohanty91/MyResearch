package com.cdk.standaloneprograms.InheritanceAndPolym;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class Child1 extends Parent {
  private int j;

  @Override
  public Parent getParent() {
    Parent p = new Parent(7);
    return p;
  }
}
