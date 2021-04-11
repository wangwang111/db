package com.wang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employ")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employ {

    @Id
    private Long id;
    private String name;
    private Double salary;
    private Integer age;
}
