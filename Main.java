package com.tnsif.packagesandaccessmodifiers;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.name);   // Allowed (public)
        System.out.println(p.age);    // Allowed (protected, same package)
        System.out.println(p.city);   // Allowed (default, same package)
        
       // System.out.println(p.socialSecurityNumber); 
        //COMPILE ERROR: socialSecurityNumber has private access in Person
    }
}
