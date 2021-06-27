package lesson04.online;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "Blueного ";
        car1.countWheels = 4;
        car1.model = "Nissan";

        car2.color = "Болотного";
        car2.model = "UAZ Diversant";
        car2.countWheels = 6;

        System.out.println();
        System.out.println("Это что за покемон? - " + car1.model);
        System.out.println("Колёс -  - " + car1.countWheels);
        System.out.println(car1.color + " цвета." );

        System.out.println();

        System.out.println("Это что за покемон? - " + car2.model);
        System.out.println("Колёс -  - " + car2.countWheels);
        System.out.println(car2.color + " цвета." );

        car1.move();
        car1.beep();
        car2.move();
        car2.beep();

    }


}