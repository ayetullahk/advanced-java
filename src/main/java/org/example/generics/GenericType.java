package org.example.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType <T> {
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    private T type;


    public static void main(String[] args) {

        GenericType<String> obj1 =new GenericType<>();
        obj1.setType("generic types in java");

        GenericType<Integer> obj2=new GenericType<>();
        obj2.setType(65);

        List<String> list= new ArrayList<>();
        list.add("java");
        list.add("generic");
        //list.add(new point()); Compile Time Error

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        //map.put("java",1); //Compile Time Error

    }
}
