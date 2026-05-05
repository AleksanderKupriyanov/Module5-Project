import java.util.Arrays;
import java.util.Scanner;

public class CarValidator implements Validator {

    @Override
    public int validation() {
        int num;
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        if (!scanner.hasNextInt()) {
            System.out.println("Введеное значение не является числом");
            num = 0;
        } else {
            num = scanner.nextInt();
        }
        if (num < 0 || num > 4) {
            System.out.println("Введеное значение не может быть отрицательным и должно быть от 0 до 4");
            num = 0;
        }
        if (num == 1) {
            sorter.sort(new ArrayFromFile().readCarsFile(), new SortStrategyCar.SortByPower());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromFile().readCarsFile(), new SortStrategyCar.SortByModelCar());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromFile().readCarsFile(), new SortStrategyCar.SortByYearOfProduction());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю power");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromFile().readCarsFile(), "power")));
            System.out.println("yearOfProduction");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromFile().readCarsFile(), "yearOfProduction")));
        }
        return num;
    }

    @Override
    public int validation2() {
        int num;
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        if (!scanner.hasNextInt()) {
            System.out.println("Введеное значение не является числом");
            num = 0;
        } else {
            num = scanner.nextInt();
        }
        if (num < 0 || num > 4) {
            System.out.println("Введеное значение не может быть отрицательным и должно быть от 0 до 4");
            num = 0;
        }
        if (num == 1) {
            sorter.sort(new ArrayFromConsole().inputCarConsole(), new SortStrategyCar.SortByPower());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromConsole().inputCarConsole(), new SortStrategyCar.SortByModelCar());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromConsole().inputCarConsole(), new SortStrategyCar.SortByYearOfProduction());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю power");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromConsole().inputCarConsole(), "power")));
            System.out.println("yearOfProduction");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromConsole().inputCarConsole(), "yearOfProduction")));
        }
        return num;
    }

    @Override
    public int validation3() {
        int num;
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        if (!scanner.hasNextInt()) {
            System.out.println("Введеное значение не является числом");
            num = 0;
        } else {
            num = scanner.nextInt();
        }
        if (num < 0 || num > 4) {
            System.out.println("Введеное значение не может быть отрицательным и должно быть от 0 до 4");
            num = 0;
        }
        if (num == 1) {
            sorter.sort(new ArrayFromRandom().randomCars(), new SortStrategyCar.SortByPower());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromRandom().randomCars(), new SortStrategyCar.SortByModelCar());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomCars(), new SortStrategyCar.SortByYearOfProduction());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю power");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromRandom().randomCars(), "power")));
            System.out.println("yearOfProduction");
            System.out.println(Arrays.toString(additionalTask1.sortedCars(new ArrayFromRandom().randomCars(), "yearOfProduction")));
        }
        return num;
    }
}