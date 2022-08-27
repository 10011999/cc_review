package com.ccreview;

public class Recursion {
    public static void main(String[] args) {
         Demo f=new Demo();
        System.out.println("factorial of 3: "+f.fact(3));
        System.out.println("factorial of 4: "+f.fact(4));
        System.out.println("factorial of 5: "+f.fact(5));
    }
}
class Demo {
    int fact(int n){
        int result;

        if(n==1) return 1;
        result =fact(n-1) *n;
        return result;
        }

}