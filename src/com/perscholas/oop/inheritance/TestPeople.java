package com.perscholas.oop.inheritance;

public class TestPeople {
    public static void main(String args[]) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");
        // Boy b = new Person(); // Throw Error
// Girl g = new Person() // Throw Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();
        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();
        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();
        System.out.println((Person) jimmy);
        System.out.println(((Person) jimmy).talk());
        System.out.println(((Person) jimmy).walk());
        System.out.println();
        System.out.println((Person) betty);
        System.out.println(((Person) betty).talk());
        System.out.println(((Person) betty).walk());
        System.out.println();
        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());
        System.out.println(((Boy) aPerson).talk());
    }
}

//output
//Hello, my name is Fred
//I have nothing to say.
//I have nowhere to go.
//
//Hello, my name is
//I have nothing to say. ... but I love Java class.
//I am now walking
//
//Hello, my name is Ms.Betty
//Hello! I am jumping.
//I have nowhere to go.
//
//Hello, my name is
//I have nothing to say. ... but I love Java class.
//I am now walking
//
//Hello, my name is Ms.Betty
//Hello! I am jumping.
//I have nowhere to go.
//
//60.0
//60.0
//78.0
//Exception in thread "main" java.lang.ClassCastException: class com.perscholas.oop.inheritance.Person cannot be cast to class com.perscholas.oop.inheritance.Boy (com.perscholas.oop.inheritance.Person and com.perscholas.oop.inheritance.Boy are in unnamed module of loader 'app')
//	at com.perscholas.oop.inheritance.TestPeople.main(TestPeople.java:36)

//The lifespan() method did not work in the way expected. That is because for
//class methods, method look-ups occur at compile time. The lifeSpan() method
//in the Person class is used by both the Boy and Person classes. In this case, since
//the method is static and is declared in the Person class, the ageFactor from the
//Person class is used. However, the Girl class has its own lifeSpan() method, so the
//ageFactor within the Girl class is used in that case.