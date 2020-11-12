public class Main {
    //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    //* Конструктор класса должен заполнять эти поля при создании объекта;
    //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль; - info
    //* Создать массив из 5 сотрудников
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    //
    //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;


    public static void main(String[] args)
    {
    Employee[] employees;
    employees = new Employee[5];

    employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivsdfssan@mailbox.com", 892365412, 30000, 50);
    employees[1] = new Employee("Bursukov Ivan", "Cleaner", "idxsssvivan@mailbox.com", 892755312, 30000, 60);
    employees[2] = new Employee("Kotikov Ivan", "Manager", "ivivfdan@mailbox.com", 892312897, 30000, 20);
    employees[3] = new Employee("Gadkiy Ivan", "Engineer", "ivixvsdvan@mailbox.com", 892312111, 30000, 34);
    employees[4] = new Employee("Hrenov Ivan", "Engineer", "ivisdfsdvan@mailbox.com",892712312, 30000, 39);

        for (int i = 0; i < 5; i++)
        {
            employees[i].info();
        }

        System.out.println();
        for (int i = 0; i < 5; i++)
        {
            employees[i].printOlderThanForty();
        }


    }



}
