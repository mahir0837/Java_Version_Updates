package com.sarac.SocialNetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Member member1=new Member("Mahir",21,Gender.MALE,"abc@gmail.com");
        Member member2=new Member("Mike",24,Gender.MALE,"xyz@gmail.com");
        Member member3=new Member("Chris",26,Gender.MALE,"xyz@hotmail.com");
        Member member4=new Member("Angel",19,Gender.FEMALE,"abc@yahoo.com");
        Member member5=new Member("Kate",22,Gender.FEMALE,"qwre@gmail.com");

        List<Member>allMembers=new ArrayList<>(Arrays.asList
                (member1,member2,member3,member4,member5));


        Features checkMember=p->p.getGender().equals(Gender.MALE)&&p.getAge()>=18&&p.getAge()<=25;
        print(allMembers,checkMember);

    }

    private static void print (List<Member>memberList,Features checkMember){
        List<Member>result=new ArrayList<>();

        for (Member eachMember:memberList){
            if (checkMember.sendMessage(eachMember)){
                result.add(eachMember);
            }
        }
        System.out.println(result);
    }

}
