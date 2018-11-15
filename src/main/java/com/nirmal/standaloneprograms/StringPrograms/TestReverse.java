package com.nirmal.standaloneprograms.StringPrograms;

public class TestReverse {

  public static void main(String[] args) {
    String s = "Nirmal";
    System.out.println(s);
    System.out.println(reverseCharArray(s));
  }

  static String reverseCharArray(String str) {
    char[] letters = str.toCharArray();
    String s = "";
    for (int i = letters.length - 1; i >= 0; i--) {
      s += letters[i];
    }
    return s;
  }
}
