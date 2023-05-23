package org.example.builder;

import lombok.Builder;

@Builder
public class User {
    private int id;
    private String lastName;
    private String firstName;
    private int age;

}
