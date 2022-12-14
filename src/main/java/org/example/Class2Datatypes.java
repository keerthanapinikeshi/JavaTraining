package org.example;

public class Class2Datatypes {

    int y = 10;
    float z =87;


}
class C{
    String s2="Hey!";

}
class B{
    public static void main(String[] args) {

        Class2Datatypes x= new Class2Datatypes();
        System.out.println("Integer is: "+(x.y));
        System.out.println("Float value is: "+(x.z));
        System.out.println("Typecasting your float to char: "+(char)x.z);
        C c=new C();
        System.out.println("String: "+c.s2);
    }
}

