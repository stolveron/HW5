//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//Создать массив из 5 сотрудников. Пример: Person[] persArray = new Person[5]; // Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
//С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
package HW1;

public class HW1 {
    // создание класса
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    // создание конструктора
    public HW1(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // вывод инфы об объекте
    public String toString() {
        return String.format("ФИО: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }


    public void print() {
        System.out.println(this);
    }

    // создание массива
    public static void main(String[] args) {

        HW1[] baseArray = new HW1[5];
        baseArray[0] = new HW1("Ильинская Наталия", "Программист", "ns@mail.ru", "+79996665544", 100000, 20);
        baseArray[1] = new HW1("Иванов Иван", "Инженер", "ii69@primer.ru", "+79998884455", 127000, 52);
        baseArray[2] = new HW1("Коршун Даниил", "Охранник", "kordun@index.ru", "+79997771234", 19000, 45);
        baseArray[3] = new HW1("Деева Мария", "Тестировщик", "deevaMash@yandex.ru", "+79995554789", 70000, 28);
        baseArray[4] = new HW1("Рыбников Владимир", "Начальник отдела разработки", "ribavov@pochta.ru", "+79994445896", 180000, 48);

// проверка возраста и вывод
        for (int i = 0; i < baseArray.length; i++) {
            if (baseArray[i].age > 40) {
                System.out.println(baseArray[i]);
            }
        }

    }
}
