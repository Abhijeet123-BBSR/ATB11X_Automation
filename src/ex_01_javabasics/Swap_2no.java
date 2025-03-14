package ex_01_javabasics;

public class Swap_2no {
    public static void main(String[] args) {
        int a=2,b=3;
        System.out.println("a="+a+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
}
