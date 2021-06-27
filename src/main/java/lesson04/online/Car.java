package lesson04.online;

import java.sql.SQLOutput;

public class Car {
    String model;
    int countWheels;
    String color;


    class Motor {
        int power = 400;
        int v = 5;

        void starting() {
            System.out.println("Engine working");

        }

    }


    void move() {
        System.out.println(model + " has moved");
    }

    void beep(){

        System.out.println(model + " beeeeeeeeps!!!");

    }

}
