package lesson5;

public class Employee {
    private final String fio;
    private final String position;
    private final String email;
    private final String phone;
    private final int wage;
    private final int age;

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    public Employee(String fio, String position, String phone, String email, int wage, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.wage = wage;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Телефон:" + phone);
        System.out.println("Email: " + email);
        System.out.println("Зарплата:" + wage);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
