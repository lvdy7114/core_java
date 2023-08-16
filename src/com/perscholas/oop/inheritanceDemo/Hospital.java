package com.perscholas.oop.inheritanceDemo;

    public class Hospital {
        public static void main(String args[]) {
            Surgeon s = new Surgeon();
            s.Doctor_Details();
            s.Surgeon_Details();
        }
    }

//output
//Doctor Details...
//Surgeon Detail...
//Cardio

//Based on the above example, we can say that Surgeon IS-A Child. This
//means a child class has an IS-A relationship with the parent class. This
//inheritance is known as the IS-A relationship between the child and parent
//class.