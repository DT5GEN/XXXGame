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
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.uid = ++id;
    }


    int getAge(){
        return CURRENT_YEAR - birthYear;

    }

    int getSalary() {
        return  (int) salary;
    }

    void setSalary(float difference) {
        this.salary = salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }

    String getPhone() {
        return phone;
    }

    String getFullInfo() {
        return  this.uid + " " + this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " USD.";

    }

}

