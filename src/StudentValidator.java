import java.util.Arrays;
import java.util.Scanner;

public class StudentValidator implements Validator {

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
            sorter.sort(new ArrayFromFile().readStudentsFile(), new SortStrategyStudent.SortByGroupNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromFile().readStudentsFile(), new SortStrategyStudent.SortByAverageScore());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromFile().readStudentsFile(), new SortStrategyStudent.SortByCardNumber());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю groupNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromFile().readStudentsFile(), "groupNumber")));
            System.out.println("Сортировка по полю averageScore");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromFile().readStudentsFile(), "averageScore")));
            System.out.println("Сортировка по полю cardNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromFile().readStudentsFile(), "cardNumber")));
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
            sorter.sort(new ArrayFromConsole().inputStudentConsole(), new SortStrategyStudent.SortByGroupNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromConsole().inputStudentConsole(), new SortStrategyStudent.SortByAverageScore());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromConsole().inputStudentConsole(), new SortStrategyStudent.SortByCardNumber());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю groupNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromConsole().inputStudentConsole(), "groupNumber")));
            System.out.println("Сортировка по полю averageScore");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromConsole().inputStudentConsole(), "averageScore")));
            System.out.println("Сортировка по полю cardNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromConsole().inputStudentConsole(), "cardNumber")));
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
            sorter.sort(new ArrayFromRandom().randomStudent(), new SortStrategyStudent.SortByGroupNumber());
        }
        if (num == 2) {
            sorter.sort(new ArrayFromRandom().randomStudent(), new SortStrategyStudent.SortByAverageScore());
        }
        if (num == 3) {
            sorter.sort(new ArrayFromRandom().randomStudent(), new SortStrategyStudent.SortByCardNumber());
        }
        if (num == 4) {
            AdditionalTask1 additionalTask1 = new AdditionalTask1();
            System.out.println("Сортировка по полю groupNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromRandom().randomStudent(), "groupNumber")));
            System.out.println("Сортировка по полю averageScore");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromRandom().randomStudent(), "averageScore")));
            System.out.println("Сортировка по полю cardNumber");
            System.out.println(Arrays.toString(additionalTask1.sortedStudents(new ArrayFromRandom().randomStudent(), "cardNumber")));
        }
        return num;
    }
}