package org.example.generics;

public class GenericTypeTwoParam <S,U>{
    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public GenericTypeTwoParam(S s, U u) {
        this.s = s;
        this.u = u;
    }

    private S s;
    private U u;

    public static void main(String[] args) {
        GenericTypeTwoParam<String,Integer> gt=new GenericTypeTwoParam<>("java",1);
        System.out.println(gt.getS());
        System.out.println(gt.getU());

    }


}
