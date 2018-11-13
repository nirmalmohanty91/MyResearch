package com.cdk.standaloneprograms;

import com.cdk.standaloneprograms.CollectionPrograms.Address;
import com.cdk.standaloneprograms.CollectionPrograms.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.json.JSONException;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) throws JSONException, JsonProcessingException {
    //    MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter = new
    // MappingJackson2XmlHttpMessageConverter();
    //    Address ad = Address.builder().street("Hyderabad").build();
    //    Employee e = Employee.builder().id(1).name("nirmal").address(ad).build();
    //    // ObjectMapper om = new ObjectMapper();
    //    // JSONObject obj = new JSONObject( new ObjectMapper().writeValueAsString(e));
    //    //  String xml_data = XML.toString(new JSONObject( new
    // ObjectMapper().writeValueAsString(e)));
    //    String xml_data =
    //        mappingJackson2XmlHttpMessageConverter.getObjectMapper().writeValueAsString(e);
    //    System.out.println(xml_data);

    List<String> list = new ArrayList<>();

    list.add("3");
    list.add("5");

    List<Integer> list1 = list.stream().map(t -> Integer.parseInt(t)).collect(Collectors.toList());

//    List<Integer> list2 = new ArrayList<>();
//    for (String s : list) {
//      list2.add(Integer.parseInt(s));
//    }

    list1.forEach(System.out::println);
  }
}
