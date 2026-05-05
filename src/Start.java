public class Start implements Menu {

    @Override
    public void openMenu() {
        int num = 10;
        String str = "Выбирите тип объекта которым будет заполнен массив:%n1. Bus%n2. User%n3. Student%n4. Car%n5. Barrel%n0. Выход из программы%n";
        String str1 = "Выбирите способ которым будет заполнен массив:%n1. Заполнить из файла%n2. Заполнить в ручную%n3. Заполнить рандомно%n4. Вернуться назад%n0. Выйти из программы%n";
        String str2 = "Выбирите поле для сортировки:";
        String str3 = "%n1. number%n2. model%n3. mileage%n4. Сортировка по доп.заданию%n0. Выйти в главное меню%n";
        String str4 = "%n1. name%n2. password%n3. email%n4. Сортировка по доп.заданию%n0. Выйти в главное меню%n";
        String str5 = "%n1. groupNumber%n2. averageScore%n3. cardNumber%n4. Сортировка по доп.заданию%n0. Выйти в главное меню%n";
        String str6 = "%n1. power%n2. model%n3. yearOfProduction%n4. Сортировка по доп.заданию%n0. Выйти в главное меню%n";
        String str7 = "%n1. volume%n2. storedMaterial%n3. materialIsMade%n4. Сортировка по доп.заданию%n0. Выйти в главное меню%n";

        while (num != 0) {
            System.out.printf(str);
            MenuValidator validator = new MenuValidator();
            num = validator.menuValidation();
            switch (num) {
                case (1):
                    System.out.printf(str1);
                    num = validator.menuValidation();
                    MenuBus menuBus = new MenuBus(str2, str3, num);
                    menuBus.openMenu();
                    break;
                case (2):
                    System.out.printf(str1);
                    num = validator.menuValidation();
                    MenuUser menuUser = new MenuUser(str2, str4, num);
                    menuUser.openMenu();
                    break;
                case (3):
                    System.out.printf(str1);
                    num = validator.menuValidation();
                    MenuStudent menuStudent = new MenuStudent(str2, str5, num);
                    menuStudent.openMenu();
                    break;
                case (4):
                    System.out.printf(str1);
                    num = validator.menuValidation();
                    MenuCar menuCar = new MenuCar(str2, str6, num);
                    menuCar.openMenu();
                    break;
                case (5):
                    System.out.printf(str1);
                    num = validator.menuValidation();
                    MenuBarrel menuBarrel = new MenuBarrel(str2, str7, num);
                    menuBarrel.openMenu();
                    break;
                case (0):
                    break;
                default:
                    System.out.println("Неверно введено значение");
                    break;
            }
        }
    }
}