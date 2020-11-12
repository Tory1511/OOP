
//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class Employee
{

    private  String name;
    private  String role;
    private  String email;
    private  int phoneNumber;
    private  int salary;
    private  int age;


    Employee(String name, String role, String email, int phoneNumber, int salary, int age)
    {
        this.name = name;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this. age = age;

    }

    void info()
    {

        System.out.println("name: " + name + "; role:" + role + "; email address: " + email + "; Phone number " + phoneNumber + "; Salary " + salary + "; Age " + age);
    }

    void printOlderThanForty()
    {
        if(age >= 40)
        {
            System.out.print("Workers older than 40: ");
            info();
        }
    }

}
