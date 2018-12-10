package com.nirmal.standaloneprograms;

import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ControllerAdvice
public class Test {

  public static void main(String[] args) {

    //    Optional<String> gender = Optional.of("MALE");
    //    String answer1 = "Yes";
    //    String answer2 = null;
    //
    //    System.out.println("Non-Empty Optional:" + gender);
    //    System.out.println("Non-Empty Optional: Gender value : " + gender.get());
    //    System.out.println("Empty Optional: " + Optional.empty());
    //
    //    System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
    //    System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
    //
    //    java.lang.NullPointerException
    //    System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    //    HashMap<String, String> hashMap = new HashMap<>();

    //    int[] numbers = {2, 4, 5, 6};
    //
    //    int[] multiplied = Arrays.stream(numbers).map(a -> a * 2).toArray();
    //
    //    long count = Arrays.stream(numbers).map(a -> a + 2).filter(b -> b == 8).count();
    //    System.out.println(count);
    // Arrays.stream(multiplied).forEach(System.out::println);

    //    int[] a = {10, 5,20,20,4,5,2,25,1};
    //
    //   Arrays.stream(breakingRecords(a)).forEach(System.out::println);

    //    Integer a = null;
    //    System.out.println(Optional.ofNullable(a).isPresent()?a.toString():"");
    /** ########################## */
    //    String s = "Nirmal ! Mohanty";
    //    String s3=Arrays.stream( s.split(" ")).map(s2 -> StringUtils.reverse(s2)+"
    // ").collect(Collectors.joining()).trim();
    //    System.out.println(s3);
    /** ########################## */
    //    ArrayList<Integer> arrayList = new ArrayList<>();
    //    arrayList.add(1);
    //    arrayList.add(3);
    //
    //    long sum = arrayList.stream().reduce((a,b) -> a+b).get();
    //    System.out.println(sum);
    /** ########################## */
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(4);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(3);

    //
    //    System.out.println(Test.birthday(arrayList, 3, 2));

    /** ########################## */
    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    for (Integer i : arrayList) {
    //      if (map.containsKey(i)) {
    //        map.put(i, map.get(i)+1);
    //      } else {
    //        map.put(i, 1);
    //      }
    //    }
    //    System.out.println(map);
    //    List<Integer> list = new ArrayList<>();
    //
    //    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //      if (entry.getValue() == Collections.max(map.values())) {
    //        list.add(entry.getKey());
    //      }
    //    }
    //
    //    //    List<Integer> list =
    //    //        Optional.ofNullable(map.entrySet()
    //    //            .stream()
    //    //            .map(
    //    //                entry -> {
    //    //                  if (entry.getValue() == Collections.max(map.values())) {
    //    //                    return entry.getKey();
    //    //                  } else return null;
    //    //                })).
    //    //            .collect(Collectors.toList());
    //
    //    System.out.println(Collections.min(list));
    /** ########################## */
    // System.out.println(Test.dayOfProgrammer(1800));
    //    String s1 = "tttttttttttttttttttttttttttttttttttttsssssssssssssssss";
    //    String s2 =
    // "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
    //
    //    HashMap<String, Integer> m1 = Test.getMap(s1);
    //    HashMap<String, Integer> m2 = Test.getMap(s2);

    //    System.out.println(m1);
    //    System.out.println(m2);
    //
    //    System.out.println(Test.getCount1(m1, m2));
    //    System.out.println(Test.getCount2(m2, m1));
    // int n = Test.getCount1(m1, m2) + Test.getCount2(m2, m1);
    /** ########################## */
    System.out.println(Test.pageCount(7, 4));
  }

  static int pageCount(int n, int p) {
    int pageTurn = 0;

    if (p == 1 || p == n) {
      pageTurn = 0;
    } else if (n % 2 != 0) {
      if (p == n - 1) {
        pageTurn = 0;
      } else if (Math.abs(n - p) == Math.abs(1 - p)) {
        pageTurn = Math.round( Math.abs(n - p) / 2);
      } else if (Math.abs(n - p) > Math.abs(1 - p)) {
        pageTurn = (p % 2 == 0) ? Math.round((float) Math.abs(1 - p) / 2) : Math.abs((1 - p) / 2);
      } else {
        pageTurn = (p % 2 == 0) ? (n - p) / 2 : Math.round((float) Math.abs(n - p) / 2);
      }
    } else {
      if (Math.abs(n - p) > Math.abs(1 - p)) {
        pageTurn = (p % 2 == 0) ? Math.round((float) Math.abs(1 - p) / 2) : Math.abs((1 - p) / 2);
      } else {
        pageTurn = (p % 2 == 0) ? (n - p) / 2 : Math.round((float) Math.abs(n - p) / 2);
      }
    }

    return pageTurn;
  }
}
