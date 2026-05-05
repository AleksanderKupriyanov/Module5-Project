import java.util.Scanner;

public class ArrayFromRandom {

    public Bus[] randomBuses() {
        System.out.println("Введите количество автобусов для случайного заполнения: ");
        int size = new ValidatorFromRandom().validation();
        Bus[] buses = new Bus[size];
        for (int i = 0; i < size; i++) {
            int number = i + 1;
            String model = "Model" + (i + 1);
            int mileage = (int) (Math.random() * 100000);
            buses[i] = new Bus.Builder().setNumber(number).setModel(model).setMileage(mileage).build();
        }
        return buses;
    }

    public User[] randomUsers() {
        System.out.println("Введите количество пользователей для случайного заполнения: ");
        int size = new ValidatorFromRandom().validation();
        User[] users = new User[size];
        for (int i = 0; i < size; i++) {
            String name = "Name" + (i + 1);
            int password = (int) (Math.random() * 100);
            String email = "Email" + (i + 1) + "@.com";
            users[i] = new User.Builder().setName(name).setPassword(password).setEmail(email).build();
        }
        return users;
    }

    public Student[] randomStudent() {
        System.out.println("Введите количество студентов для случайного заполнения: ");
        int size = new ValidatorFromRandom().validation();
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            int groupNumber = i + 12;
            int averageScore = (int) (Math.random() * 1);
            int cardNumber = (int) (Math.random() * 134);
            students[i] = new Student.Builder().setGroupNumber(groupNumber).setAverageScore(averageScore).setCardNumber(cardNumber).build();
        }
        return students;
    }

    public Car[] randomCars() {
        System.out.println("Введите количество автомобилей для случайного заполнения: ");
        int size = new ValidatorFromRandom().validation();
        Car[] cars = new Car[size];
        for (int i = 0; i < size; i++) {
            int power = (int) (Math.random() * 10);
            String model = "Model" + (i + 1);
            int yearOfProduction = (int) (Math.random() + 1996);
            cars[i] = new Car.Builder().setPower(power).setModel(model).setYearOfProduction(yearOfProduction).build();
        }
        return cars;
    }

    public Barrel[] randomBarrels() {
        System.out.println("Введите количество бочек для случайного заполнения: ");
        int size = new ValidatorFromRandom().validation();
        Barrel[] barrels = new Barrel[size];
        for (int i = 0; i < size; i++) {
            int volume = (int) (Math.random() * 100); // Случайный пробег
            String storedMaterial = "Material" + (i + 2);
            String materialIsMade = "Material" + (i + 3);
            barrels[i] = new Barrel.Builder().setVolume(volume).setStoredMaterial(storedMaterial).setMaterialIsMade(materialIsMade).build();
        }
        return barrels;
    }

    public class ValidatorFromRandom {
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