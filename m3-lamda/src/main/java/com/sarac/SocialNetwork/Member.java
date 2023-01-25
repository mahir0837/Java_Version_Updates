package com.sarac.SocialNetwork;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public class Member {

    private String name;
    private int age;
    private Gender gender;
    private String eMailAddress;

}
