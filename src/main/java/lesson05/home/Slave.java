package lesson05.home;

public class Slave {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int birthYear;
    private static int id = 0;
    private int uid;

    public Slave (String name) {
        this.name = name;
    }

    Slave(String name,
          String secondName,
          String surname,
          String phone,
          String position,
          float salary,
          int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;


    }
}

