package lesson05.home;

public class Office {
    public static void main(String[] args) {

        Slave e = new Slave("Main", "Slave", "Recrutier",
                "8 (450) 9213465", "Slave 1", 80000,
                1985);

        System.out.println("Hello gues, please welcome our " + e.getPosition() + ", " + e.getName() + ", " + e.getSecondName() + " " + e.getSurname() + ". ");
        int [] array = new int[8];

        Slave[] slaves = {
                e,
                new Slave("Ben", "Ivanych", "Levinskiy",
                        "8 (456) 2346576", "project owner", 520000,1971);
                new Slave("Denys", "Ivan", "Lebedinskiy",
                        "8 (457) 2346576", "project owner", 320000,1961);

        }
    }
}
