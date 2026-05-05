import java.util.Arrays;
import java.util.Scanner;

public class UserValidator implements Validator {

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
            sorter.sort(new ArrayFromFile().readUsersFile(), new SortStrategyUser.SortByName());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromFile().readUsersFile(), new SortStrategyUser.SortByPassword());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomUsers(), new SortStrategyUser.SortByEmail());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю password");
            System.out.println(Arrays.toString(additionalTask1.sortedUsers(new ArrayFromFile().readUsersFile(), "password")));
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
            sorter.sort(new ArrayFromConsole().inputUserConsole(), new SortStrategyUser.SortByName());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromConsole().inputUserConsole(), new SortStrategyUser.SortByPassword());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromConsole().inputUserConsole(), new SortStrategyUser.SortByEmail());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю password");
            System.out.println(Arrays.toString(additionalTask1.sortedUsers(new ArrayFromConsole().inputUserConsole(), "password")));
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
            sorter.sort(new ArrayFromRandom().randomUsers(), new SortStrategyUser.SortByName());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromRandom().randomUsers(), new SortStrategyUser.SortByPassword());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomUsers(), new SortStrategyUser.SortByEmail());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю password");
            System.out.println(Arrays.toString(additionalTask1.sortedUsers(new ArrayFromRandom().randomUsers(), "password")));
        }
        return num;
    }
}