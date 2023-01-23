package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {//T-SoccerPlayer,FootballPlayer,BaseballPlayer,Anylass you can pass to team
    //Should not accept any class. It should accept only superclass and subclass

    public  String name;
    private List<T> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(((Player)player).getName()+" is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName()+" picked for team"+this.name);
            return  true;
        }

    }
}
