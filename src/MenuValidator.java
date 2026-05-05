import java.util.Scanner;

public class MenuValidator {
    int num;

    public int menuValidation() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Введеное значение не является числом");
            num = 6;
        } else {
            num = scanner.nextInt();
        }
        if (num < 0) {
            System.out.println("Введеное значение не может быть отрицательным");
            num = 6;
        }
        return num;
    }
}