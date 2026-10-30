public class Main {
    private static final java.util.Scanner SCANNER = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Выбор задания ===");
            System.out.println("1. Человек");
            System.out.println("2. Книга");
            System.out.println("3. Машина");
            System.out.println("4. Прямоугольник");
            System.out.println("5. Круг");
            System.out.println("6. Студент");
            System.out.println("7. Банковский счёт");
            System.out.println("8. Сотрудник");
            System.out.println("9. Точка");
            System.out.println("10. Треугольник");
            System.out.println("11. Кот");
            System.out.println("12. Собака");
            System.out.println("13. Товар");
            System.out.println("14. Заказ");
            System.out.println("15. Дата");
            System.out.println("16. Время");
            System.out.println("17. Счётчик");
            System.out.println("18. Пара");
            System.out.println("19. Ноутбук");
            System.out.println("20. Лэптоп");
            System.out.println("21. Телефон");
            System.out.println("22. Дробь");
            System.out.println("23. Комплексное число");
            System.out.println("24. Вектор");
            System.out.println("25. Дом");
            System.out.println("26. Компьютер");
            System.out.println("27. Группа студентов");
            System.out.println("28. Стек");
            System.out.println("29. Очередь");
            System.out.println("30. Пользователь");
            System.out.println("0. Выход");
            System.out.print("Введите номер задания: ");

            int choice;
            try {
                choice = Integer.parseInt(SCANNER.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Нужно ввести число от 0 до 30.");
                continue;
            }

            if (choice == 0) {
                System.out.println("До свидания!");
                break;
            }

            runTask(choice);
        }
    }

    static void runTask(int number) {
        switch (number) {
            case 1:
                task1Interactive();
                break;
            case 2:
                task2Interactive();
                break;
            case 3:
                task3Interactive();
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6Interactive();
                break;
            case 7:
                task7Interactive();
                break;
            case 8:
                task8Interactive();
                break;
            case 9:
                task9Interactive();
                break;
            case 10:
                task10Interactive();
                break;
            case 11:
                task11();
                break;
            case 12:
                task12();
                break;
            case 13:
                task13Interactive();
                break;
            case 14:
                task14Interactive();
                break;
            case 15:
                task15Interactive();
                break;
            case 16:
                task16Interactive();
                break;
            case 17:
                task17();
                break;
            case 18:
                task18();
                break;
            case 19:
                task19();
                break;
            case 20:
                task20();
                break;
            case 21:
                task21();
                break;
            case 22:
                task22();
                break;
            case 23:
                task23();
                break;
            case 24:
                task24();
                break;
            case 25:
                task25();
                break;
            case 26:
                task26();
                break;
            case 27:
                task27();
                break;
            case 28:
                task28();
                break;
            case 29:
                task29();
                break;
            case 30:
                task30Interactive();
                break;
            default:
                System.out.println("Такого задания нет. Выберите от 1 до 30.");
        }
    }

    static void task1Interactive() {
        System.out.print("Введите имя: ");
        String name = SCANNER.nextLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 1");
        Person p = new Person(name, age);
        System.out.println(p);
    }

    static void task2Interactive() {
        System.out.print("Введите название книги: ");
        String title = SCANNER.nextLine();
        System.out.print("Введите автора: ");
        String author = SCANNER.nextLine();
        System.out.print("Введите год: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 2");
        Book b = new Book(title, author, year);
        System.out.println(b);
    }

    static void task3Interactive() {
        System.out.print("Введите марку: ");
        String brand = SCANNER.nextLine();
        System.out.print("Введите модель: ");
        String model = SCANNER.nextLine();
        System.out.print("Введите год: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите максимальную скорость: ");
        int speed = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 3");
        Car c = new Car(brand, model, year, speed);
        System.out.println(c);
    }

    static void task6Interactive() {
        System.out.print("Введите имя студента: ");
        String name = SCANNER.nextLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите средний балл: ");
        double score = Double.parseDouble(SCANNER.nextLine());
        System.out.println("\nЗадание 6");
        Student s = new Student(name, age, score);
        System.out.println(s);
    }

    static void task7Interactive() {
        System.out.print("Введите номер счёта: ");
        String number = SCANNER.nextLine();
        System.out.print("Введите начальный баланс: ");
        double balance = Double.parseDouble(SCANNER.nextLine());
        BankAccount account = new BankAccount(number, balance);
        System.out.print("Введите сумму пополнения: ");
        account.deposit(Double.parseDouble(SCANNER.nextLine()));
        System.out.print("Введите сумму снятия: ");
        account.withdraw(Double.parseDouble(SCANNER.nextLine()));
        System.out.println("\nЗадание 7");
        System.out.println(account);
    }

    static void task8Interactive() {
        System.out.print("Введите имя сотрудника: ");
        String name = SCANNER.nextLine();
        System.out.print("Введите должность: ");
        String position = SCANNER.nextLine();
        System.out.print("Введите зарплату: ");
        double salary = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Введите процент повышения: ");
        double percent = Double.parseDouble(SCANNER.nextLine());
        Employee e = new Employee(name, position, salary);
        e.raiseSalary(percent);
        System.out.println("\nЗадание 8");
        System.out.println(e);
    }

    static void task9Interactive() {
        System.out.print("Введите x1: ");
        int x1 = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите y1: ");
        int y1 = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите x2: ");
        int x2 = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите y2: ");
        int y2 = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 9");
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        System.out.println("Расстояние: " + a.distanceTo(b));
    }

    static void task10Interactive() {
        System.out.print("Введите сторону a: ");
        double a = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Введите сторону b: ");
        double b = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Введите сторону c: ");
        double c = Double.parseDouble(SCANNER.nextLine());
        System.out.println("\nЗадание 10");
        Triangle t = new Triangle(a, b, c);
        System.out.println("Прямоугольный: " + t.isRightTriangle());
    }

    static void task13Interactive() {
        System.out.print("Введите название продукта: ");
        String name = SCANNER.nextLine();
        System.out.print("Введите цену: ");
        double price = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Введите количество: ");
        int quantity = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 13");
        Product p = new Product(name, price, quantity);
        System.out.println("Сумма: " + p.totalPrice());
    }

    static void task14Interactive() {
        System.out.print("Введите название товара: ");
        String name = SCANNER.nextLine();
        System.out.print("Введите цену: ");
        double price = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Введите количество: ");
        int count = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 14");
        Order order = new Order(name, price, count);
        System.out.println("Итого: " + order.total());
    }

    static void task15Interactive() {
        System.out.print("Введите день: ");
        int day = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите месяц: ");
        int month = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите год: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 15");
        MyDate d = new MyDate(day, month, year);
        System.out.println(d + " -> високосный: " + d.isLeapYear());
    }

    static void task16Interactive() {
        System.out.print("Введите часы: ");
        int hour = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите минуты: ");
        int minute = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите секунды: ");
        int second = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Введите сколько секунд добавить: ");
        int plus = Integer.parseInt(SCANNER.nextLine());
        System.out.println("\nЗадание 16");
        Time t = new Time(hour, minute, second);
        t.addSeconds(plus);
        System.out.println(t);
    }

    static void task30Interactive() {
        System.out.print("Введите логин: ");
        String login = SCANNER.nextLine();
        System.out.print("Введите пароль: ");
        String password = SCANNER.nextLine();
        System.out.println("\nЗадание 30");
        User user = new User(login, password);
        System.out.println(user);
        System.out.print("Введите новый пароль: ");
        user.changePassword(SCANNER.nextLine());
        System.out.println("Пароль изменён: " + user.getPassword());
    }

    static void task1() {
        System.out.println("\nЗадание 1");
        Person p = new Person("Иван", 20);
        System.out.println(p);
    }

    static void task2() {
        System.out.println("\nЗадание 2");
        Book b = new Book("Java. Полный справочник", "Герберт Шилдт", 2023);
        System.out.println(b);
    }

    static void task3() {
        System.out.println("\nЗадание 3");
        Car c = new Car("Toyota", "Corolla", 2021, 210);
        System.out.println(c);
    }

    static void task4() {
        System.out.println("\nЗадание 4");
        Rectangle r = new Rectangle(5, 8);
        System.out.println("Площадь: " + r.area() + ", периметр: " + r.perimeter());
    }

    static void task5() {
        System.out.println("\nЗадание 5");
        Circle c = new Circle(3.5);
        System.out.println("Площадь: " + c.area() + ", длина окружности: " + c.circumference());
    }

    static void task6() {
        System.out.println("\nЗадание 6");
        Student s = new Student("Анна", 18, 9.7);
        System.out.println(s);
    }

    static void task7() {
        System.out.println("\nЗадание 7");
        BankAccount account = new BankAccount("1234567890", 1000.0);
        account.deposit(250.5);
        account.withdraw(300.0);
        System.out.println(account);
    }

    static void task8() {
        System.out.println("\nЗадание 8");
        Employee e = new Employee("Петр", "Разработчик", 95000);
        e.raiseSalary(15);
        System.out.println(e);
    }

    static void task9() {
        System.out.println("\nЗадание 9");
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        System.out.println("Расстояние: " + a.distanceTo(b));
    }

    static void task10() {
        System.out.println("\nЗадание 10");
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Прямоугольный: " + t.isRightTriangle());
    }

    static void task11() {
        System.out.println("\nЗадание 11");
        Cat cat = new Cat("Мурзик", 3);
        cat.meow();
        cat.eat();
        System.out.println(cat);
    }

    static void task12() {
        System.out.println("\nЗадание 12");
        Dog dog = new Dog("Шарик", 5, "Овчарка");
        System.out.println(dog);
    }

    static void task13() {
        System.out.println("\nЗадание 13");
        Product p = new Product("Молоко", 60.0, 2);
        System.out.println("Сумма: " + p.totalPrice());
    }

    static void task14() {
        System.out.println("\nЗадание 14");
        Order order = new Order("Кофта", 1200, 2);
        System.out.println("Итого: " + order.total());
    }

    static void task15() {
        System.out.println("\nЗадание 15");
        MyDate d = new MyDate(29, 2, 2024);
        System.out.println(d + " -> високосный: " + d.isLeapYear());
    }

    static void task16() {
        System.out.println("\nЗадание 16");
        Time t = new Time(23, 59, 58);
        t.addSeconds(5);
        System.out.println(t);
    }

    static void task17() {
        System.out.println("\nЗадание 17");
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.decrement();
        System.out.println(c);
    }

    static void task18() {
        System.out.println("\nЗадание 18");
        Pair<String, Integer> p = new Pair<>("Возраст", 25);
        System.out.println(p);
    }

    static void task19() {
        System.out.println("\nЗадание 19");
        Notebook n = new Notebook("Lenovo", 16, 512);
        System.out.println(n);
    }

    static void task20() {
        System.out.println("\nЗадание 20");
        Laptop l = new Laptop("HP", 32, 1024);
        System.out.println(l);
    }

    static void task21() {
        System.out.println("\nЗадание 21");
        Phone p = new Phone("Samsung", 4000);
        System.out.println(p);
    }

    static void task22() {
        System.out.println("\nЗадание 22");
        Fraction f = new Fraction(3, 9);
        System.out.println(f + " = " + f.reduce());
    }

    static void task23() {
        System.out.println("\nЗадание 23");
        ComplexNumber z = new ComplexNumber(3, 4);
        System.out.println(z + " -> модуль: " + z.module());
    }

    static void task24() {
        System.out.println("\nЗадание 24");
        Vector v = new Vector(3, 4);
        System.out.println("Длина вектора: " + v.length());
    }

    static void task25() {
        System.out.println("\nЗадание 25");
        House h = new House("Лесная 12", 120, 5);
        System.out.println(h);
    }

    static void task26() {
        System.out.println("\nЗадание 26");
        Computer c = new Computer("Dell", 80000);
        System.out.println(c);
    }

    static void task27() {
        System.out.println("\nЗадание 27");
        StudentGroup group = new StudentGroup();
        group.addStudent(new Student("Олег", 19, 8.5));
        group.addStudent(new Student("Марина", 20, 9.1));
        System.out.println(group);
    }

    static void task28() {
        System.out.println("\nЗадание 28");
        StackExample stack = new StackExample();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Поп: " + stack.pop() + ", размер: " + stack.size());
    }

    static void task29() {
        System.out.println("\nЗадание 29");
        QueueExample queue = new QueueExample();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Из очереди: " + queue.dequeue() + ", размер: " + queue.size());
    }

    static void task30() {
        System.out.println("\nЗадание 30");
        User user = new User("alex", "123456");
        System.out.println(user);
        user.changePassword("654321");
        System.out.println("Пароль изменён: " + user.getPassword());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String toString() {
            return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
        }
    }

    static class Car {
        private String brand;
        private String model;
        private int year;
        private int maxSpeed;

        public Car(String brand, String model, int year, int maxSpeed) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.maxSpeed = maxSpeed;
        }

        public String toString() {
            return "Car{brand='" + brand + "', model='" + model + "', year=" + year + ", maxSpeed=" + maxSpeed + "}";
        }
    }

    static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }

        public double perimeter() {
            return 2 * (width + height);
        }
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double circumference() {
            return 2 * Math.PI * radius;
        }
    }

    static class Student {
        private String name;
        private int age;
        private double averageScore;

        public Student(String name, int age, double averageScore) {
            this.name = name;
            this.age = age;
            this.averageScore = averageScore;
        }

        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", averageScore=" + averageScore + "}";
        }
    }

    static class BankAccount {
        private String number;
        private double balance;

        public BankAccount(String number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            }
        }

        public String toString() {
            return "BankAccount{number='" + number + "', balance=" + balance + "}";
        }
    }

    static class Employee {
        private String name;
        private String position;
        private double salary;

        public Employee(String name, String position, double salary) {
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public void raiseSalary(double percent) {
            salary += salary * percent / 100;
        }

        public String toString() {
            return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + "}";
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distanceTo(Point other) {
            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
        }
    }

    static class Triangle {
        private double a;
        private double b;
        private double c;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean isRightTriangle() {
            return Math.abs(a * a + b * b - c * c) < 1e-9
                    || Math.abs(a * a + c * c - b * b) < 1e-9
                    || Math.abs(b * b + c * c - a * a) < 1e-9;
        }
    }

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void meow() {
            System.out.println("Мяу!");
        }

        public void eat() {
            System.out.println("Кот ест.");
        }

        public String toString() {
            return "Cat{name='" + name + "', age=" + age + "}";
        }
    }

    static class Dog {
        private String name;
        private int age;
        private String breed;

        public Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public String toString() {
            return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
        }
    }

    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double totalPrice() {
            return price * quantity;
        }
    }

    static class Order {
        private String productName;
        private double price;
        private int count;

        public Order(String productName, double price, int count) {
            this.productName = productName;
            this.price = price;
            this.count = count;
        }

        public double total() {
            return price * count;
        }
    }

    static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public boolean isLeapYear() {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        public String toString() {
            return day + "." + month + "." + year;
        }
    }

    static class Time {
        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public void addSeconds(int seconds) {
            int total = hour * 3600 + minute * 60 + second + seconds;
            hour = (total / 3600) % 24;
            minute = (total % 3600) / 60;
            second = total % 60;
        }

        public String toString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }
    }

    static class Counter {
        private int count;

        public void increment() {
            count++;
        }

        public void decrement() {
            count--;
        }

        public String toString() {
            return "Counter{count=" + count + "}";
        }
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "Pair{key=" + key + ", value=" + value + "}";
        }
    }

    static class Notebook {
        private String brand;
        private int ram;
        private int storage;

        public Notebook(String brand, int ram, int storage) {
            this.brand = brand;
            this.ram = ram;
            this.storage = storage;
        }

        public String toString() {
            return "Notebook{brand='" + brand + "', ram=" + ram + ", storage=" + storage + "}";
        }
    }

    static class Laptop {
        private String brand;
        private int ram;
        private int hdd;

        public Laptop(String brand, int ram, int hdd) {
            this.brand = brand;
            this.ram = ram;
            this.hdd = hdd;
        }

        public String toString() {
            return "Laptop{brand='" + brand + "', ram=" + ram + ", hdd=" + hdd + "}";
        }
    }

    static class Phone {
        private String model;
        private int battery; 

        public Phone(String model, int battery) {
            this.model = model;
            this.battery = battery;
        }

        public String toString() {
            return "Phone{model='" + model + "', battery=" + battery + "}";
        }
    }

    static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public Fraction reduce() {
            int g = gcd(Math.abs(numerator), Math.abs(denominator));
            return new Fraction(numerator / g, denominator / g);
        }

        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }

        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    static class ComplexNumber {
        private double real;
        private double imag;

        public ComplexNumber(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public double module() {
            return Math.sqrt(real * real + imag * imag);
        }

        public String toString() {
            return real + "+" + imag + "i";
        }
    }

    static class Vector {
        private double x;
        private double y;

        public Vector(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double length() {
            return Math.sqrt(x * x + y * y);
        }
    }

    static class House {
        private String address;
        private int area;
        private int rooms;

        public House(String address, int area, int rooms) {
            this.address = address;
            this.area = area;
            this.rooms = rooms;
        }

        public String toString() {
            return "House{address='" + address + "', area=" + area + ", rooms=" + rooms + "}";
        }
    }

    static class Computer {
        private String brand;
        private double price;

        public Computer(String brand, double price) {
            this.brand = brand;
            this.price = price;
        }

        public String toString() {
            return "Computer{brand='" + brand + "', price=" + price + "}";
        }
    }

    static class StudentGroup {
        private java.util.ArrayList<Student> students = new java.util.ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public String toString() {
            return "StudentGroup{students=" + students + "}";
        }
    }

    static class StackExample {
        private java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        public void push(int value) {
            list.add(value);
        }

        public int pop() {
            return list.remove(list.size() - 1);
        }

        public int size() {
            return list.size();
        }
    }

    static class QueueExample {
        private java.util.ArrayList<String> list = new java.util.ArrayList<>();

        public void enqueue(String value) {
            list.add(value);
        }

        public String dequeue() {
            return list.remove(0);
        }

        public int size() {
            return list.size();
        }
    }

    static class User {
        private String login;
        private String password;

        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public void changePassword(String newPassword) {
            this.password = newPassword;
        }

        public String getPassword() {
            return password;
        }

        public String toString() {
            return "User{login='" + login + "', password='" + password + "'}";
        }
    }
}
