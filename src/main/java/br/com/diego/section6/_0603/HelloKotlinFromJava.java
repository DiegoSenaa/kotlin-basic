package br.com.diego.section6._0603;

import br.com.diego.section05._0505.MaxKt;
import br.com.diego.section06._0603.Person;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person rob = new Person("Robert", "Martin");

        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle bob");

        System.out.println("His name is now " + rob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);
    }
}
