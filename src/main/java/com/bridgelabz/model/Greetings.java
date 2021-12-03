package com.bridgelabz.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Greetings {
    @GeneratedValue
    @Id
    int id;
    String message;
}
