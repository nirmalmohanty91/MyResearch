package com.cdk.standaloneprograms.CollectionPrograms;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
public class Employee {
    private int id;
    private String name;
}
