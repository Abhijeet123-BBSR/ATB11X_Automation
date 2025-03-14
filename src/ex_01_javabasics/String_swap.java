package ex_01_javabasics;

public class String_swap {
    public static void main(String[] args) {
        String a="Hello";
        String b="world";
        System.out.println("Before swapping");
        System.out.println("a="+a+"b="+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("the value of and b after swapping");
        System.out.println("a="+a+"b="+b);
    }
}
