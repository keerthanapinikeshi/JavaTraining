package org.example;

public class Main {

    int y = 10;
    float z =87;
    // String s="Hello!";

}
class C{
    String s2="Hey!";
    //Main g=new Main();
    // String s3;
    //s3=g.s;
}
class B{
    public static void main(String[] args) {

        Main x= new Main();
        System.out.println("Integer is: "+(x.y));
        System.out.println("Float value is: "+(x.z));
        System.out.println("Typecasting your float to char: "+(char)x.z);
        C c=new C();
        System.out.println("String: "+c.s2);
    }
}

