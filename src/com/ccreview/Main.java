package com.ccreview;

public class Main {
    public static void main(String[] args) {
        final int num=2;
        System.out.println(num);
        //System.out.println(MathematicalOperation.add(20,30));
        MathematicalOperation abc=new MathematicalOperation();
        abc.add(20,40);
    }
}
class MathematicalOperation{

    //public static int add(int a,int b){
        //return a + b;
    void add(int a,int b){
        System.out.println(a + b);
    }
}
