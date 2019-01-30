package com.company;

public class Person {

    private String firstName;
    //ja izmanto static - tas pieder klasei, nevis objektam
    //ja pieliek static pie firstName = nomainīs visiem cilvēkiem firstName;
    private  String lastName;
    private int age;

    private String gender;

    //konstruktors
    public Person(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
    //konstruktors
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age =0;
    }
    //private String fullName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /*public int aging() {
        return age+1;
    }*/
    public void aging1() {
        age++;
    }

    public static void iAmHuman () {
        System.out.println("I am a human");
    }

    //uztaisīt klasi Dzīvnieks
    //lauki - suga, kāju skaits, krāsa, bool varlidot +++
    //lauks ar stringu
    //metodes - speak() - > izprintē skaņu

    //static metode, kas pasaka "i'm an animal"

}
