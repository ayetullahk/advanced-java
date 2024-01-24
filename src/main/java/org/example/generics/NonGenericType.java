package org.example.generics;

public class NonGenericType {
    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    private  Object o ;
    public static void main(String[] args) {
        NonGenericType ob1=new NonGenericType();
        NonGenericType ob2=new NonGenericType();

        ob1.setO("john");
        ob2.setO(65);

        String str1 = (String)  ob1.getO();
        System.out.println(str1);

        String str2 =(String) ob2.getO(); //ClassCastException
        System.out.println(str2);

    }
}