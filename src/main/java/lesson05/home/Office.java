package lesson05.home;

import java.sql.SQLOutput;

public class Office {
    public static void main(String[] args) {

        Slave e = new Slave("Main", "Slave", "Recrutier",
                "8 (450) 9213465", "Slave 1", 80000,
                1985);

        System.out.println("Hello gues, please welcome our " + e.getPosition() + ", " + e.getName() + ", " + e.getSecondName() + " " + e.getSurname() + ". ");


        Slave[] slaves = {
                e,
                new Slave("Ben", "Ivanych", "Levinskiy",
                        "8 (456) 2346576", "project owner", 520000, 1971),
        new Slave("Denys", "Ivan", "Lebedinskiy",
                "8 (457) 2346576", "project owner", 320000, 1961),

        };

        System.out.println("*****************************************");

        for (int i = 0; i < slaves.length; i++) {
            if (slaves [i].getAge() > 40) {
                System.out.println(slaves[i].getFullInfo());
            } else {
                System.out.println("<< Сотрудников не найдено! >>");
            }

            System.out.println("******************************************");

            for (i = 0; i < slaves.length; i++)
                    System.out.println(slaves[i].getFullInfo());

            increaseSalary(slaves, 45, 7500);

            System.out.println("*********************************************");
            for (i = 0; i < slaves.length; i++)
                if (slaves[i].isSalaryChanged)
                    System.out.println(slaves[i].getFullInfo());

        }



    }

    private static void increaseSalary(Slave[] emp, int age, float increment) {
        for ( int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].setSalary(increment);
                emp[i].isSalaryChanged = true;
            }
        }
    }


}
