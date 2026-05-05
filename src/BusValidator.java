import java.util.Arrays;
import java.util.Scanner;

public class BusValidator implements Validator {

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
            sorter.sort(new ArrayFromFile().readBusesFile(), new SortStrategyBus.SortByNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromFile().readBusesFile(), new SortStrategyBus.SortByModelBus());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromFile().readBusesFile(), new SortStrategyBus.SortByMileage());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю number");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromFile().readBusesFile(), "number")));
            System.out.println("Сортировка по полю mileage");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromFile().readBusesFile(), "mileage")));
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
            sorter.sort(new ArrayFromConsole().inputBusConsole(), new SortStrategyBus.SortByNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromConsole().inputBusConsole(), new SortStrategyBus.SortByModelBus());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromConsole().inputBusConsole(), new SortStrategyBus.SortByMileage());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю number");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromConsole().inputBusConsole(), "number")));
            System.out.println("Сортировка по полю mileage");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromConsole().inputBusConsole(), "mileage")));
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
            sorter.sort(new ArrayFromRandom().randomBuses(), new SortStrategyBus.SortByNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromRandom().randomBuses(), new SortStrategyBus.SortByModelBus());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomBuses(), new SortStrategyBus.SortByMileage());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю number");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromRandom().randomBuses(), "number")));
            System.out.println("Сортировка по полю mileage");
            System.out.println(Arrays.toString(additionalTask1.sortedBuses(new ArrayFromRandom().randomBuses(), "mileage")));
        }
        return num;
    }
}