package com.cdk.standaloneprograms;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder
public class Employee {
    private int id;
    private String name;
}
