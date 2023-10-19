package com.driver;


public class Main {
    static public class A {
        String meth(){
            return "Invoking method from class A";
        }
    }

    static public class B extends A{
        @Override
        String meth (){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B b = new B();
        b.meth();
        b.meth();
    }
}