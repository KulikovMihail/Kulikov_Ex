import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 public class Main {

    // 1. Класс "Человек"
    static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void printInfo() {
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age);
            System.out.println("Пол: " + gender);
        }

        public void increaseAge() {
            age++;
        }

        public void changeName(String newName) {
            name = newName;
        }
    }

    // 2. Наследование: Класс "Работник" и "Менеджер"
    static class Worker extends Person {
        private double salary;

        public Worker(String name, int age, String gender, double salary) {
            super(name, age, gender);
            this.salary = salary;
        }
    }

    static class Manager extends Worker {
        private Worker[] subordinates;

        public Manager(String name, int age, String gender, double salary, Worker[] subordinates) {
            super(name, age, gender, salary);
            this.subordinates = subordinates;
        }
    }

    // 3. Полиморфизм: Животные
    static interface Animal {
        void makeSound();
    }

    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Гав-гав!");
        }
    }

    static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Мяу-мяу!");
        }
    }

    static class Cow implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Му-му!");
        }
    }

    // 4. Абстрактный класс "Транспорт"
    abstract static class Transport {
        abstract void move();
    }

    static class Car extends Transport {
        @Override
        void move() {
            System.out.println("Машина едет");
        }
    }

    static class Bike extends Transport {
        @Override
        void move() {
            System.out.println("Велосипед едет");
        }
    }

    // 5. Класс "Книга" и "Библиотека"
    static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
    }

    static class Library {
        private List<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public List<Book> findBooksByAuthor(String author) {
            List<Book> foundBooks = new ArrayList<>();
            for (Book book : books) {
                if (book.author.equals(author)) {
                    foundBooks.add(book);
                }
            }
            return foundBooks;
        }

        public List<Book> findBooksByYear(int year) {
            List<Book> foundBooks = new ArrayList<>();
            for (Book book : books) {
                if (book.year == year) {
                    foundBooks.add(book);
                }
            }
            return foundBooks;
        }
    }

    // 6. Инкапсуляция: Банк
    static class BankAccount {
        private int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Пополнение: " + amount + " баланс: " + balance);
            } else {
                System.out.println("Неверная сумма пополнения");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Снятие: " + amount + " баланс: " + balance);
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    // 7. Счетчик объектов
    static class Counter {
        private static int objectCount = 0;

        public Counter() {
            objectCount++;
        }

        public static int getObjectCount() {
            return objectCount;
        }
    }

    // 8. Площадь фигур
    abstract static class Shape {
        abstract double getArea();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double getArea() {
            return width * height;
        }
    }

    // 9. Наследование: Животные и их движения
    static class animal {
        void move() {
            System.out.println("Движется");
        }
    }

    static class Fish extends animal {
        @Override
        void move() {
            System.out.println("Рыба плавает");
        }
    }

    static class Bird extends animal {
        @Override
        void move() {
            System.out.println("Птица летает");
        }
    }

    static class dog extends animal {
        @Override
        void move() {
            System.out.println("Собака бегает");
        }
    }

     // 10. Работа с коллекциями: Университет
     static class Student {
         private String Name;
         private String group;
         private double grade;

         public Student(String name, String group, double grade) {
             this.Name = name;
             this.group = group;
             this.grade = grade;
         }

         public String getName() {
             return Name;
         }
     }

     static class University {
         private List<Student> students;

         public University() {
             students = new ArrayList<>();
         }

         public void addStudent(Student student) {
             students.add(student);
         }

         public void sortByName() {
             students.sort(Comparator.comparing(Student::getName));
         }

         public List<Student> filterByGrade(double minGrade) {
             List<Student> filteredStudents = new ArrayList<>();
             for (Student student : students) {
                 if (student.grade >= minGrade) {
                     filteredStudents.add(student);
                 }
             }
             return filteredStudents;
         }
     }

     // 11. Класс "Магазин"
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    static class Store {
        private List<Product> products;

        public Store() {
            products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(String name) {
            products.removeIf(product -> product.name.equals(name));
        }

        public Product findProductByName(String name) {
            for (Product product : products) {
                if (product.name.equals(name)) {
                    return product;
                }
            }
            return null;
        }
    }

    // 12. Интерфейс "Платежная система"
    interface PaymentSystem {
        void pay(double amount);
        void refund(double amount);
    }

    static class CreditCard implements PaymentSystem {
        @Override
        public void pay(double amount) {
            System.out.println("Оплата по кредитной карте: " + amount);
        }

        @Override
        public void refund(double amount) {
            System.out.println("Возврат по кредитной карте: " + amount);
        }
    }

    static class PayPal implements PaymentSystem {
        @Override
        public void pay(double amount) {
            System.out.println("Оплата через PayPal: " + amount);
        }

        @Override
        public void refund(double amount) {
            System.out.println("Возврат через PayPal: " + amount);
        }
    }

    // 13. Генерация уникальных идентификаторов
    static class UniqueID {
        private static int nextID = 0;

        public static int generateID() {
            return nextID++;
        }
    }

    // 14. Класс "Точка" и "Прямоугольник"
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class rectangle {
        private Point topLefts;
        private Point bottomRights;

        public rectangle(Point topLeft, Point bottomRight) {
            this.topLefts = topLeft;
            this.bottomRights = bottomRight;
        }

        public int getArea() {
            int width = bottomRights.getX() - topLefts.getX();
            int height = topLefts.getY() - bottomRights.getY();
            return width * height;
        }
    }

    // 15. Комплексные числа
    static class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(real + other.real, imaginary + other.imaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            return new ComplexNumber(real - other.real, imaginary - other.imaginary);
        }

        public ComplexNumber multiply(ComplexNumber other) {
            return new ComplexNumber(
                    real * other.real - imaginary * other.imaginary,
                    real * other.imaginary + imaginary * other.real);
        }

        public ComplexNumber divide(ComplexNumber other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            return new ComplexNumber(
                    (real * other.real + imaginary * other.imaginary) / denominator,
                    (imaginary * other.real - real * other.imaginary) / denominator);
        }
    }

    // 16. Перегрузка операторов: Матрица
    static class Matrix {
        private int[][] data;

        public Matrix(int[][] data) {
            this.data = data;
        }

        public Matrix add(Matrix other) {
            if (data.length != other.data.length || data[0].length != other.data[0].length) {
                throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры");
            }
            int[][] result = new int[data.length][data[0].length];
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    result[i][j] = data[i][j] + other.data[i][j];
                }
            }
            return new Matrix(result);
        }

        public Matrix multiply(Matrix other) {
            if (data[0].length != other.data.length) {
                throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы");
            }
            int[][] result = new int[data.length][other.data[0].length];
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < other.data[0].length; j++) {
                    for (int k = 0; k < data[0].length; k++) {
                        result[i][j] += data[i][k] * other.data[k][j];
                    }
                }
            }
            return new Matrix(result);
        }
    }

    // 17. Создание игры с использованием ООП
    static class Player {
        private String nick;
        private int health;
        private Weapon weapon;

        public Player(String name, int health, Weapon weapon) {
            this.nick = name;
            this.health = health;
            this.weapon = weapon;
        }

        public void attack(Enemy enemy) {
            int damage = weapon.getDamage();
            enemy.health -= damage;
            System.out.println(nick + " атакует " + enemy.enemy + " (" + damage + " урона)");
        }
    }

    static class Enemy {
        private String enemy;
        private int health;

        public Enemy(String name, int health) {
            this.enemy = name;
            this.health = health;
        }
    }

    static class Weapon {
        private String w_name;
        private int damage;

        public Weapon(String name, int damage) {
            this.w_name = name;
            this.damage = damage;
        }
        public int getDamage() {
            return damage;
        }
    }


    // 18. Автоматизированная система заказов
    static class Order {
        private int orderID;
        private Customer customer;
        private List<Product> products;

        public Order(int orderID, Customer customer) {
            this.orderID = orderID;
            this.customer = customer;
            products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Product product : products) {
                totalPrice += product.price * product.quantity;
            }
            return totalPrice;
        }
    }

    static class Customer {
        private String name;
        private String address;

        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }

    // 19. Наследование: Электроника
    static class Device {
        private String brand;

        public Device(String brand) {
            this.brand = brand;
        }

        public void turnOn() {
            System.out.println("Включение устройства");
        }

        public void turnOff() {
            System.out.println("Выключение устройства");
        }
    }

    static class Smartphone extends Device {
        public Smartphone(String brand) {
            super(brand);
        }

        public void takePhoto() {
            System.out.println("Сделана фотография");
        }
    }

    static class Laptop extends Device {
        public Laptop(String brand) {
            super(brand);
        }

        public void openDocument() {
            System.out.println("Открыть документ");
        }
    }

    // 20. Игра "Крестики-нолики"
    static class Game {
        private char[][] board;
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public Game(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;
            board = new char[3][3];
            currentPlayer = player1;
            initializeBoard();
        }

        private void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        public void printBoard() {
            for (int i = 0; i < 3; i++) {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) {
                    System.out.println("---------");
                }
            }
        }

        public boolean isGameOver() {
            if (checkRows() || checkColumns() || checkDiagonals()) {
                return true;
            }
            if (isBoardFull()) {
                return true;
            }
            return false;
        }

        public void makeMove(int row, int col) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer.weapon.w_name.charAt(0);
                switchPlayer();
            } else {
                System.out.println("Неверный ход");
            }
        }

        private void switchPlayer() {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }

        private boolean checkRows() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkColumns() {
            for (int i = 0; i < 3; i++) {
                if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkDiagonals() {
            if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                return true;
            }
            if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
                return true;
            }
            return false;
        }

        private boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        // 1. Класс "Человек"
        Person person = new Person("Иван", 30, "Мужской");
        person.printInfo();
        person.increaseAge();
        person.printInfo();

        // 2. Наследование: Класс "Работник" и "Менеджер"
        Worker worker1 = new Worker("Петр", 25, "Мужской", 50000);
        Worker worker2 = new Worker("Ольга", 28, "Женский", 45000);
        Worker[] subordinates = {worker1, worker2};
        Manager manager = new Manager("Сергей", 40, "Мужской", 80000, subordinates);

        // 3. Полиморфизм: Животные
        Animal[] Animals = {new Dog(), new Cat(), new Cow()};
        for (Main.Animal Animal : Animals) {
            Animal.makeSound();
        }

        // 4. Абстрактный класс "Транспорт"
        Car car = new Car();
        Bike bike = new Bike();
        car.move();
        bike.move();

        // 5. Класс "Книга" и "Библиотека"
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 1866);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        List<Book> foundBooks = library.findBooksByAuthor("Лев Толстой");
        for (Book book : foundBooks) {
            System.out.println(book.title);
        }

        // 6. Инкапсуляция: Банк
        BankAccount account = new BankAccount(1234567890, 1000);
        account.deposit(500);
        account.withdraw(200);

        // 7. Счетчик объектов
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        System.out.println("Количество объектов Counter: " + Counter.getObjectCount());

        // 8. Площадь фигур
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        // 9. Наследование: Животные и их движения
        Fish fish = new Fish();
        Bird bird = new Bird();
        dog dog = new dog();
        fish.move();
        bird.move();
        dog.move();

        // 10. Работа с коллекциями: Университет
        Student student1 = new Student("Иван", "И-101", 4.5);
        Student student2 = new Student("Мария", "И-102", 3.8);
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.sortByName();
        List<Student> goodStudents = university.filterByGrade(4.0);
        for (Student student : goodStudents) {
            System.out.println(student.Name);
        }

        // 11. Класс "Магазин"
        Product product1 = new Product("Молоко", 1.5, 10);
        Product product2 = new Product("Хлеб", 1.2, 5);
        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        Product foundProduct = store.findProductByName("Хлеб");
        if (foundProduct != null) {
            System.out.println("Цена хлеба: " + foundProduct.price);
        }

        // 12. Интерфейс "Платежная система"
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        creditCard.pay(100);
        payPal.refund(50);

        // 13. Генерация уникальных идентификаторов
        System.out.println("Уникальный ID: " + UniqueID.generateID());
        System.out.println("Уникальный ID: " + UniqueID.generateID());

        // 14. Класс "Точка" и "Прямоугольник"
        Point topLeft = new Point(1, 2);
        Point bottomRight = new Point(5, 1);
        rectangle rectangle1 = new rectangle(topLeft, bottomRight);
        System.out.println("Площадь прямоугольника: " + rectangle1.getArea());

        // 15. Комплексные числа
        ComplexNumber complex1 = new ComplexNumber(2, 3);
        ComplexNumber complex2 = new ComplexNumber(1, -2);
        ComplexNumber sum = complex1.add(complex2);
        System.out.println("Сумма: " + sum.real + " + " + sum.imaginary + "i");

        // 16. Перегрузка операторов: Матрица
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix sumMatrix = matrix1.add(matrix2);
        Matrix productMatrix = matrix1.multiply(matrix2);

        // 17. Создание игры с использованием ООП
        Weapon sword = new Weapon("Меч", 10);
        Player player = new Player("Герой", 100, sword);
        Enemy goblin = new Enemy("Гоблин", 50);
        player.attack(goblin);
        System.out.println("Здоровье гоблина: " + goblin.health);

        // 18. Автоматизированная система заказов
        Customer customer = new Customer("Иван Иванов", "ул. Ленина, д. 1");
        Order order = new Order(1, customer);
        Product milk = new Product("Молоко", 1.5, 2);
        Product bread = new Product("Хлеб", 1.2, 1);
        order.addProduct(milk);
        order.addProduct(bread);
        System.out.println("Общая стоимость заказа: " + order.getTotalPrice());

        // 19. Наследование: Электроника
        Smartphone smartphone = new Smartphone("Samsung");
        Laptop laptop = new Laptop("Apple");
        smartphone.takePhoto();
        laptop.openDocument();

        // 20. Игра "Крестики-нолики"
        Player playerX = new Player("X", 100, new Weapon("X", 1));
        Player playerO = new Player("O", 100, new Weapon("O", 1));
        Game ticTacToe = new Game(playerX, playerO);

        while (!ticTacToe.isGameOver()) {
            ticTacToe.printBoard();
            System.out.println("Ход " + ticTacToe.currentPlayer.nick);
        }

        ticTacToe.printBoard();

        if (ticTacToe.isBoardFull()) {
            System.out.println("Ничья!");
        } else {
            System.out.println(ticTacToe.currentPlayer.nick + " победил!");
        }
    }
}
