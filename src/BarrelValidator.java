import java.util.Arrays;
import java.util.Scanner;

public class BarrelValidator implements Validator {

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
            sorter.sort(new ArrayFromFile().readBarrelsFile(), new SortStrategyBarrel.SortByVolume());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromFile().readBarrelsFile(), new SortStrategyBarrel.SortByStoredMaterial());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromFile().readBarrelsFile(), new SortStrategyBarrel.SortByMaterialIsMade());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю volume");
            System.out.println(Arrays.toString(additionalTask1.sortedBarrels(new ArrayFromFile().readBarrelsFile(), "volume")));
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
            sorter.sort(new ArrayFromConsole().inputBarrelConsole(), new SortStrategyBarrel.SortByVolume());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromConsole().inputBarrelConsole(), new SortStrategyBarrel.SortByStoredMaterial());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromConsole().inputBarrelConsole(), new SortStrategyBarrel.SortByMaterialIsMade());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю volume");
            System.out.println(Arrays.toString(additionalTask1.sortedBarrels(new ArrayFromConsole().inputBarrelConsole(), "volume")));
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
            sorter.sort(new ArrayFromRandom().randomBarrels(), new SortStrategyBarrel.SortByVolume());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromRandom().randomBarrels(), new SortStrategyBarrel.SortByStoredMaterial());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomBarrels(), new SortStrategyBarrel.SortByMaterialIsMade());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю volume");
            System.out.println(Arrays.toString(additionalTask1.sortedBarrels(new ArrayFromRandom().randomBarrels(), "volume")));
        }
        return num;
    }
}