package com.example.exp8rest1171821;

public class Car {
    private int ID;
    private String name;
    private Double year;

    public Car(int id, String name, double year){
        this.ID = id;
        this.name = name;
        this.year = year;
    }

    public Car(){
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAge() {
        return year;
    }
    public void setAge(Double age) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Student{" +
                "\nID= " + ID +
                "\nname= " + name +
                "\nage= " + year +
                +'\n'+'}'+'\n';
    }
}

