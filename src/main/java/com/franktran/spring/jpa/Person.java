package com.franktran.spring.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "People")
@Table(name = "people")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

  @Id
  private Long id;
  private String firstName;
  private String lastName;
}
