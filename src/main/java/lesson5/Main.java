package lesson5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Петухов Владимир Иванович", "инженер", "8-888-888-22-22", "petuxoff@mail.com", 45000, 60 ),
                new Employee("Курочкин Николай Николаевич", "инженер", "8-888-888-33-33", "nikolo@mail.com", 45000, 45),
                new Employee("Гусев Сергей Сергеевич", "Devops", "8-888-888-11-11", "gusev@mail.com", 65000, 35),
                new Employee("Петров Андрей Петрович", "Developer", "8-888-888-44-44", "petrov@mail.com", 60000, 39),
                new Employee("Иванов Дмитрий Анатольевич", "Product Manager", "8-888-888-55-55", "ivanov@mail.com", 50000, 25),
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
