//package org.example;
//
//
//import java.util.ArrayList;
//
//class Calculator {
//
//    public int add(int x, int y) {
//        return x + y;
//    }
//    public double add(double x, double y) {
//        System.out.println(add(x,y));
//        System.out.println("Double value answer");
//        return x + y;
//    }
//
//    public void add(){
//        System.out.println("Adding Method");
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Calculator cal2= new Calculator();
//
//        System.out.println("Hello world!");
//
//        cal2.add();
//
//        System.out.println("After Adding Result Is = "+cal2.add(5,5));
//
//        System.out.println("After Adding Result Is = "+cal2.add(22,33));
//
//
//    }
//}
//
//
//     class classroom {
//
//    private String classRoomName;
//    private String teacherName;
//
//    public void setClassRoomName(String newClassRoomName) {
//        classRoomName = newClassRoomName;
//
//    }
//
//    public String returnClassRoomName() {
//        return classRoomName;
//    }
//
//    public void setTeacherName(String newTeacherName) {
//        teacherName = newTeacherName;
//
//    }
//
//    public String returnTeacherName() {
//        return teacherName;
//    }
//
//}
//
//    class School {
//    private ArrayList<classroom> classrooms;
//    private String classRoomName;
//    private String teacherName;
//
//    public School() {
//        classrooms = new ArrayList<classroom>();
//    }
//
//    public void addClassRoom(classroom newClassRoom, String theClassRoomName) {
//        classrooms.add(newClassRoom);
//        classRoomName = theClassRoomName;
//    }
//
//    // how to write a method to add a teacher to the classroom by using the
//    // classroom parameter
//    // and the teachers name
//}
//


public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void breathe() {
        System.out.println("Animal is breathing.");
    }
}

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}
