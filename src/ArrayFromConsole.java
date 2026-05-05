import java.util.Scanner;

public class ArrayFromConsole {

    public Bus[] inputBusConsole() {
        Scanner scanner = new Scanner(System.in);
        ValidatorFromConsole validatorFromConsole = new ValidatorFromConsole();
        System.out.println("Введите количество автобусов");
        int size = validatorFromConsole.validation();
        Bus[] buses = new Bus[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите number");
            int number = validatorFromConsole.validation();
            System.out.println("Введите model");
            String model = scanner.next();
            System.out.println("Введите mileage");
            int mileage = validatorFromConsole.validation();
            buses[i] = new Bus.Builder().setNumber(number).setModel(model).setMileage(mileage).build();
        }
        return buses;
    }

    public User[] inputUserConsole() {
        Scanner scanner = new Scanner(System.in);
        ValidatorFromConsole validatorFromConsole = new ValidatorFromConsole();
        System.out.println("Введите количество пользователей");
        int size = validatorFromConsole.validation();
        User[] users = new User[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите name");
            String name = scanner.next();
            System.out.println("Введите password");
            int password = validatorFromConsole.validation();
            System.out.println("Введите email");
            String email = scanner.next();
            users[i] = new User.Builder().setName(name).setPassword(password).setEmail(email).build();
        }
        return users;
    }

    public Student[] inputStudentConsole() {
        ValidatorFromConsole validatorFromConsole = new ValidatorFromConsole();
        System.out.println("Введите количество студентов");
        int size = validatorFromConsole.validation();
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите groupNumber");
            int groupNumber = validatorFromConsole.validation();
            System.out.println("Введите averageScore");
            int averageScore = validatorFromConsole.validation();
            System.out.println("Введите cardNumber");
            int cardNumber = validatorFromConsole.validation();
            students[i] = new Student.Builder().setGroupNumber(groupNumber).setAverageScore(averageScore).setCardNumber(cardNumber).build();
        }
        return students;
    }

    public Car[] inputCarConsole() {
        Scanner scanner = new Scanner(System.in);
        ValidatorFromConsole validatorFromConsole = new ValidatorFromConsole();
        System.out.println("Введите количество автомобилей");
        int size = validatorFromConsole.validation();
        Car[] cars = new Car[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите power");
            int power = validatorFromConsole.validation();
            System.out.println("Введите model");
            String model = scanner.next();
            System.out.println("Введите yearOfProduction");
            int yearOfProduction = validatorFromConsole.validation();
            cars[i] = new Car.Builder().setPower(power).setModel(model).setYearOfProduction(yearOfProduction).build();
        }
        return cars;
    }

    public Barrel[] inputBarrelConsole() {
        Scanner scanner = new Scanner(System.in);
        ValidatorFromConsole validatorFromConsole = new ValidatorFromConsole();
        System.out.println("Введите количество бочек");
        int size = validatorFromConsole.validation();
        Barrel[] barrels = new Barrel[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите volume");
            int volume = validatorFromConsole.validation();
            System.out.println("Введите storedMaterial");
            String storedMaterial = scanner.next();
            System.out.println("Введите materialIsMade");
            String materialIsMade = scanner.next();
            barrels[i] = new Barrel.Builder().setVolume(volume).setStoredMaterial(storedMaterial).setMaterialIsMade(materialIsMade).build();
        }
        return barrels;
    }

    public class ValidatorFromConsole {
        public int validation() {
            Scanner scanner = new Scanner(System.in);
            int num;
            if (!scanner.hasNextInt()) {
                System.out.println("Введеное значение не является числом");
                num = 0;
            } else {
                num = scanner.nextInt();
            }
            if (num < 0) {
                System.out.println("Введеное значение не может быть отрицательным");
                num = 0;
            }
            return num;
        }
    }
}