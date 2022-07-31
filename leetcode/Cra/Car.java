package com.leetcode.Cra;


interface carOb{
   public String carMileage();
}

public class Car implements carOb {
    int speed =5;

    public static void main(String[] args) {
        Car car = new Car();
        car.carMileage();
    }

    @Override
    public String carMileage() {
        Car car = new Car();
           return "Car speed is "+car.speed;
    }
}
