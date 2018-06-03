package com.cdk.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cdk.domain.SwaggerUIDetails;
import com.cdk.domain.Person;
import com.cdk.service.PersonInterface;

@RestController
public class PersonController {

  @Autowired
  private SwaggerUIDetails myConfig;

  @Autowired
  private PersonInterface personService;

  @GetMapping(path = "/yml", produces = MediaType.APPLICATION_JSON_VALUE)
  public SwaggerUIDetails printYaml() {
    return myConfig;
  }

  @GetMapping("/list")
  public List<Person> getPersonList() {

    return personService.getListOfPeople();
  }


  @GetMapping("/sortedLastName")
  public List<Person> getLastNameSortedList() {
    return personService.getLastSorted();
  }

  @GetMapping(path = "/lastNameStartsWith/{startsWith}")
  public List<Person> lastNameBeginsWithR(@PathVariable("startsWith") String startsWith) {
    return personService.lastNameStartsWith(startsWith);
  }

}
