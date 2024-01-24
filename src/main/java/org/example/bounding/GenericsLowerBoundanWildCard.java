package org.example.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundanWildCard {
    public static void main(String[] args) {
        List<Object>ol=new ArrayList<>();
        printElement(ol);

        List<Number>n1=new ArrayList<>();
        printElement(n1);

        //Compile Time Error
      //  List<Double>d1=new ArrayList<>();
      //  printElement(d1);

        List<String> strlist=new ArrayList<>();
        //printObj(strlist); //Compile Time Error

        List<Object> objlist=new ArrayList<>();
        printObj(objlist);

    }


    // ? Integerin superi olan sınıfları temsil etmektedir
    public static void printElement(List<?super Integer>list){
        for (int i=1;i<10;i++){
            list.add(i);
        }
    }

    //unbound bir liste parametre alıyor
    public static void printElement2(List<?> listOfUnknown){
        //listOfUnknown.add("java");         //Compile Time Error
       // listOfUnknown.add(null); //eklene bilir
        for (Object object:listOfUnknown){
            System.out.println(object);
        }

    }
    public static void printObj(List<Object> listOfObject){
        listOfObject.add("java");
        for (Object object : listOfObject){
            System.out.println(object);
        }

    }
}
